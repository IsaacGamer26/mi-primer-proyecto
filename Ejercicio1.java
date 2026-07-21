package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre, carrera;
        int edad;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();
        leer.nextLine(); // Limpia el Enter

        System.out.print("Ingrese su carrera: ");
        carrera = leer.nextLine();

        System.out.print("Ingrese su estatura: ");
        estatura = leer.nextDouble();

        System.out.println("\n----- DATOS INGRESADOS -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura);
    }
}