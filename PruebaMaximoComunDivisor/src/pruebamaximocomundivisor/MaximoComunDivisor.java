/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamaximocomundivisor;

/**
 *
 * @author Lenovo
 */
public class MaximoComunDivisor {
    public static int mcd(int m, int n) {
        int r;
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
}
}
