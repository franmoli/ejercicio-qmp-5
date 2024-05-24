package ar.edu.utn.frba.dds;

public enum TipoDePrenda {

  ZAPATO {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.CALZADO;
    }
  },
  OJOTAS {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.CALZADO;
    }
  },
  PANTALON {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.PARTE_INFERIOR;
    }
  },
  SHORT_DE_FUTBOL {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.PARTE_INFERIOR;
    }
  },
  REMERA {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.PARTE_SUPERIOR;
    }
  },
  CAMISA {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.PARTE_SUPERIOR;
    }
  },
  MUSCULOSA {
    @Override
    public CategoriaPrenda getCategoria() {
      return CategoriaPrenda.PARTE_SUPERIOR;
    }
  };

  public abstract CategoriaPrenda getCategoria();
}


