package leonildo.filgueira.com.vetor;

import java.util.Scanner;

/*
fazer um programa onde o usuário digite números para dois vetores de 5 posições cada.
criar um terceiro vetor que retornará a mulitiplicação dos dois vetores nas respetivas posições.
 */
public class MultiplicaVetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[5];
        String resultadoMultiplicado = " ";
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("digite o " + (i + 1) + "°" + " número do vetor 1");
            vetor1[i] = teclado.nextInt();
            System.out.println("digite o " + (i + 1) + "°" + " número do vetor 2");
            vetor2[i] = teclado.nextInt();
            vetor3[i] = vetor1[i] * vetor2[i];
            resultadoMultiplicado += vetor3[i] + " ";
        }
        System.out.println(resultadoMultiplicado);
    }
}
