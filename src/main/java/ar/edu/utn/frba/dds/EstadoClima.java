package ar.edu.utn.frba.dds;

import java.math.BigDecimal;

public class EstadoClima {
  BigDecimal temperatura;
  BigDecimal humedad;

  public EstadoClima(BigDecimal temperatura, BigDecimal humedad) {
    this.temperatura = temperatura;
  }

  public BigDecimal getTemperatura() {return temperatura;}
  public BigDecimal getHumedad() {return humedad;}
}
