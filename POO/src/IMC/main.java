package IMC;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadoraIMC calcIMC = new CalculadoraIMC();

        System.out.println("Peso: ");
        calcIMC.peso = sc.nextDouble();
        System.out.println("Altura: ");
        calcIMC.altura = sc.nextDouble();

        calcIMC.calcularIMC();
        calcIMC.classificar();

        double imc = calcIMC.calcularIMC();

        String classificar = calcIMC.classificar(imc);
        
        sc.close();

    }
}
