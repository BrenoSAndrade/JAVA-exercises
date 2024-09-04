package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Num 1: ");
        calc.num1 = sc.nextDouble();
        System.out.println("Num 2: ");
        calc.num2 = sc.nextDouble();

        System.out.println("Soma: " + calc.soma());
        System.out.println("Subtração: " + calc.subitrair());

        sc.close();

        //instanciar objeto

        //pssar dados de leitura

    }
}
