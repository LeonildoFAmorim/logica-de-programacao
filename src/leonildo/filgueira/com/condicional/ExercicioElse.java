package leonildo.filgueira.com.condicional;

import java.util.Scanner;
/*
* femino maior que dezoito, pergunte se deseja se alistar;
* feminino menor que dezoito não pode se alistar;
* masculino maior que dezoito alistamento obrigatório;
* masculino menor que dezoito não permitido alistamento.
* */
public class ExercicioElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o sexo");
        String sexo = teclado.next();
        System.out.println("digite a idade");
        int idade = teclado.nextInt();
        if (idade >= 18 && sexo.equalsIgnoreCase("M") ){
            System.out.println("alistamento obrigatório");
        }else if (idade < 18 && sexo.equalsIgnoreCase("F") || idade < 18 && sexo.equalsIgnoreCase("M")){
            System.out.println("alistamento não permitido");
        }else{
            System.out.println("você deseja alistar?");
        }
    }
}
