/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = leer.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
