package dominio;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Sistema implements Serializable {
    private ArrayList<Tema> listaTemas;
    private ArrayList<Pregunta> listaPreguntas;
    
    public Sistema(){
        this.listaTemas = new ArrayList<>();
        this.listaPreguntas = new ArrayList<>();
    }
    
    public ArrayList<Tema> getListaTemas(){
        return this.listaTemas;
    }
    
    public void agregarTema(Tema unTema){
        this.listaTemas.add(unTema);
    }

    public ArrayList<Pregunta> getListaPreguntas(){
        return this.listaPreguntas;
    }
    
    public void agregarPregunta(Pregunta unaPregunta){
        this.listaPreguntas.add(unaPregunta);
    }
    
    
    public String ingresoTema(String nombre, String descripcion){
        boolean yaExiste = false;
        
        for (Tema tema : this.listaTemas) {
            if (nombre.equalsIgnoreCase(tema.getNombre())) {
               tema.setDescripcion(descripcion);
               yaExiste = true;
               return "Se editó el tema ";
            }
        }
        if (!yaExiste) {
            Tema unTema = new Tema(nombre, descripcion);
            this.agregarTema(unTema);
        }
        return "Se agregó el tema ";
    }
    
    public boolean ingresoPregunta(Tema unTema, String pregunta, String respuesta){
        boolean yaExiste = false;
        
        for (Pregunta preg : this.listaPreguntas) {
            if (pregunta.equalsIgnoreCase(preg.getPregunta())) {
               preg.setRespuesta(respuesta);
               yaExiste = true;
               return yaExiste;
            }
        }
        if (!yaExiste) {
            Pregunta unaPregunta = new Pregunta(unTema, pregunta, respuesta);
            this.agregarPregunta(unaPregunta);
        }
        return yaExiste;
    }
    
    public String[] darTemas(){
        String[] nombresTemas = new String[this.listaTemas.size()];
        int i=0;
        for (Tema tema : this.listaTemas) {
            nombresTemas[i] = tema.getNombre();
            i++;
        } 
        return nombresTemas;
    }
    
    public int getCantPreguntas(Tema unTema){
        int cantPreguntas = 0;
        for (Pregunta pregunta : this.listaPreguntas) {
            if (pregunta.getTema().getNombre().equalsIgnoreCase(unTema.getNombre())) {
                cantPreguntas ++;
            }
        }
        return cantPreguntas;
    }
    
    public Tema getTema(String unTema){
        for (Tema tema : this.listaTemas) {
            if (tema.getNombre().equalsIgnoreCase(unTema)) {
                return tema;
            }
        }
        return null;
    }
    
    public String eliminarTema(Tema unTema){
        if (getCantPreguntas(unTema) == 0) {
            this.listaTemas.remove(unTema);
            return "Se eliminó el tema";
        }
        return "No se pueden eliminar temas con preguntas asignadas";
    }
    
    public String eliminarPregunta(Pregunta unaPregunta){
        this.listaPreguntas.remove(unaPregunta);
        return "Se ha eliminado la pregunta.";
    }
    
    public void cargarDatosPrueba(int cantTemas, int cantPreguntas){
        for(int i = 1; i <= cantTemas ;i++){
            ingresoTema("T:"+i,"Descripción de T"+i);
            for (int j = 1; j <= cantPreguntas; j++) {
                ingresoPregunta(getTema("T:"+i),"T:"+i+" P:"+j+" Texto de P"+j,"T:"+i+" P:"+j+" Respuesta de P"+j);
            }
        }  
    }
    
    public ArrayList<Pregunta> darPreguntas(ArrayList<Tema> temasSeleccionados, int cantPreguntas){
        Random numero = new Random();
        
        ArrayList<Pregunta> listaPreguntasTemas = new ArrayList<Pregunta>();
        for (Tema tema : temasSeleccionados) {
            for(Pregunta preg : getListaPreguntas()){
                if(preg.getTema().equals(tema)){
                    listaPreguntasTemas.add(preg);
                }
            }
        }
        
        if(listaPreguntasTemas.size() < cantPreguntas){
            return listaPreguntasTemas;
        }else{
            int index = numero.nextInt(listaPreguntasTemas.size() - 1);
            int pregAEliminar = listaPreguntasTemas.size() - cantPreguntas;
            for (int i = 0; i < pregAEliminar; i++){
                listaPreguntasTemas.remove(index);
                index = numero.nextInt(listaPreguntasTemas.size() - 1);
            }
            return listaPreguntasTemas;
        }
        
        
    }
}
