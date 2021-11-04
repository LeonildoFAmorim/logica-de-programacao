package leonildo.filgueira.com.condicional;

import java.util.Scanner;
// equalsignoreCase serão ignoradas as letras maiúsculas ou minúsuculas e sucessivamente.
public class ComparandoStrings {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = teclado.next();
        System.out.println("digite o login");
        String login = teclado.next();
        if (login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrado")){
            System.out.println(nome + "login inválido");
        }else {
            System.out.println("seu cadastro foi realizado com sucesso");
        }
    }
}
