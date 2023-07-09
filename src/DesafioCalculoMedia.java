import java.util.Scanner;

public class DesafioCalculoMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double notaAtual = 0.0;
        double total = 0.0;

        String opcao = "";
        double nota = 0;

        while (nota != -1){

            System.out.println("Informe a Nota, ou -1 para <Sair>");
            nota = entrada.nextDouble();

            if (nota == -1){
                break;
            }

            if (nota <0.0 || nota > 10.0){
                System.out.println("Nota Inválida! Informe Novamente.");
            } else {
                quantidadeDeNotas++;
                total += nota;
            }
        }

        System.out.println("Transação Encerrada!");
        System.out.println("Média = " + total/quantidadeDeNotas);
        entrada.close();
    }
}
