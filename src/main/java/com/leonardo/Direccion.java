package com.leonardo;

public class Direccion {

  private String nombreCalle;
  private int altura;
  private int cp;

  public Direccion(String nombreCalle, int altura, int cp) {
    this.nombreCalle = nombreCalle;
    this.altura = altura;
    this.cp = cp;
  }

  public Direccion() {
  }

  public String getNombreCalle() {
    return nombreCalle;
  }

  public void setNombreCalle(String nombreCalle) {
    this.nombreCalle = nombreCalle;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  @Override
  public String toString() {
    return "Direccion{" +
            "nombreCalle='" + nombreCalle + '\'' +
            ", altura=" + altura +
            ", cp=" + cp +
            '}';
  }
}
