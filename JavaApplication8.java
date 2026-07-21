/**
 * @author Sergi Isaac León Chuchuca
 */

package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String contraseña;

        do {
            System.out.print("Ingrese la contraseña: ");
            contraseña = leer.nextLine();

        } while (!contraseña.equals("java2026"));

        System.out.println("Acceso concedido");
    }
}
