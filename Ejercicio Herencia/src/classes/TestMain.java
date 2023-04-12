/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Dylan
 */
public class TestMain {

    public static void main(String[] args) {
        Libro l = new Libro("Programación en Java", "Anónimo", 2010, 234, 456);
        Revista r = new Revista("Python desde cero", "John Doe", 2022, 123, "Tecnología");
        Comic c = new Comic("Capitán América", "Stan Lee", 1985, 234, 54, "Stan Lee");
        Periodico p = new Periodico("El Mañana", "La Opinión", 2023, 25, "Noticias");

        System.out.println("Ejemplo de getters y setters: ");
        System.out.println("Libro l:");
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Fecha publicación: " + l.getAñoPublicacion());
        System.out.println("Precio: " + l.getPrecio());
        System.out.println("No. Páginas: " + l.getNumeroPaginas());
        
        l.setAutor("Luis Joyanes");
        System.out.println("Nuevo autor: " + l.getAutor());
        
        System.out.println("");
        System.out.println("Conseguir info de comic que es subclase de libro que es subclase de publicación:");
        System.out.println(c.getInfo());
        
        Inventario i = new Inventario();
        i.agregarPublicacion(l);
        i.agregarPublicacion(r);
        i.agregarPublicacion(c);
        i.agregarPublicacion(p);
        
        System.out.println("");
        System.out.println("Inventario:");
        i.mostrarInventario();
    }
}
