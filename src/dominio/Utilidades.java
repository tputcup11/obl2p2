package dominio;
import java.io.*;
import java.util.Date;

public class Utilidades {

    public static void serializar(Sistema sistema){
        // Guardamos los objetos en un archivo 
        try {
            FileOutputStream archivo = new FileOutputStream("datosSistema");
            ObjectOutputStream out = new ObjectOutputStream(archivo);
            out.writeObject(sistema);
            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println("No se puede crear el archivo");
        }
        catch (IOException e){
            System.out.println("No se puede guardar datos en el archivo");
        }       
    }
    
    public static Sistema desSerializar(){
        Sistema sistema = new Sistema();
        try {
            FileInputStream archivo = new FileInputStream("datosSistema");
            ObjectInputStream in = new ObjectInputStream(archivo);
            sistema = (Sistema)in.readObject();
            in.close();
        }
        catch (FileNotFoundException e){           
            System.out.println("No se puede acceder el archivo");
        }
        catch (ClassNotFoundException e){
            System.out.println("Error en la clase serializada");
        }
        catch (IOException e){
            System.out.println("No se puede leer datos desde el archivo");
        }
        return sistema;
    }
    
    public static String cargaMasiva(String path, Sistema sistema){
        ArchivoLectura arch = new ArchivoLectura(path);
        int preguntasCreadas = 0;
        int preguntasModificadas = 0;
        int erroneas = 0;
        //Leer archivo
        while (arch.hayMasLineas()){
            String tema = arch.linea();
            String pregunta = "";
            String respuesta = "";
            //Leer las siguientes 2 lineas.
            for (int i = 0; i < 2 && arch.hayMasLineas(); i++) {
                switch (i) {
                    case 0:
                        pregunta = arch.linea(); 
                        break;
                    case 1:
                        respuesta = arch.linea();
                        break;
                }
            }
            //Verificar pregunta válida
            if (!tema.trim().isEmpty() && !pregunta.trim().isEmpty() && !respuesta.trim().isEmpty()){
                //Verificar si existe el tema -> Si no existe crearlo.
                boolean existeTema = false;
                boolean existePregunta;
                for (Tema unTema : sistema.getListaTemas()) {
                    if (unTema.getNombre().equalsIgnoreCase(tema)) {
                        existeTema = true;
                    }
                }
                if (!existeTema) {
                    sistema.ingresoTema(tema, "A COMPLETAR");
                }
                //Cargar Pregunta y guardar boolean recibido para saber si se creó o modificó la pregunta.
                existePregunta = sistema.ingresoPregunta(sistema.getTema(tema), pregunta, respuesta);
               
                //Sumar contadores segun correponda.
                if (existePregunta) {
                    preguntasModificadas++;
                }else{
                    preguntasCreadas++;
                }
                
            }else{
                //Sumar contador si la pregunta no es válida.
                erroneas++;
            }

        }
        arch.cerrar();
        //Escribir en bitacora.txt
        ArchivoGrabacion archB = new ArchivoGrabacion("BITACORA.txt", true);
        archB.grabarLinea("Preguntas Nuevas Ingresadas: "+preguntasCreadas+"; Preguntas Actualizadas: "+preguntasModificadas+"; Preguntas Ignoradas:"+erroneas+"; Fecha:"+ new Date());
        archB.cerrar();
        
        return "Preguntas Nuevas Ingresadas: "+preguntasCreadas+"; Preguntas Actualizadas: "+preguntasModificadas+"; Preguntas Ignoradas:"+erroneas;
    }
}
