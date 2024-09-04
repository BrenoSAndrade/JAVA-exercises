package Veiculo;

public class Main {

    public static void main(String[] args) {
        //psvm para criar automatico ^

        //instanciar objeto
        Carro meuCarro1 = new Carro();
        Carro meuCarro2 = new Carro();

        //utilizar atributos
        meuCarro1.modelo = "SUV";
        meuCarro1.cor = "Prata";
        meuCarro1.ano = "2019";
        meuCarro1.placa = "BEI-7635";

        meuCarro2.modelo = "Sedan";
        meuCarro2.cor = "Preto";
        meuCarro2.ano = "2021";
        meuCarro2.placa = "PAC-5698";

        meuCarro1.exibirInformacoes();
        meuCarro2.exibirInformacoes();
    }
}

