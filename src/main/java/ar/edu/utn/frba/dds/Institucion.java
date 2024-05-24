package ar.edu.utn.frba.dds;

public class Institucion {
  String nombre;
  public Atuendo uniforme;

  public Institucion(String nombre, Atuendo uniforme) {
    if (nombre == null || uniforme == null) {
      throw new NullPointerException("Nombre y Uniforme no puede ser nulo");
    }
    this.nombre = nombre;
    this.uniforme = uniforme;
  }
}
