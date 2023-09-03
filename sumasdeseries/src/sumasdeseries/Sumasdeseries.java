/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumasdeseries;

/**
 *
 * @author Lenovo
 */
public class Sumasdeseries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.print("Ingrese el valor de n: ");
        int n = 3;
        
        double suma = 0.0;
        
        for (int i = 1; i <= n; i++) {
            double termino = (double)i / Math.pow(2, i);
            suma += termino;
        }
        
        System.out.println("La suma de la serie es: " + suma);
        
    }
    
}
