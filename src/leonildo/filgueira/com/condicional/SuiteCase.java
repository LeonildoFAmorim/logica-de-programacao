package leonildo.filgueira.com.condicional;
// break só é utilizado dentro de switch case ou dentro de um loop, nunca dentro de if ou else
public class SuiteCase {
    public static void main(String[] args) {
        int dia = 5;
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("não é um dia da semana");
        }
    }
}
