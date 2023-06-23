import java.util.HashSet;
import java.util.Set;

public class ComandSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa joao = new Pessoa(1L, "João");
        pessoas.add(joao);

        Pessoa maria = new Pessoa(1L, "Maria");
        pessoas.add(maria);

        Pessoa jose = new Pessoa(1L, "José");
        pessoas.add(jose);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        // Set NÃO permite adicionar o mesmo objeto duas vezes
        System.out.println("#-----------#");
        System.out.println("Set NÃO permite adicionar o mesmo objeto duas vezes");
        System.out.println("Utiliza o Método .hash para verificar se elemento já está na lista");
        System.out.println("#-----------#");

        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(jose);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        // Como verificar se adicionou
        System.out.println("#-----------#");
        System.out.println("Como verificar se adicionou");
        System.out.println("#-----------#");

        boolean adicionou = pessoas.add(new Pessoa(1L, "João"));

        if (adicionou) {
            System.out.println("OK - Adicionou");
        } else {
            System.out.println("NOK - Não Adicionou");
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }
}
