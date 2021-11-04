package leonildo.filgueira.com.loop_do_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resposta  = "";
        do{
            System.out.println("jogador1 : digite um número de 1 a 10");
            int jogador1 = teclado.nextInt();
            System.out.println("jogador2 digite um número de 1 a 10");
            int jogador2 = teclado.nextInt();
            if (jogador1 == jogador2){
                System.out.println("acertou");
            }else {
                System.out.println("não acertou");
            }
            System.out.println("deseja continuar? sim / não");
            resposta = teclado.next();
        }while (resposta.equalsIgnoreCase("sim"));
    }
}
