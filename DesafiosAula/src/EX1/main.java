package EX1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        estoque estoque = new estoque();

        estoque.mostrarInfo();
        System.out.println("Digite a quantidade de entrada: ");
        estoque.entrada(sc.nextByte());
        estoque.mostrarInfo();
        System.out.println("Digite a quantidade de saida: ");
        estoque.saida(sc.nextByte());
        estoque.mostrarInfo();


    }
}
