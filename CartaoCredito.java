import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limiteCartao;
    private double saldo;
    private List<MenuCompras> compras;

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<MenuCompras> getCompras() {
        return compras;
    }

    public CartaoCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo =limiteCartao;
        this.compras=new ArrayList<>();
    }
    public boolean addCompra(MenuCompras compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
