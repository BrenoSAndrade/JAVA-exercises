import javax.swing.*;
//TROCA DE FORMATO
public class Main {
    public static void main(String[] args) {
        //JOptionPane (entrada de dados)

        //String nome = JOptionPane.showInputDialog("Nome: ");
        //JOptionPane.showMessageDialog(null, "Menssagem " + nome);

        String entrada1 = JOptionPane.showInputDialog("Entrada1: ");
        String entrada2 = JOptionPane.showInputDialog("Entrada2: ");

        int numero1 = Integer.parseInt(entrada1);
        int numero2 = Integer.parseInt(entrada2);

        int soma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        System.out.println("A soma é: " + soma);

    }
}