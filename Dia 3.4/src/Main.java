public class Main {
    public static void main(String[] args) {
        int valorCarro = 100_000;
        if (valorCarro > 100_000)
            System.out.println("Nao comprar, acima da tabela");
        else if (valorCarro >= 90_000 && valorCarro <= 100_000)
            System.out.println("Comprar carro");
        else
            System.out.println("Nao comprar, valor abaoxo da tabela");

        }
    }

