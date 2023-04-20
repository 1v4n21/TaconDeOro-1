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
public class Ruta {
    private ArrayList<String> areaInfluencia = null;
    private ArrayList<String> diasReparto = null;

    public Ruta() {
    }

    public ArrayList<String> getAreaInfluencia() {
        return areaInfluencia;
    }

    public void setAreaInfluencia(ArrayList<String> areaInfluencia) {
        this.areaInfluencia = areaInfluencia;
    }

    public ArrayList<String> getDiasReparto() {
        return diasReparto;
    }

    public void setDiasReparto(ArrayList<String> diasReparto) {
        this.diasReparto = diasReparto;
    }

    @Override
    public String toString() {
        return "Ruta{" + "areaInfluencia=" + areaInfluencia + ", diasReparto=" + diasReparto + '}';
    }

    
}
