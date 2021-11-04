/*
* como gerente eu gostaria que meus usuarios podessem digitar
* o tipo de conta e o sistema imprima qual a porcentagem de juros
* que aquela conta irá oferecer para o cliente para agilizar o acesso
* às informações. Os tipos das contas são:
* caso a conta não exista imprima conta não existe
*
* CONTA POUPANÇA 0.05%
* CONTA CORRENTE 0.02%
* CONTA INVESTIMENTO 0.01%
* */

package leonildo.filgueira.com.condicional;

public class ExercicioSwitchCase {
    public static void main(String[] args) {
        String conta = "corrente";
        switch (conta) {
            case "poupanca":
                System.out.println(0.05 + "%");
                break;
            case "corrente":
                System.out.println(0.02 + "5");
                break;
            case "investimento":
                System.out.println(0.01+"%");
                break;
            default:
                System.out.println("conta não existe");
        }
    }
}
