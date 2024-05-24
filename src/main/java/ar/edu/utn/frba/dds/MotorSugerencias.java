package ar.edu.utn.frba.dds;

import java.math.BigDecimal;
import java.util.List;

public interface MotorSugerencias {
  public List<Atuendo> generarSugerencias(List<Prenda> prendas, Usuario usuario,
                                          BigDecimal temperatura);
}
