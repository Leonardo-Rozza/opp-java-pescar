package com.leonardo;

public class ContactoPersonal {

  private String nombre;
  private String correo;

  public ContactoPersonal(String nombre, String correo) {
    this.nombre = nombre;
    this.correo = correo;
  }

  public ContactoPersonal() {
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
    this.correo = correo;
  }


  @Override
  public String toString() {
    return "ContactoPersonal{" +
            "nombre='" + nombre + '\'' +
            ", correo='" + correo + '\'' +
            '}';
  }
}
