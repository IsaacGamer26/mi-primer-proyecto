/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1, num2;
        int suma, resta, multiplicacion, residuo;
        double division;

        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        residuo = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);
    }
}
