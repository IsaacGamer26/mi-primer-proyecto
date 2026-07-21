/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double calificacion;

        System.out.print("Ingrese la calificacion (0 a 10): ");
        calificacion = leer.nextDouble();

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");
        } else if (calificacion >= 8) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7) {
            System.out.println("Bueno");
        } else if (calificacion >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}
