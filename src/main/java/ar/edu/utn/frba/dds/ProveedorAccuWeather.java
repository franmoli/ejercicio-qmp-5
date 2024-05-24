package ar.edu.utn.frba.dds;

import accuWeatherApi.AccuWeatherAPI;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProveedorAccuWeather implements ProveedorDeClima{

  private AccuWeatherAPI api;

  public ProveedorAccuWeather(AccuWeatherAPI api){
    this.api = api;
  }

  public BigDecimal getTemperatura(String localidad) {
    Map<String, Object> clima = consultarApi(localidad);
    Map<String, Object> temperature = (Map<String, Object>) clima.get("Temperature");

    return BigDecimal.valueOf(temperature.get("Unit").equals("F") ?
        (Double) temperature.get("Value") * 5/9 : (Double) temperature.get("Value"));
  }

  private Map<String, Object> consultarApi(String localidad) {
    return this.api.getWeather(localidad).get(0);
  }
}
