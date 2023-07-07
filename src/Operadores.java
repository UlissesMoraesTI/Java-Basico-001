public class Operadores {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 < 7;

        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);

        boolean condicao3 = 3 > 7;
        System.out.println(condicao1 || condicao3);
        System.out.println(!!condicao1);
        System.out.println(condicao1 ^ condicao3);

    }
}
