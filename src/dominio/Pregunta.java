package dominio;
import java.io.*;

public class Pregunta implements Serializable {
    private Tema tema;
    private String pregunta;
    private String respuesta;

    public Pregunta(Tema unTema, String unaPregunta, String unaRespuesta) {
        this.tema = unTema;
        this.pregunta = unaPregunta;
        this.respuesta = unaRespuesta;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema unTema) {
        this.tema = unTema;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String unaPregunta) {
        this.pregunta = unaPregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String unaRespuesta) {
        this.respuesta = unaRespuesta;
    }
    
}
