import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro número: ");
        double numero1 = numero1Scanner.nextDouble();
        Scanner numero2Scanner = new Scanner(System.in).useLocale(Locale.US);;
        System.out.print("Digite o segundo número: ");
        double numero2 = numero2Scanner.nextDouble();

        double resultado = numero1 + numero2;
        System.out.println("O resultado é: " + resultado);

    }
}

