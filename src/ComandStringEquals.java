public class ComandStringEquals {
    public static void main(String[] args) {
        String s = "Boa tarde";
        System.out.println(s.equals("BOA TARDE")); //Resultado false

        System.out.println(s.equalsIgnoreCase("BOA TARDE")); //Resultado true

    }
}
