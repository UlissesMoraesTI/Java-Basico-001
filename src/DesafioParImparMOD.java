import javax.swing.*;

public class DesafioParImparMOD {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o Número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é IMPAR.");
        }
    }
}
