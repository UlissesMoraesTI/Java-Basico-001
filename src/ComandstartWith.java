public class ComandstartWith {
    public static void main(String[] args) {
        String s = "Boa Tarde";
        System.out.println(s.startsWith("boa")); // Resultado False - COMEÇA COM?
        System.out.println(s.toLowerCase().startsWith("boa")); // Resultado true - COMEÇA COM?

        System.out.println(s.endsWith("TARDE")); // Resultado False - TERMINA COM?
        System.out.println(s.toUpperCase().endsWith("TARDE")); //Resultado true - TERMINA COM?
    }
}