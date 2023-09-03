/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamaximocomundivisor;

import java.util.Scanner;
public class PruebaMaximoComunDivisor {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int m = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int n = sc.nextInt();

        int mcd = MaximoComunDivisor.mcd(m, n);

        System.out.println("El maximo comun divisor de " + m + " y " + n + " es " + mcd);
    }
    
}
