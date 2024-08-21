import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //EXERCICIO 1
        /*
        Scanner scannerNota = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Calcular media");
        System.out.print("Digite a nota 1: ");
        double nota1 = scannerNota.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = scannerNota.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = scannerNota.nextDouble();
        System.out.print("Digite a nota 4: ");
        double nota4 = scannerNota.nextDouble();
        System.out.print("Digite a nota 5: ");
        double nota5 = scannerNota.nextDouble();

        double media = ((double)nota1 + (double)nota2 + (double)nota3 + (double)nota4 + (double)nota5) /5;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Nota 5: " + nota5);
        System.out.println("Media final: " + media);
        */
        //EXERCICIO 2
        /*
        String entrada1 = JOptionPane.showInputDialog("Digite o raio do circulo: ");
        float raio = Float.parseFloat(entrada1);
        float area = (float)Math.PI * (float)Math.pow(raio, 2);
        String mensagem = String.format("A area é %.4f", area);
        JOptionPane.showMessageDialog(null, mensagem);
         */
        //EXERCICIO 3
        /*
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite as Horas trabalhadas: ");
        int horas = SC.nextInt();
        System.out.println("Digite o valor pago por hora: ");
        float valor = SC.nextFloat();

        float salario = horas * valor;
        System.out.printf("Salario: R$%.2f", salario);
        */
        //EXERCICIO 4
        /*
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String entrada2 = JOptionPane.showInputDialog("Digite o ano que nasceu: ");
        int ano = Integer.parseInt(entrada2);
        int idade = 2024 - ano;
        String mensagem = String.format("Ola, %s sua idade é %d", nome, idade);
        JOptionPane.showMessageDialog(null, mensagem);
        */
        //EXERCICIO 5
        /*
        Scanner SC = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        float preco = SC.nextFloat();
        System.out.println("Digite o desconto %: ");
        float desconto = SC.nextFloat();

        float valorDesconto = preco * (desconto/100);
        float precoFinal = preco - valorDesconto;

        System.out.printf("Preco original: %.3f\n", preco);
        System.out.printf("Preco final: %.3f", precoFinal);
        */
        //EXERCICIO 6
        /*
        String entrada1 = JOptionPane.showInputDialog("Digite o salario para receber o aumento: ");
        float salario = Float.parseFloat(entrada1);
        float aumento = salario * (15.0f/100.0f);
        float salarioFinal = salario + aumento;
        String mensagem = String.format("O salario com aumento de 15%% é de %.2f", salarioFinal);
        JOptionPane.showMessageDialog(null, mensagem );
        System.out.println(aumento);
         */
}
}