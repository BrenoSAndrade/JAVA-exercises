package EX2;

public class salario {

    //atributos
    private String nome = "Julio";
    private double salario;

    public void salarioBase(double salarioBase) {
        if (salarioBase >= 1 && salarioBase <= 1000) {
            salario += salarioBase + (salarioBase * 0.15);
        } else if (salarioBase >= 1501 && salarioBase <= 2000) {
            salario += salarioBase + (salarioBase * 0.10);
        } else salario += salarioBase + (salarioBase * 0.05);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario com aumento: " + salario);
    }

}
