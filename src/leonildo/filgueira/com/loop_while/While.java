package leonildo.filgueira.com.loop_while;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("continuar?");
        String resposta = teclado.next();
        while (resposta.equalsIgnoreCase("sim")){
            System.out.println("continuar?");
            resposta = teclado.next();
        }
        System.out.println("você encerrou");
    }
}
