package ar.edu.utn.frba.dds;

import java.math.BigDecimal;

public class ProveedorDeClimaMock  implements ProveedorDeClima{
  BigDecimal temperatura;

  public BigDecimal getTemperatura(String localidad) {
    return temperatura;
  }

  public void setTemperatura(BigDecimal temperatura) {
    this.temperatura = temperatura;
  }

}
