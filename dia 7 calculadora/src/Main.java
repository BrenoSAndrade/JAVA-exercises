import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Digite o num1 operador num2 EX: 2 * 4: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        if(op == '+')
            System.out.println(num1 + num2 );
        else if (op == '-')
            System.out.println(num1 - num2);
        else if (op == '*')
            System.out.println(num1 * num2);
        else if (op == '/')
            System.out.println(num1 / num2);
        else
            System.out.println("Formato invalido");

    }
}