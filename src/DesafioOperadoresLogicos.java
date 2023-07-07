public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        System.out.println("Trabalho Terça.: " + trabalhoTerca);
        System.out.println("Trabalho Quinta: " + trabalhoQuinta);

        if (trabalhoTerca == true && trabalhoQuinta == true) {
            System.out.println("Comprei TV 50 Polegadas");
            System.out.println("Oba! Vamos tomar sorvete!");
        } else if (trabalhoTerca == true || trabalhoQuinta == true) {
            System.out.println("Comprei TV 32 Polegadas");
            System.out.println("Oba! Vamos tomar sorvete!");
        }

        if (!trabalhoTerca && !trabalhoQuinta) {
            System.out.println("Sem SORVETE!!!");
        }


    }
}
