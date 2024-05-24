package ar.edu.utn.frba.dds;

import com.google.common.collect.Sets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MotorSugerenciasSegunClima implements MotorSugerencias {

  public List<Atuendo> generarSugerencias(List<Prenda> prendas, Usuario usuario,
                                          BigDecimal temperatura) {

    List<Prenda> prendasValidas =
        prendas.stream().filter(p -> p.temperaturaMaxima.compareTo(temperatura) > 0).toList();

    for (Prenda prenda : prendasValidas){
      System.out.println("Prenda: " + prenda.tipo);
    }

    List<Prenda> prendasSuperiores =
        prendasValidas.stream().filter(p -> p.tipo.getCategoria() == CategoriaPrenda.PARTE_SUPERIOR)
            .toList();
    List<Prenda> prendasInferiores =
        prendasValidas.stream().filter(p -> p.tipo.getCategoria() == CategoriaPrenda.PARTE_INFERIOR)
            .toList();
    List<Prenda> prendasCalzado =
        prendasValidas.stream().filter(p -> p.tipo.getCategoria() == CategoriaPrenda.CALZADO)
            .toList();

    Set<Prenda> setSuperiores = new HashSet<>(prendasSuperiores);
    Set<Prenda> setInferiores = new HashSet<>(prendasInferiores);
    Set<Prenda> setCalzado = new HashSet<>(prendasCalzado);
    Set<List<Prenda>> cartesianProduct = Sets.cartesianProduct(setSuperiores, setInferiores,
        setCalzado);

    return cartesianProduct.stream().map(comb -> new Atuendo(comb.get(0),
            comb.get(1),
            comb.get(2)))
        .toList();
  }


}
