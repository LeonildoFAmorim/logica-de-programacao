package leonildo.filgueira.com.matriz;

public class Matriz {
    public static void main(String[] args) {
        int [][] matriz = new int[2][2];// dois arrays de endereço de memória que apontam para dois arrays que podem ser armazenados dois valores inteiros
        matriz[0][0] = 12;
        matriz[0][1] = 24;
        matriz[1][0] = 36;
        matriz[1][1] = 48;

        System.out.println(matriz[0]);//aqui imprime o endereço de memória que o valor 12 está alocando
        System.out.println(matriz[0][0]);/* aqui imprime o valor 12, isso porque em array multidimensional o primeiro
        valor é o endereço de memória para o array que irá armazenar os valores.*/
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]);

    }
}
