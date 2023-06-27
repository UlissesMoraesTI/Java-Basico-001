public class ComandStringLength {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); // Saída: 0=O, 1=l, 2=á

        String s = "Boa tarde";
        System.out.println(s.concat("!"));
        System.out.println(s + "!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
    }
}
