public class DesafioFor {
    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i <=5 ; i++) {
            System.out.println(valor);
            valor += "#";
        }

        System.out.println("");
        System.out.println("Segunda Forma:");
        System.out.println("");

        for (String i = "#"; !i.equals("######") ; i+= "#") {
            System.out.println(i);
        }
    }
}
