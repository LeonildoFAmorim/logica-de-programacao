package leonildo.filgueira.com.loop_while;
/*
gostaria de digitar um número e o programa me imprimisse os números ímpares até o número digitado
 */

import java.util.Scanner;

public class ExercicoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um número");
        int numeroDigitado = teclado.nextInt();
        int i = 0;
        while (i <= numeroDigitado) {
            if (i % 2 != 0) {
                System.out.println(i);;
            }
            i++;
        }
    }
}