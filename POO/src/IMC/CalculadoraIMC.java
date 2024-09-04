package IMC;

public class CalculadoraIMC {

    //atributos
    double peso;
    double altura;
    double IMC = calcularIMC();

    //metodos
    public double calcularIMC(){
        return peso / altura * altura;
    }

    public String classificar(){
        if (IMC > 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (IMC < 24.9){
            System.out.println("Peso normal");
        }
        else if (IMC < 29.9){
            System.out.println("Sobrepeso");
        }
        else{
            System.out.println("Obesidade");
        }

    }


}
