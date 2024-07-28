package models;

import java.util.ArrayList;
import java.util.List;

public class CartãoDeCredito {

    private double limite;
    private double saldo;
    private List<Compras> compras;

    public CartãoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public boolean adicionarCompra(Compras compras) {
        if (this.saldo > compras.getValor()) {
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
        return false;
    }
}
