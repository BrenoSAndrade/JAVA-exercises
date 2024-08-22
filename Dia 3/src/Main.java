import java.text.NumberFormat;

public class Main {
    //formatacao de numeros
    public static void main(String[] args) {
        NumberFormat real = NumberFormat.getCurrencyInstance();
        String productValue = real.format(120.8);
        System.out.println(productValue);
    }
}