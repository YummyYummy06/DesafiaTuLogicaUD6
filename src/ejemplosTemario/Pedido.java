package ejemplosTemario;

import java.util.ArrayList;

public class Pedido {

    private int numeroPedido;
    private Usuario cliente;
    private ArrayList<Producto> listaProductos;

    public Pedido(int numeroPedido, Usuario cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaProductos = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void addProducto(Producto producto) {
        listaProductos.add(producto);
    }
}
