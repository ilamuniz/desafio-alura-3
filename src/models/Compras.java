package models;

public class Compras implements Comparable<Compras> {

    private String descricao;
    private double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: " +
                "descricao ='" + descricao + '\'' +
                ", valor =" + valor +
                '}';
    }

    @Override
    public int compareTo(Compras novaCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(novaCompra.valor));
    }
}
