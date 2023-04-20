/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacondeoro;

import java.util.ArrayList;

/**
 *
 * @author felis
 */
public class Pedido {
    private int idPedido;
    private String fecha;
    private double totalPedido;
    private ArrayList<LineasPedido> nLineas;
    private int nSocio;
    private Socio socioPedidoId;
    private Ruta rutaPedidoId;

    public Pedido() {
    }

    public Pedido( String fecha, double totalPedido, ArrayList<LineasPedido> nLineas) {
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.nLineas = nLineas;
    }

    public Pedido(int idPedido, String fecha, double totalPedido, ArrayList<LineasPedido> nLineas, int nSocio, Socio socioPedidoId, Ruta rutaPedidoId) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.nLineas = nLineas;
        this.nSocio = nSocio;
        this.socioPedidoId = socioPedidoId;
        this.rutaPedidoId = rutaPedidoId;
    }

    

    public int getIdPedido() {
        return idPedido;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public ArrayList<LineasPedido> getnLineas() {
        return nLineas;
    }

    public void setnLineas(ArrayList<LineasPedido> nLineas) {
        this.nLineas = nLineas;
    }

    public int getnSocio() {
        return nSocio;
    }

    
    
    
}
