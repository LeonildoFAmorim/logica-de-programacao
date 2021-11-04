package leonildo.filgueira.com.matriz;

/*
calcular a soma dos números da diagonal principal de uma matriz quadrada
 */

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o tamanho da matriz quadrada");
        int tamanhoMatriz = teclado.nextInt();
        int soma = 0;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("digite os números da " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna");
                matriz[i][j] = teclado.nextInt();
                if (i == j){
                    soma += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("soma da diagonal principal: "+soma);
    }
}
