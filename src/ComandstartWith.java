public class ComandstartWith {
    public static void main(String[] args) {
        String s = "Boa";
        System.out.println(s.startsWith("boa")); // Resultado Falso - COMEÇA COM?

        System.out.println(s.toLowerCase().startsWith("boa")); // Resultado true - COMEÇA COM?
    }
}
