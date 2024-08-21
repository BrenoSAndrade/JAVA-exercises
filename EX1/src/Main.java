import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);



        System.out.print("Número: ");
        int numero = SC.nextInt();

        SC.nextLine();

        System.out.println("Nome: ");
        String nome, nome2;
        nome =  SC.nextLine();

        System.out.println("Peso: ");
        double peso = SC.nextDouble();

        System.out.printf("Olá %s ", nome );
        System.out.printf("Seu preso %.2f ", peso);
        System.out.println("Seu número é %d ");



        SC.close();
    }
}