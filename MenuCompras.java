public class MenuCompras implements Comparable<MenuCompras>{
    private String descProduto;
    private double valor;

    public MenuCompras(String descProduto, double valor) {
        this.descProduto = descProduto;
        this.valor = valor;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "MenuCompras { " + "descProduto='" + descProduto + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(MenuCompras outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
