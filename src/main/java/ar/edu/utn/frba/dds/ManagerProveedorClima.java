package ar.edu.utn.frba.dds;

public class ManagerProveedorClima {
  ProveedorDeClima proveedor;

  public ManagerProveedorClima(ProveedorDeClima proveedor) {
    if (proveedor == null){
      throw new NullPointerException("Proveedor no puede ser nulo");
    }
    this.proveedor = proveedor;
  }

  public void setProveedor(ProveedorDeClima proveedor) {
    if (proveedor == null){
      throw new NullPointerException("Proveedor no puede ser nulo");
    }
    this.proveedor = proveedor;
  }
  public ProveedorDeClima getProveedor() {
    return proveedor;
  }
}
