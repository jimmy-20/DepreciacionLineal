/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class ActivoFijo {
    private String nombre;
    private float depreciacion;

    public ActivoFijo(String nombre, float depreciacion) {
        this.nombre = nombre;
        this.depreciacion = depreciacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDepreciacion() {
        return depreciacion;
    }

    public void setDepreciacion(float depreciacion) {
        this.depreciacion = depreciacion;
    }
    
    
}
