/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacondeoro;

/**
 *
 * @author felis
 */
public class Bolso extends Articulos{

    public Bolso() {
    }

    public Bolso(int idArticulo, String nombre, String descripcion, String material, double precio, int stock, String fotografia) {
        super(idArticulo, nombre, descripcion, material, precio, stock, fotografia);
    }

    public Bolso(String nombre, String descripcion, String material, double precio, int stock, String fotografia) {
        super(nombre, descripcion, material, precio, stock, fotografia);
    }

    private String tipo;
    //Esto esta incompleto
    
}
