/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusa;
import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce la longitud del cateto opuesto: ");
        int catetoOpuesto = scanner.nextInt();

        System.out.print("Introduce la longitud del cateto adyacente: ");
        int catetoAdyacente = scanner.nextInt();


        double hipotenusa = Math.sqrt(catetoOpuesto * catetoOpuesto + catetoAdyacente * catetoAdyacente);

        double angulo1 = Math.asin(catetoOpuesto / hipotenusa);
        double angulo2 = Math.acos(catetoAdyacente / hipotenusa);

        System.out.println("La hipotenusa es: " + hipotenusa);
        System.out.println("El angulo agudo 1 es: " + angulo1);
        System.out.println("El angulo agudo 2 es: " + angulo2);
    }
}

