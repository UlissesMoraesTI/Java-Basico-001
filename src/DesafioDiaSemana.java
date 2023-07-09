import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Dia da Semanda: ");

        String diaSemanda = entrada.next();

        if (diaSemanda.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (diaSemanda.equalsIgnoreCase("Segunda")){
            System.out.println("2");
        } else if (diaSemanda.equalsIgnoreCase("Terca")
                || diaSemanda.equalsIgnoreCase("Terça") ) {
            System.out.println("3");
        } else if (diaSemanda.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if (diaSemanda.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (diaSemanda.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (diaSemanda.equalsIgnoreCase("Sabado")
                || diaSemanda.equalsIgnoreCase("Sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Dia da Semana Inválido!");
        }

        entrada.close();
    }
}
