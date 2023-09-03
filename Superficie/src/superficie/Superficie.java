/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superficie;

import java.util.Scanner;

public class Superficie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la habitacion: ");
        int longitud = scanner.nextInt();

        System.out.print("Ingrese la anchura de la habitacion: ");
        int anchura = scanner.nextInt();

        int superficie = longitud * anchura;

        System.out.println("La superficie de la habitacion es " + superficie + " metros cuadrados.");
    }
}

