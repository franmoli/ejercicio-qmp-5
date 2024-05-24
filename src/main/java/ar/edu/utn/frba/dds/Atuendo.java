package ar.edu.utn.frba.dds;

public class Atuendo {
  public Prenda superior;
  public Prenda inferior;
  public Prenda calzado;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado) {
    if (superior == null || inferior == null || calzado == null) {
      throw new NullPointerException("No se puede crear con prendas nulas");
    }

    if (superior.tipo.getCategoria() != CategoriaPrenda.PARTE_SUPERIOR) {
      throw new IllegalArgumentException("Prenda superior incorrecta");
    }
    this.superior = superior;

    if (inferior.tipo.getCategoria() != CategoriaPrenda.PARTE_INFERIOR) {
      throw new IllegalArgumentException("Prenda inferior incorrecta");
    }
    this.inferior = inferior;

    if (calzado.tipo.getCategoria() != CategoriaPrenda.CALZADO) {
      throw new IllegalArgumentException("Prenda calzado incorrecta");
    }
    this.calzado = calzado;
  }

  public void mostrarUniforme() {
    System.out.println("Calzado: ");
    System.out.println("Material: "
        + calzado.material
        + "Tipo: "
        + calzado.tipo
        + "| Color principal: "
        + calzado.colorPrincipal
        + "| Color Secundario: "
        + calzado.colorSecundario);
    System.out.println("Prenda Superior: ");
    System.out.println("Material: "
        + superior.material
        + "Tipo: "
        + superior.tipo
        + "| Color principal: "
        + superior.colorPrincipal
        + "| Color Secundario: "
        + superior.colorSecundario);
    System.out.println("Prenda Inferior: ");
    System.out.println("Material: "
        + inferior.material
        + "Tipo: "
        + inferior.tipo
        + "| Color principal: "
        + inferior.colorPrincipal
        + "| Color Secundario: "
        + inferior.colorSecundario);
  }
}
