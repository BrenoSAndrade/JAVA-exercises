public class Car {

    private String marca;
    private String  modelo;
    private int ano;
    private double value;

    Car(String marca, String modelo, int ano, double value) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.value = value;
    }

    public double sellValue() {
        double finalvalue = ((value * 0.1) + value);
        return finalvalue;
    }

   public String getMarca() {
        return marca;
   }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }


}
