import java.util.Arrays;
// ARRAYS
public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 15, 30, 40};
        //Arrays.sort(valores);
        //System.out.println((Arrays.toString(valores)));
        //System.out.println(valores.length);

        //unidimencionais
        String[] cars = {"Volkswagen", "Audi", "Mercedes","BMW", "Porsche"};
        System.out.println(Arrays.toString(cars));
        //multidimensionais
        String[][] cars2 = {{"Fiat", "Reault"}, {"Tesla","Chevrolet"}};
        System.out.println(Arrays.deepToString(cars2));

    }
}