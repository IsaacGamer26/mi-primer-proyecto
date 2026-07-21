/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese numeros positivos.");
        System.out.println("Para terminar ingrese un numero negativo.");

        System.out.print("Numero: ");
        numero = leer.nextInt();

        while (numero >= 0) {

            suma = suma + numero;
            cantidad++;

            System.out.print("Numero: ");
            numero = leer.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}
