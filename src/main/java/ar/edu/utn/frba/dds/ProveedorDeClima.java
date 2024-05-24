package ar.edu.utn.frba.dds;

import java.math.BigDecimal;

public interface ProveedorDeClima {
  BigDecimal getTemperatura(String localidad);
}
