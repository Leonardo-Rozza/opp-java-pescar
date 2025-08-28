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

  @Override
  public String toString() {
    return "ContactoPersonal{" +
            "nombre='" + nombre + '\'' +
            ", correo='" + correo + '\'' +
            '}';
  }
}
