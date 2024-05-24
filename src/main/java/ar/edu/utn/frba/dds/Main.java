package ar.edu.utn.frba.dds;

import java.math.BigDecimal;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Guardarropa guardarropa;
    ProveedorDeClimaMock proveedorDeClima;
    Prenda musculosa;
    Prenda camisa;
    Prenda jean;
    Prenda shorts;
    Prenda zapatos;
    Prenda ojotas;

    proveedorDeClima = new ProveedorDeClimaMock();
    ManagerProveedorClima managerProveedorClima = new ManagerProveedorClima(proveedorDeClima);
    Usuario usuario = new Usuario(34, "Juan Carlos", "Buenos Aires, Argentina");
    MotorSugerenciasSegunClima motor = new MotorSugerenciasSegunClima();
    ProveedorDeMotor proveedorDeMotor = new ProveedorDeMotor();
    proveedorDeMotor.setMotor(motor);
    guardarropa = new Guardarropa(usuario, proveedorDeMotor, managerProveedorClima);


    Borrador borradorMusculosa = new Borrador(TipoDePrenda.MUSCULOSA);
    borradorMusculosa.setColorPrincipal(Colores.ROJO);
    borradorMusculosa.setFormalidad(Formalidad.INFORMAL);
    borradorMusculosa.setMaterial(Material.ALGODON);
    borradorMusculosa.setTemperaturaMaxima(40);
    musculosa = borradorMusculosa.buildPrenda();

    Borrador borradorCamisa = new Borrador(TipoDePrenda.CAMISA);
    borradorCamisa.setColorPrincipal(Colores.NEGRO);
    borradorCamisa.setFormalidad(Formalidad.FORMAL);
    borradorCamisa.setMaterial(Material.ALGODON);
    borradorCamisa.setTemperaturaMaxima(20);
    camisa = borradorCamisa.buildPrenda();

    Borrador borradorJean = new Borrador(TipoDePrenda.PANTALON);
    borradorJean.setColorPrincipal(Colores.AZUL);
    borradorJean.setFormalidad(Formalidad.FORMAL);
    borradorJean.setMaterial(Material.JEAN);
    borradorJean.setTemperaturaMaxima(20);
    jean = borradorJean.buildPrenda();

    Borrador borradorPantalonCorto = new Borrador(TipoDePrenda.SHORT_DE_FUTBOL);
    borradorPantalonCorto.setColorPrincipal(Colores.VERDE);
    borradorPantalonCorto.setFormalidad(Formalidad.INFORMAL);
    borradorPantalonCorto.setMaterial(Material.ALGODON);
    borradorPantalonCorto.setTemperaturaMaxima(40);
    shorts = borradorPantalonCorto.buildPrenda();

    Borrador borradorZapatos = new Borrador(TipoDePrenda.ZAPATO);
    borradorZapatos.setColorPrincipal(Colores.NEGRO);
    borradorZapatos.setFormalidad(Formalidad.FORMAL);
    borradorZapatos.setMaterial(Material.CUERO);
    borradorZapatos.setTemperaturaMaxima(20);
    zapatos = borradorZapatos.buildPrenda();

    Borrador borradorOjotas = new Borrador(TipoDePrenda.OJOTAS);
    borradorOjotas.setColorPrincipal(Colores.AZUL);
    borradorOjotas.setFormalidad(Formalidad.INFORMAL);
    borradorOjotas.setMaterial(Material.GOMA);
    borradorOjotas.setTemperaturaMaxima(40);
    ojotas = borradorOjotas.buildPrenda();

    guardarropa.agregarPrenda(musculosa);
    guardarropa.agregarPrenda(camisa);
    guardarropa.agregarPrenda(jean);
    guardarropa.agregarPrenda(shorts);
    guardarropa.agregarPrenda(zapatos);
    guardarropa.agregarPrenda(ojotas);

    proveedorDeClima.setTemperatura(BigDecimal.valueOf(35));
    List<Atuendo> sugerencias = guardarropa.generarSugerencias();

    System.out.println(sugerencias.size());

    for (Atuendo atuendo : sugerencias){
      System.out.println("Superior: " + atuendo.superior.tipo);
      System.out.println("Inferior: " + atuendo.inferior.tipo);
      System.out.println("Calzado: " + atuendo.calzado.tipo);
    }



  }
}