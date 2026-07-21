package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

    }
}