/*
enquanto não for digitado o número 3, deve aparecer este menu na tela:

1 - Calcular imposto
2 - Deposita salário
3 - Sair
 */

package leonildo.filgueira.com.loop_while;

import java.util.Scanner;

public class ExercicioWhile_ {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a opção");
        int opcao = teclado.nextInt();
        while (opcao != 3){
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Deposita salário");
            System.out.println("3 - Sair");
            System.out.println("digite a opção");
            opcao = teclado.nextInt();
        }
    }
}
