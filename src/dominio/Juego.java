package dominio;
import java.util.ArrayList;

public class Juego {
    private ArrayList temasElegidos;
    private ArrayList preguntasSeleccionadas;

    public Juego(ArrayList<Tema> temasSeleccionados) {
        this.temasElegidos = temasSeleccionados;
        this.preguntasSeleccionadas = new ArrayList<Pregunta>();
        //TODO: Ejecutar metodo que trae preguntas de los temas seleccionados (quiza va en Sistema y aca se trae el array listo).
    }

    public ArrayList getTemasElegidos() {
        return temasElegidos;
    }
    
    public ArrayList getPreguntas() {
        return preguntasSeleccionadas;
    }
}
