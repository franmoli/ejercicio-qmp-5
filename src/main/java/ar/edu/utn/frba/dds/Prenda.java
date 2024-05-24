package ar.edu.utn.frba.dds;

import java.math.BigDecimal;

public class Prenda {
  TipoDePrenda tipo;
  Material material;
  Colores colorPrincipal;
  Colores colorSecundario;
  Trama trama;
  Formalidad formalidad;
  BigDecimal temperaturaMaxima;

  public Prenda(TipoDePrenda tipo, Material material, Colores colorPrincipal,
                Colores colorSecundario, Trama trama, Formalidad formalidad, Integer temperaturaMaxima) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.formalidad = formalidad;
    this.temperaturaMaxima = BigDecimal.valueOf(temperaturaMaxima);
  }



  public TipoDePrenda getTipo() {
    return this.tipo;
  }

  public Material getMaterial() {
    return this.material;
  }

  public Colores getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Colores getColorSecundario() {
    return this.colorSecundario;
  }

}


