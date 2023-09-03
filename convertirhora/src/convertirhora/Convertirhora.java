/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirhora;

public class Convertirhora {

    public static void main(String[] args) {

        String hora24 = ":45";

        if (hora24.length() != 5) {
            System.out.println("La hora no tiene la longitud correcta.");
            System.exit(1);
        }

        int hora = Integer.parseInt(hora24.substring(0, 2));
        int minutos = Integer.parseInt(hora24.substring(3, 5));

        if (hora >= 12) {
            hora = hora - 12;
        }


        System.out.println("La hora en notación de 12 horas es: " + hora + ":" + minutos + " " + (hora < 12 ? "AM" : "PM"));
    }
}
