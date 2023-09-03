/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeronatural;

import java.util.Scanner;

public class Numeronatural {

    public static void main(String[] args) {

        int n, suma, cantidad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();

        n = 1;
        suma = 0;

        while (suma <= cantidad) {
            suma += n;
            n++;
        }

        System.out.println("El numero natural mas pequeño N tal que la suma de los N primeros numeros naturales exceda " + cantidad + " es " + n);
    }
}

