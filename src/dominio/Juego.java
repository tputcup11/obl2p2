package dominio;
import java.util.ArrayList;

public class Juego {
    private ArrayList temasElegidos;
    private ArrayList preguntasSeleccionadas;

    public Juego(ArrayList<Tema> temasSeleccionados, ArrayList<Pregunta> preguntasAleatorias) {
        this.temasElegidos = temasSeleccionados;
        this.preguntasSeleccionadas = preguntasAleatorias;
    }

    public ArrayList getTemasElegidos() {
        return temasElegidos;
    }
    
    public ArrayList getPreguntas() {
        return preguntasSeleccionadas;
    }
}
