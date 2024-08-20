import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Digite o Limite do Cartão");
        double limite=scan.nextDouble();
        CartaoCredito cartao=new CartaoCredito(limite);
        int i=1;
        do {
            System.out.println("Descrição do Produto: ");
            String desc=scan.next();

            System.out.println("Valor do Produto: ");
            double valor= scan.nextDouble();

            MenuCompras compras=new MenuCompras(desc,valor);
            boolean compraRealizada=cartao.addCompra(compras);

            if (compraRealizada){
                System.out.println("Compra realizada");
                System.out.println("Digite 0 se deseja sair ou 1 para Continuar");
                i=scan.nextInt();

            }else {
                System.out.println("Saldo insuficiente");
                i=0;
            }
            System.out.println("|||||||||||||||||||||||||||");
            
            for (MenuCompras c : cartao.getCompras()) {
                System.out.println(c.getDescProduto()+ " "+c.getValor());
            }
            System.out.println("Saldo Cartão: "+ cartao.getSaldo());




        }while(i!=0);






    }


}
