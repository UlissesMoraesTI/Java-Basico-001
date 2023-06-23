import java.util.ArrayList;
import java.util.List;

public class ComandList {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "João"));
        pessoas.add(new Pessoa(2L, "Maria"));
        pessoas.add(new Pessoa(2L, "José"));

        for ( Pessoa pessoa : pessoas ) {
            System.out.println(pessoa.getNome());
        }

        // List permite adicionar o mesmo objeto duas vezes
        System.out.println("#-----------#");
        System.out.println("List permite adicionar o mesmo objeto duas vezes");
        System.out.println("#-----------#");

        Pessoa a = pessoas.get(1); //adicionar Maria
        pessoas.add(a);

        Pessoa b = pessoas.get(2); //adicionar José
        pessoas.add(b);

        for ( Pessoa pessoa : pessoas ) {
            System.out.println(pessoa.getNome());
        }
    }
}
