public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultado = media > 7.0 ? "Aprovado" : "Recuperação";
        System.out.println(resultado);

        boolean temDesconto = true;
        String comDesconto = temDesconto ? "Sim" : "Não";
        System.out.println(comDesconto);
    }
}
