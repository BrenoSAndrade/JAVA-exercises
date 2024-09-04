package EX2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        salario sal = new salario();

        System.out.println("Digite o salario base: ");
        sal.salarioBase(sc.nextByte());

    }
}
