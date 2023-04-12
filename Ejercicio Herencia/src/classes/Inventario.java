/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Dylan
 */
public class Inventario {
    private ArrayList<Publicacion> publicaciones;

    public Inventario(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Inventario() {
        publicaciones = new ArrayList<Publicacion>();
    }
        
    
    public void agregarPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion);
    }
    
    public void mostrarInventario(){
        double total = 0;
        
        for(Publicacion i: publicaciones){
            System.out.println(i.getInfo());
            total += i.getPrecio();
        }
        System.out.println("Total del inventario = $" + total);
    }
}
