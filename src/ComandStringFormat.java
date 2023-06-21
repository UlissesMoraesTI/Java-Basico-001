public class ComandStringFormat {
    public static void main(String[] args) {

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.678;

        // \n quebra linha
        // %s substituir por variável de forma posicional

        String frase = String.format("\n O Senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome,idade,salario);
        System.out.println(frase);
    }
}
