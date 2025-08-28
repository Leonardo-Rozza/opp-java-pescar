package com.leonardo;

public class ContactoPersonal {

  private String nombre;
  private String correo;
  private Direccion direccion;

  public ContactoPersonal(String nombre, String correo) {
    atributosComunes(nombre, correo);
  }

  public ContactoPersonal(String nombre, String correo, Direccion direccion) {
    atributosComunes(nombre, correo);
    this.direccion = direccion;
  }

  public ContactoPersonal() {
  }

  private void atributosComunes(String nombre, String correo) {
    this.nombre = nombre;
    this.correo = correo;
  }

  public void mostrarDatos() {
    System.out.println("El nombre es: " + this.nombre);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    if (correo.equals(this.correo)) {
      System.out.println("No se puede cambiar el mismo correo.");
    }
    this.correo = correo;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    return "ContactoPersonal{" +
            "nombre='" + nombre + '\'' +
            ", correo='" + correo + '\'' +
            '}';
  }
}
