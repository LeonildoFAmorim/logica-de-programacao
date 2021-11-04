
/*
criar um sistema que exiba a tabuada de 1 a 10
 */
package leonildo.filgueira.com.exercicio_for;

public class Tabuada {
    public static void main(String[] args) {
        for (int multiplicando = 2; multiplicando <= 10; multiplicando++) {
            System.out.println("tabuada do "+ multiplicando);
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(multiplicando + " * " + multiplicador + " = " + multiplicando * multiplicador);
            }
        }
    }
}
