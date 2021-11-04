package leonildo.filgueira.com.loop_while;
/*
o programa cadastra usuário e senha, após isso é verificado se os dois estão corretos,
se estivrem corretos permite o acesso, se não tiver exibe acesso negado.

 */
import java.util.Scanner;

public class Exercicio_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cadastre o usuário");
        String usuario = teclado.next();
        System.out.println("cadastre a senha do usuário");
        String senha = teclado.next();
        String buscaUsuario = "";
        String buscaSenha = "";
        while (true){
            System.out.println("digite o usuário para busca");
            buscaUsuario = teclado.next();
            System.out.println("digite a senha para busca");
            buscaSenha = teclado.next();
            if (usuario.equalsIgnoreCase(buscaUsuario) && senha.equalsIgnoreCase(buscaSenha)){
                System.out.println("acesso permitido");
                break;
            }
            System.out.println("acesso negado");
        }
    }
}
