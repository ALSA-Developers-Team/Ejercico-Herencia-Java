/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dylan
 */
public class Periodico extends Publicacion {

    private String periodicidad;

    public Periodico(String titulo, String autor, int añoPublicacion, double precio, String periodicidad) {
        super(titulo, autor, añoPublicacion, precio);
        this.periodicidad = periodicidad;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String getInfo() {
        return "Periodico[" + super.getInfo() + ", periodicidad=" + periodicidad + "]";
    }

}
