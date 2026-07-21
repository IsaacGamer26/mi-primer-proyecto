/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            numero = leer.nextInt();

            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
