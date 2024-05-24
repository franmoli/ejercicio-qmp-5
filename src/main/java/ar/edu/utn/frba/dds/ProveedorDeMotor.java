package ar.edu.utn.frba.dds;

public class ProveedorDeMotor {
  MotorSugerencias motorSugerencias;
  static ProveedorDeMotor INSTANCE = new ProveedorDeMotor();

  static ProveedorDeMotor getInstance() {
    return INSTANCE;
  }

  public MotorSugerencias getMotor() {
    return motorSugerencias;
  }

  public void setMotor(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }

}
