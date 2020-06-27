package dominio;
import java.util.ArrayList;

public class Juego {
    private ArrayList<Tema> temasElegidos;
    private ArrayList<Pregunta> preguntasSeleccionadas;

    public Juego(ArrayList<Tema> temasSeleccionados, ArrayList<Pregunta> preguntasAleatorias) {
        this.temasElegidos = temasSeleccionados;
        this.preguntasSeleccionadas = preguntasAleatorias;
    }

    public ArrayList<Tema> getTemasElegidos() {
        return temasElegidos;
    }
    
    public ArrayList<Pregunta> getPreguntas() {
        return preguntasSeleccionadas;
    }
}
