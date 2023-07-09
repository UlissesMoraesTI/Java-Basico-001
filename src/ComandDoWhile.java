import java.util.Scanner;

public class ComandDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao = "";

        do {
            System.out.println("Informa a Mensagem: ");
            opcao = entrada.nextLine();

        } while (opcao.equalsIgnoreCase("Sair"));

        System.out.println("Transação Encerrada!");
        entrada.close();
    }
}
