/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eleccionesvalledupar;
import java.util.Arrays;

public class EleccionesValledupar {

    public static void main(String[] args) {
        // Declaramos las variables
        int[][] votos = {
            {194, 48, 206, 45},
            {180, 20, 320, 16},
            {221, 90, 140, 20},
            {432, 50, 821, 14},
            {820, 61, 946, 18}
        };
        int totalVotos = Arrays.stream(votos).flatMapToInt(a -> Arrays.stream(a)).sum();

        // Calculamos el número de votos por cada candidato
        int[] votosPorCandidato = new int[4];
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[i].length; j++) {
                votosPorCandidato[j] += votos[i][j];
            }
        }

        // Calculamos el porcentaje de votos por cada candidato
        float[] porcentajeVotos = new float[4];
        for (int i = 0; i < votosPorCandidato.length; i++) {
            porcentajeVotos[i] = (float) votosPorCandidato[i] / totalVotos * 100;
        }

        // Imprimimos la tabla de votaciones
        System.out.println("Comuna | Candidato A | Candidato B | Candidato C | Candidato D");
        for (int i = 0; i < votos.length; i++) {
            System.out.println(
                i + 1 + " | " + votos[i][0] + " | " + votos[i][1] + " | " + votos[i][2] + " | " + votos[i][3]
            );
        }

        // Imprimimos el número total de votos por cada candidato
        System.out.println("\nNúmero de votos por candidato:");
        for (int i = 0; i < votosPorCandidato.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosPorCandidato[i]);
        }

        // Imprimimos el porcentaje de votos por cada candidato
        System.out.println("\nPorcentaje de votos por candidato:");
        for (int i = 0; i < porcentajeVotos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + porcentajeVotos[i] + "%");
        }

        // Indicamos el candidato más votado
        int candidatoMasVotado = 0;
        for (int i = 1; i < votosPorCandidato.length; i++) {
            if (votosPorCandidato[i] > votosPorCandidato[candidatoMasVotado]) {
                candidatoMasVotado = i;
            }
        }
        System.out.println("\nCandidato más votado: " + (candidatoMasVotado + 1));

        // Declaramos el ganador de las elecciones
        int ganador = -1;
        for (int i = 0; i < porcentajeVotos.length; i++) {
            if (porcentajeVotos[i] > 50) {
                ganador = i;
                break;
            }
        }
        if (ganador != -1) {
            System.out.println("\nGanador de las elecciones: " + (ganador + 1));
        } else {
            System.out.println("\nNo hay ganador con más del 50% de los votos.");
        }
    }
}




                
