import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu 1º. Salário: ");
        String primeiroSalario = entrada.nextLine().replace(",", ".");
        Double salario1 = Double.parseDouble(primeiroSalario);

        System.out.println("Informe seu 2º. Salário: ");
        String segundoSalario = entrada.nextLine().replace(",", ".");
        Double salario2 = Double.parseDouble(segundoSalario);

        System.out.println("Informe seu 3º. Salário: ");
        String terceiroSalario = entrada.nextLine().replace(",", ".");
        Double salario3 = Double.parseDouble(terceiroSalario);

        Double mediaSalarial = (salario1 + salario2 + salario3) / 3;

        System.out.println("Média Salarial: " + mediaSalarial);

        entrada.close();
    }

}
