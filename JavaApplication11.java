/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        int mayor = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el numero " + i + ": ");
            numero = leer.nextInt();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}

