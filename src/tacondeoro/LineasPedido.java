/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacondeoro;

/**
 *
 * @author felis
 */
public class LineasPedido {
    private int idLineaPedido;
    private Articulos articuloIncluido;
    private Pedido pedidoAlQuePertenece;
    private int cantidad;

    public LineasPedido() {
    }

    public LineasPedido(int cantidad) {
        this.cantidad = cantidad;
    }

    public LineasPedido(int idLineaPedido, Articulos articuloIncluido, Pedido pedidoAlQuePertenece, int cantidad) {
        this.idLineaPedido = idLineaPedido;
        this.articuloIncluido = articuloIncluido;
        this.pedidoAlQuePertenece = pedidoAlQuePertenece;
        this.cantidad = cantidad;
    }

    public Articulos getArticuloIncluido() {
        return articuloIncluido;
    }

    public void setArticuloIncluido(Articulos articuloIncluido) {
        this.articuloIncluido = articuloIncluido;
    }

    public int getIdLineaPedido() {
        return idLineaPedido;
    }

    public void setIdLineaPedido(int idLineaPedido) {
        this.idLineaPedido = idLineaPedido;
    }

    public Pedido getPedidoAlQuePertenece() {
        return pedidoAlQuePertenece;
    }

    public void setPedidoAlQuePertenece(Pedido pedidoAlQuePertenece) {
        this.pedidoAlQuePertenece = pedidoAlQuePertenece;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineasPedido{" + "idLineaPedido=" + idLineaPedido + ", articuloIncluido=" + articuloIncluido + ", pedidoAlQuePertenece=" + pedidoAlQuePertenece + ", cantidad=" + cantidad + '}';
    }
    
     
    
    
}
