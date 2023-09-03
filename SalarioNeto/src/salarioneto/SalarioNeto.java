/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarioneto;

import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        Scanner sc = new Scanner(System.in);
        String nombre;
        int horasTrabajadas;
        float tasaHora, salarioExtra;


        System.out.println("Introduce el nombre del trabajador:");
        nombre = sc.nextLine();
        System.out.println("Introduce el número de horas trabajadas:");
        horasTrabajadas = sc.nextInt();
        System.out.println("Introduce la tasa horaria:");
        tasaHora = sc.nextFloat();


        float salarioBruto = horasTrabajadas * tasaHora;


        if (horasTrabajadas > 38) {
            salarioExtra = (horasTrabajadas - 38) * tasaHora * 1.5f;
        } else {
            salarioExtra = 0f;
        }

 
        float salarioNeto;
        if (salarioBruto <= 750) {
            salarioNeto = salarioBruto;
        } else {
            salarioNeto = salarioBruto - (salarioBruto * 0.1f);
        }


        System.out.println("El salario neto de " + nombre + " es de " + salarioNeto + " euros.");
    }
}

