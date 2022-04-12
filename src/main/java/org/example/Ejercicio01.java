package org.example;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String username = data.nextLine();
        System.out.println("Ingrese su edad: ");
        String age = data.nextLine();
        System.out.println("Ingrese su telefono celular: ");
        String phonenumber = data.nextLine();
        System.out.println("Bienvenido Sr/a " + username + ", es un placer para nosotros contrar" +
                " con una persona de " + age + " años. Proximamente estaremos contactandolo al numero" +
                phonenumber + "\n" + "Feliz dia");
    }
}
