/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dylan
 */
public class Libro extends Publicacion {

    private int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, double precio, int numeroPaginas) {
        super(titulo, autor, añoPublicacion, precio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getInfo() {
        return "Libro[" + super.getInfo() + ", numeroPaginas=" + numeroPaginas + "]";
    }

}
