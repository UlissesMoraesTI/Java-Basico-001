import javax.swing.*;

public class ConversãoStringNumerico {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Informe o Primeiro Número: ");

        String valor2 = JOptionPane.showInputDialog(
                "Informe o Primeiro Segundo Número: ");

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor1 + valor2);

        Double numero1 = Double.parseDouble(valor1);
        Double numero2 = Double.parseDouble(valor2);

        System.out.println(numero1 + numero2);



    }
}
