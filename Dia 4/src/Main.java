import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerFruta = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nomeProduto = scannerFruta.next().toLowerCase();

        switch (nomeProduto){
            case "banana":
                System.out.println("9.50");
                break;
            case "manga":
                System.out.println("12.80");
                break;
            case "abacate":
                System.out.println("16.80");

        }
    }
}