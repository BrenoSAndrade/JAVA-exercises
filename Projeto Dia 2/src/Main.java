import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] myarray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programing",
                "C++"
        };

        System.out.println("Sem ordem: " + Arrays.toString(my_array));
        Arrays.sort(my_array);
        System.out.println("Com ordem: " + Arrays.toString(my_array));

        System.out.println("Sem ordem: " + Arrays.toString(myarray2));
        Arrays.sort(myarray2);
        System.out.println("Com ordem: " + Arrays.toString(myarray2));

    }
}