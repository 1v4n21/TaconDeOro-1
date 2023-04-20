/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacondeoro;

import java.util.ArrayList;

/**
 *
 * @author cpere
 */
public class EmpresaDeTransporte {
    private String nombre;
    private String  CIF;
    private String domicilioFiscal;
    private ArrayList<Ruta> ruta=null;
    
    public EmpresaDeTransporte() {
    }

    public EmpresaDeTransporte(String nombre, String CIF, String domicilioFiscal) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.domicilioFiscal = domicilioFiscal;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public ArrayList<Ruta> getRuta() {
        return ruta;
    }

    public void setRuta(ArrayList<Ruta> ruta) {
        this.ruta = ruta;
    }
    

    @Override
    public String toString() {
        return "EmpresaDeTransporte{" + "nombre=" + nombre + ", CIF=" + CIF + ", domicilioFiscal=" + domicilioFiscal + ", ruta=" + ruta + '}';
    }
    

  
    
}
