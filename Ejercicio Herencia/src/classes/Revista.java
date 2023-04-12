/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dylan
 */
public class Revista extends Publicacion {

    private String tematica;

    public Revista(String titulo, String autor, int añoPublicacion, double precio, String tematica) {
        super(titulo, autor, añoPublicacion, precio);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String getInfo() {
        return "Revista[" + super.getInfo() + ", tematica=" + tematica + "]";
    }
}
