/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elecionesvalledupar;

import java.util.Scanner;

public class EleccionesValledupar {

    public static void main(String[] args) {
        // Declaramos las variables
        int[][] votos = new int[5][4];
        int totalVotos = 0;
        int[] votosTotalesCandidato = new int[4];
        int[] votosTotalesComuna = new int[5];
        float[] porcentajesVotosCandidato = new float[4];
        float[] porcentajesVotosComuna = new float[5];
        int candidatoMasVotado = 0;
        int comunaMayorVotacion = 0;

        // Leemos los datos de la tabla de votaciones
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Comuna " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                votos[i][j] = sc.nextInt();
                totalVotos += votos[i][j];
                votosTotalesCandidato[j] += votos[i][j];
                votosTotalesComuna[i] += votos[i][j];
            }
        }

        // Calculamos los porcentajes de votación
        for (int i = 0; i < 4; i++) {
            porcentajesVotosCandidato[i] = (float) votosTotalesCandidato[i] / totalVotos * 100;
        }
        for (int i = 0; i < 5; i++) {
            porcentajesVotosComuna[i] = (float) votosTotalesComuna[i] / totalVotos * 100;
        }

        // Buscamos al candidato más votado
        for (int i = 1; i < 4; i++) {
            if (votosTotalesCandidato[i] > votosTotalesCandidato[candidatoMasVotado]) {
                candidatoMasVotado = i;
            }
        }

        // Buscamos la comuna con mayor votación
        for (int i = 1; i < 5; i++) {
            if (votosTotalesComuna[i] > votosTotalesComuna[comunaMayorVotacion]) {
                comunaMayorVotacion = i;
            }
        }

        // Imprimimos los resultados
        System.out.println("| Comuna | Candidato A | Candidato B | Candidato C | Candidato D |");
        System.out.println("|---|---|---|---|---|");
        for (int i = 0; i < 5; i++) {
            System.out.println("| " + (i + 1) + " | " + votos[i][0] + " | " + votos[i][1] + " | " + votos[i][2] + " | " + votos[i][3] + " |");
        }
        System.out.println();
        System.out.println("**Votos totales por candidato:**");
        for (int i = 0; i < 4; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosTotalesCandidato[i] + " votos (" + porcentajesVotosCandidato[i] + "%)");
        }
        System.out.println();
        System.out.println("**Candidato más votado:** " + (candidatoMasVotado + 1));
        System.out.println();
        System.out.println("**Votos totales por comuna:**");
        for (int i = 0; i < 5; i++) {
            System.out.println("Comuna " + (i + 1) + ": " + votosTotalesComuna[i] + " votos (" + porcentajesVotosComuna[i] + "%)");
        }
        System.out.println();
        System.out.println("**Comuna con mayor votación:** " + (comunaMayorVotacion + 1));

        // Declaramos un ganador, si es que hay uno
        int ganador = -1;
        for (int i = 0; i < 4; i++) {
            if (porcentajesVotosCandidato[i] > 50) {
                ganador = i;
                break;
            }
        }

        // Imprimimos el ganador, si es que hay uno
        if (ganador != -1) {
            System.out.println("**Ganador:** Candidato " + (ganador + 1));
        } else {
            System.out.println("**No hay ganador por mayoría absoluta.**");
        }
    }
}
        

