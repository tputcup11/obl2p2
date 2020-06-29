package dominio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Memory extends Juego {
    private HashMap<Pregunta, Integer[]> preguntas;
    private HashMap<Pregunta, Integer[]> respuestas;
    
    public Memory(ArrayList<Tema> temasSeleccionados, ArrayList<Pregunta> preguntasSeleccionadas) throws Exception{
        super(temasSeleccionados, preguntasSeleccionadas);
        
        if(preguntasSeleccionadas.size() < 6){
          throw new Exception("Preguntas Insuficientes");  
        }
        //En el hashmap de preguntas van todas las preguntas de los botones de pregunta, y en el de respuesta las respuestas correspondientes a los botones de respuestas.
        preguntas = new HashMap<Pregunta, Integer[]>();
        respuestas = new HashMap<Pregunta, Integer[]>();
        //Se cargan los hashmaps eligiendo aleatoriamente numeros de fila y columna para cada preg/resp.
        for(Pregunta preg : preguntasSeleccionadas){
            this.agregarAGrilla(preg, preguntas);
            this.agregarAGrilla(preg, respuestas);
        }
    }
    
   
    public HashMap<Pregunta, Integer[]> getHashMapPreguntas() {
        return this.preguntas;
    }

    public HashMap<Pregunta, Integer[]> getHashMapRespuestas() {
        return this.respuestas;
    }
    
    public Pregunta getPregunta(int fila, int columna) {
        Iterator<Pregunta> itKP = this.preguntas.keySet().iterator();
        Iterator<Integer[]> itVP = this.preguntas.values().iterator();
        while(itKP.hasNext()){
            Integer[] posicion = itVP.next();
            if (posicion[0] == fila && posicion[1] == columna) {
               return itKP.next();
            }
        }
        
        Iterator<Pregunta> itKR = this.respuestas.keySet().iterator();
        Iterator<Integer[]> itVR = this.respuestas.values().iterator();
        while(itKR.hasNext()){
            Integer[] posicion = itVR.next();
            if (posicion[0] == fila && posicion[1] == columna) {
               return itKR.next();
            }
        }
        return null;
    }
    
    public String darTipo(int fila, int columna){
        Iterator<Pregunta> itKP = this.preguntas.keySet().iterator();
        Iterator<Integer[]> itVP = this.preguntas.values().iterator();
        while(itKP.hasNext()){
            Integer[] posicion = itVP.next();
            if (posicion[0] == fila && posicion[1] == columna) {
               return "Pregunta";
            }
        }
        
        Iterator<Pregunta> itKR = this.respuestas.keySet().iterator();
        Iterator<Integer[]> itVR = this.respuestas.values().iterator();
        while(itKR.hasNext()){
            Integer[] posicion = itVR.next();
            if (posicion[0] == fila && posicion[1] == columna) {
               return "Respuesta";
            }
        }
        return null; 
    } 
    
    private void agregarAGrilla(Pregunta preg, HashMap<Pregunta, Integer[]> hash){
        Random numero = new Random();
        boolean recorrido = false;
        int i = numero.nextInt(3);
        int j = numero.nextInt(4);
        
        //Se generan numeros aleatorios para poner la pregunta o respuesta en la grilla, se verifica que no esten ocupada la posicion resultante
        while(!recorrido){
            boolean libre = true;
            recorrido = false;
            Iterator<Integer[]> itPreg = this.preguntas.values().iterator();
            Iterator<Integer[]> itResp = this.respuestas.values().iterator();
            while(itPreg.hasNext() && libre){
                Integer[] arr1 = itPreg.next();
                if ((arr1[0] == i && arr1[1] == j)) {
                    libre = false;
                }
            }
            while(itResp.hasNext() && libre){
                Integer[] arr2 = itResp.next();
                if((arr2[0] == i && arr2[1] == j)){
                    libre = false;
                }
            }
            
            if (libre) {
                recorrido = true;
            }else{
                i = numero.nextInt(3);
                j = numero.nextInt(4); 
            }
        }
        //Agrego la pregunta o respuesta en la posicion generada anteriormente
        Integer[] arr = new Integer[2];
        arr[0] = i;
        arr[1] = j;
        hash.put(preg, arr);
    }
}
