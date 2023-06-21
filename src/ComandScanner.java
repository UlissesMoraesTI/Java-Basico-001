import java.util.Scanner;

public class ComandScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu primeiro nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        String frase = String.format("Meu Nome é %s %s e tenho %d anos de idade.", nome, sobrenome, idade);
        System.out.println(frase);

        entrada.close();
    }
}
