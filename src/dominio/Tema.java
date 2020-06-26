package dominio;
import java.io.*;
public class Tema implements Serializable{
    private String nombre;
    private String descripcion;

    public Tema(String unNombre, String unaDescripcion) {
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String unaDescripcion){
        this.descripcion = unaDescripcion;
    }
    
}
