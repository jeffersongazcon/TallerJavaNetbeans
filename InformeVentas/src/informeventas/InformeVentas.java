/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informeventas;

import java.util.Scanner;

public class InformeVentas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int n = scanner.nextInt();

        int[] codigos = new int[n];
        int[] valores = new int[n];
        int[] cantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Codigo del producto " + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();

            System.out.print("Valor de venta del producto " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

            System.out.print("Cantidad de unidades vendidas del producto " + (i + 1) + ": ");
            cantidades[i] = scanner.nextInt();
        }

        int totalProductosVendidos = 0;
        int totalIngresos = 0;
        int productoMasVendido = 0;
        int productoMasCostoso = 0;

        for (int i = 0; i < n; i++) {
            totalProductosVendidos++;
            totalIngresos += valores[i] * cantidades[i];

            if (cantidades[i] > cantidades[productoMasVendido]) {
                productoMasVendido = codigos[i];
            }

            if (valores[i] > valores[productoMasCostoso]) {
                productoMasCostoso = codigos[i];
            }
        }

        System.out.println("** Informe de ventas **");
        System.out.println("Total productos vendidos: " + totalProductosVendidos);
        System.out.println("Total ingresos: " + totalIngresos);
        System.out.println("Producto mas vendido: " + productoMasVendido);
        System.out.println("Producto mas costoso: " + productoMasCostoso);
    }
}


