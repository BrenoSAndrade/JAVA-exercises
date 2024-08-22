public class Main {
    public static void main(String[] args) {
        // priceproduct = 10
        // comprar somente entre 10 e 15
      int priceProduct = 10;
      boolean buy = priceProduct >= 10 && priceProduct <= 20;
      System.out.println(buy);
      // or
        boolean temEmprego =  true;
        boolean temEmpresa = false;
        boolean tem50k = true;
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
        System.out.println(podeFinanciar);

    }
}