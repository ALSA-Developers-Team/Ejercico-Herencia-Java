/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dylan
 */
public class Comic extends Libro {

    private String ilustrador;

    public Comic(String titulo, String autor, int añoPublicacion, double precio, int numeroPaginas, String ilustrador) {
        super(titulo, autor, añoPublicacion, precio, numeroPaginas);
        this.ilustrador = ilustrador;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    @Override
    public String getInfo() {
        return "Comic[" + super.getInfo() + ", ilustrador =" + ilustrador + "]";
    }

}
