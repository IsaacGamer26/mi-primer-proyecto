package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero del 1 al 7: ");
        numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Numero no valido");
        }
    }
}
