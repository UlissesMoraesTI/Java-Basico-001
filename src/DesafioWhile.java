import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao = "";

        while (!opcao.equalsIgnoreCase("Sair") ) {

            System.out.println("Informe a Mensagem ou <Sair>");
            opcao = entrada.next();
        }

        System.out.println("Transação Encerrada!");
        entrada.close();
    }
}
