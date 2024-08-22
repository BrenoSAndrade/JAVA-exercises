import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerNumero = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scannerNumero.nextInt();
        String contagem = Integer.toString(numero);
        int contador = contagem.length();
        if (contador <=4)
            System.out.printf("O número tem %d digitos", contador);
        else
            System.out.println("O numero tem 5 ou mais digitos");
    }
}