import java.util.HashMap;
import java.util.Map;

public class ComandMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();

        Pessoa joao = new Pessoa(1L, "João");
        mapa.put(1L, joao);

        Pessoa maria = new Pessoa(1L, "Maria");
        mapa.put(1L, maria);

        Pessoa jose = new Pessoa(1L, "José");
        mapa.put(1L, jose);

        System.out.println(joao.getNome());

        Pessoa joao2 = mapa.get(1L);

        System.out.println("João2: " + joao2.getNome());
    }
}
