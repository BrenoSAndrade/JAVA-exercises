 public class Main {
    public static void main(String[] args) {

        /*
        Clients c001= new Clients();
        c001.firstName = "Breno";
        c001.age = 19;

        Clients c002= new Clients();
        c002.firstName = "Julio";
        c002.age = 25;

        c002.newAccount();
        */

        Car car= new Car("BMW", "M4", 2024, 125_000);

        car.setModelo("M5");

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.sellValue());


    }
}