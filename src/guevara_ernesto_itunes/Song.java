/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guevara_ernesto_itunes;

/**
 *
 * @author ernes
 */
public class Song {
    
    private String nombre;
    private int codigo, sumaestrellas, reviews;
    private double precio;
    
    public Song(String nombre, int codigo, double precio){
        this.nombre=nombre;
        this.codigo=codigo;
        this.precio=precio;
        sumaestrellas=0;
        reviews=0;
    }
    
    public Song(){
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void addStars(int cantidadestrellas){
        if(cantidadestrellas>=0 && cantidadestrellas<=5){
            sumaestrellas+=cantidadestrellas;
            reviews++;
        }
    }
    
    public double songRating(){
        double ratingcancion=sumaestrellas/reviews;
        return ratingcancion;
    }
    
    public String print(){
    String ratingText;
    String cancion;
    if (reviews == 0) {
        ratingText = "No hay Reseñas";
        cancion="Codigo: "+codigo+" - "+"Nombre: "+nombre+" - "+"Precio: "+precio+" - "+"Rating: "+ratingText;
    } else {
        double rating = songRating();
        cancion="Codigo: "+codigo+" - "+"Nombre: "+nombre+" - "+"Precio: "+precio+" - "+"Rating: "+rating;
    }
        return cancion;
    }
    
    
}
