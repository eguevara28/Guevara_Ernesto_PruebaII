/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guevara_ernesto_itunes;

/**
 *
 * @author ernes
 */
public class JTunes {
    
    public static Song[] songs;
    private static Song s=new Song();
    
    public JTunes(int tamaño){
        songs=new Song[tamaño];
    }
    
    public JTunes(){}
    
    public boolean addSong(int codigo, String nombre, double precio){
        if(searchSong(codigo)==null){
            for (int i = 0; i < songs.length; i++) {
                if(songs[i]==null){
                    songs[i]=new Song(nombre, codigo, precio);
                    return true;
                }
            }
        }
        return false;
    }

    
    public Song searchSong(int codigo) {
        for (Song c : songs) {
            if (c != null && c.getCodigo()==codigo) {
                return c;
            }
        }
        return null;
    }
    
    public String rateSong(int codigo, int cantidadestrella){
        if(searchSong(codigo)!=null){
            Song s=searchSong(codigo);
            s.addStars(cantidadestrella);
            return s.print();
        }
        return "No existe esta cancion";
    }
    
    public String[] printSongs(){
        String[] mostrarcanciones=new String[songs.length];
        int indice=0;
        for(Song c : songs){
            if(c!=null){
                    mostrarcanciones[indice]=c.print();
                    indice++;
                }
            }
        return mostrarcanciones;
    }
    
    
}
