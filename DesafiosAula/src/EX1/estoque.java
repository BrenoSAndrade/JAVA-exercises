package EX1;

public class estoque {

    //atributos
    private String nome = "camiseta";
    private double preco = 120;
    private double quantidade = 1;

    //metodos
    private double valoTotalEstoque(){
        return preco * quantidade;
    }

    public void mostrarInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: R$ " + quantidade);
        System.out.println("Valor total no estoque: R$ " + valoTotalEstoque());

    }

    public void entrada(int quantidadeEntrada){
        if(quantidadeEntrada > 0 ){
            quantidade += quantidadeEntrada;
        }else{
            System.out.println("Quantidade deve ser positiva para dar entrada\n");

        }
    }

    public void saida(int quantidadeSaida) {
        if (quantidadeSaida > 0) {
            if (quantidadeSaida <= quantidade) {
                quantidade -= quantidadeSaida;
            } else {
                System.out.println("Quantidade de saida excede o estoque\n");
            }
        } else {
            System.out.println("Quantidade tem que ser positiva para saida\n");
        }
    }
}
