package gamification;
import dominio.*;
import interfaz.*;

public class Gamification {
    public static void main(String[] args) {
        Sistema sistema = Utilidades.desSerializar();
        VentanaMenu menu = new VentanaMenu(sistema);
        menu.setVisible(true);
    }
}
