package com.leonardo;

public class Test {
  public static void main(String[] args) {
    System.out.println("Hola mundo desde Java");

    ContactoPersonal cp1 = new ContactoPersonal();
    ContactoPersonal cp2 = new ContactoPersonal("Leo", "Leo@gmail.com");

    // cp1.mostrarDatos();

    System.out.println(cp1);
    System.out.println(cp2);
  }
}