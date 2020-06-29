package dominio;
import java.util.ArrayList;

public class FlashCards extends Juego{
    private Pregunta preguntaActual;
    private boolean mostrarRespuesta;
    
    public FlashCards(ArrayList<Tema> temasSeleccionados, ArrayList<Pregunta> preguntasSeleccionadas){
        super(temasSeleccionados, preguntasSeleccionadas);
        this.preguntaActual = preguntasSeleccionadas.get(0);
        this.mostrarRespuesta = false;
    }
    
    public Pregunta getPreguntaActual(){
        return this.preguntaActual;
    }
    
    private void setPreguntaActual(Pregunta pregunta){
        this.preguntaActual = pregunta;
    }
    
    public boolean getMostrarRespuesta(){
        return this.mostrarRespuesta;
    }
    
    public void setMostrarRespuesta(boolean valor){
        this.mostrarRespuesta = valor;
    }
    
    public void siguientePregunta() throws Exception{
        this.setMostrarRespuesta(false);
        for (int i = 0; i < this.getPreguntas().size(); i++) {
            if (this.getPreguntas().get(i).equals(this.getPreguntaActual())) {
               this.setPreguntaActual(this.getPreguntas().get(i+1));
               break;
            }
        }
    }
    
    public void anteriorPregunta() throws Exception{
        this.setMostrarRespuesta(false);
        for (int i = 0; i < this.getPreguntas().size(); i++) {
            if (this.getPreguntas().get(i).equals(this.getPreguntaActual())) {
               this.setPreguntaActual(this.getPreguntas().get(i-1));
               break;
            }
        }
    }
    
 
}
