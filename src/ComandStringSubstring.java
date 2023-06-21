public class ComandStringSubstring {
    public static void main(String[] args) {
        System.out.println("qualquer frase, Texto.".contains("fra")); //Retorno true = Frase contem "fra"

        System.out.println("qualquer frase, Texto.".indexOf("fra")); //Retorno 9 = "fra" inicia a partir da posição 9

        System.out.println("qualquer frase, Texto.".substring(9)); //Retorno "frase, Texto" a partir da posição 9

        System.out.println("qualquer frase, Texto.".substring(9, 14)); //Retorno "frase" a partir da posição 9 tamanho 4

        System.out.println("qualquer frase, Texto.".replace(",", ".")); //Replace

        System.out.println("qualquer frase, Texto.".replace(".", ",")); //Replace
    }
}


