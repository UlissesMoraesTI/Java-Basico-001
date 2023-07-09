import java.util.Scanner;

public class ComandSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Dia da Semanda: ");
        int diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case -1:
                System.out.println("Transação Encerrada!");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            case 0: case 8: case 9:
                System.out.println("Entrada Inválida!");

            default:
                System.out.println("Dia da Semanda Inválido!");
                System.out.println("Transação Encerrada!");
                break;
        }

        System.out.println("Transação Encerrada!");
        entrada.close();
    }
}
