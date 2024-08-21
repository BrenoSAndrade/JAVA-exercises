public class Main {
    public static void main(String[] args) {
        //arredondar
        double value = Math.round(10.5);
        System.out.println(value);
        //arredonda para cima
        double value2 = Math.ceil(10.2);
        System.out.println(value2);
        //arredonda para baixo
        double value3 = Math.floor(10.2);
        System.out.println(value3);
        //numero aleatorio entre 0 e 100
        double value4 = Math.random() * 100;
        System.out.println(value4);
        //numero aleatorio arredondado entre 0 e 100
        int value5 = (int)Math.round(Math.random() * 100);
        System.out.println(value5);


    }
}