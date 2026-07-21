/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = leer.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
