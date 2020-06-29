package interfaz;
import dominio.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Iterator;
import javax.swing.*;

public class VentanaMemory extends javax.swing.JFrame {

    public VentanaMemory(Memory memory) {
        modeloJuego = memory;
        initComponents();
        segundoBoton = false;
        botones = new JButton[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new ListenerBoton(i,j));
                panelInferior.add(jButton);
                botones[i][j] = jButton;
                botones[i][j].setMargin(new Insets(-5, -5, -5, -5));
                botones[i][j].setText("<html><p>"+"-"+"</p></html>");
            }
        }
    }
    
    private class ListenerBoton implements ActionListener {
        private int x;
        private int y;
        public ListenerBoton(int i, int j) {
        // en el constructor se almacena la fila y columna que se presionó
        x = i;
        y = j;
        }
        public void actionPerformed(ActionEvent e) {
        // cuando se presiona un botón, se ejecutará este método
        clickBoton(x, y);
        }
    }
    
    private void clickBoton(int fila, int columna) {
        System.out.println(fila+" "+columna);
        //if (segundoBoton) {
            
            
            
            segundoBoton = false;
        //}else{
            botones[fila][columna].setBackground(Color.YELLOW);
            if (modeloJuego.darTipo(fila, columna).equalsIgnoreCase("Pregunta")) {
                botones[fila][columna].setText("<html><p style=\"color:red;\">"+modeloJuego.getPregunta(fila, columna).getPregunta()+"</p></html>"); 
            }else{
                botones[fila][columna].setText("<html><p style=\"color:blue;\">"+modeloJuego.getPregunta(fila, columna).getRespuesta()+"</p></html>");
            }
            filaAnterior = fila;
            columnaAnterior = columna;
            segundoBoton = true;
        //}
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        btnAyudaParcial = new javax.swing.JButton();
        btnAyudaTotal = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSonido = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        btnAyudaParcial.setText("Ayuda Parcial");
        btnAyudaParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaParcialActionPerformed(evt);
            }
        });
        panelSuperior.add(btnAyudaParcial);

        btnAyudaTotal.setText("Ayuda Total");
        btnAyudaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaTotalActionPerformed(evt);
            }
        });
        panelSuperior.add(btnAyudaTotal);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 102, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelSuperior.add(btnReset);

        btnSonido.setText("Sonido");
        panelSuperior.add(btnSonido);

        lblPuntos.setText("Puntos: ....");
        panelSuperior.add(lblPuntos);

        getContentPane().add(panelSuperior);

        panelInferior.setLayout(new java.awt.GridLayout(3, 4));
        getContentPane().add(panelInferior);

        setBounds(0, 0, 982, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaParcialActionPerformed
        //Mostrar Preguntas
        Iterator<Integer[]> itVP = modeloJuego.getHashMapPreguntas().values().iterator();
        while(itVP.hasNext()){
            Integer[] posicion = itVP.next();
            botones[posicion[0]][posicion[1]].setText("<html><p style=\"color:red;\">"+"Pregunta"+"</p></html>");
        }
        //Mostrar Respuestas
        Iterator<Integer[]> itVR = modeloJuego.getHashMapRespuestas().values().iterator();
        while(itVR.hasNext()){
            Integer[] posicion = itVR.next();
            botones[posicion[0]][posicion[1]].setText("<html><p style=\"color:blue;\">"+"Respuesta"+"</p></html>");
        }
    }//GEN-LAST:event_btnAyudaParcialActionPerformed

    private void btnAyudaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaTotalActionPerformed
        //Mostrar Preguntas
        Iterator<Pregunta> itKP = modeloJuego.getHashMapPreguntas().keySet().iterator();
        Iterator<Integer[]> itVP = modeloJuego.getHashMapPreguntas().values().iterator();
        while(itKP.hasNext()){
            Integer[] posicion = itVP.next();
            botones[posicion[0]][posicion[1]].setText("<html><p style=\"color:red;\">"+itKP.next().getPregunta()+"</p></html>");
        }
        //Mostrar Respuestas
        Iterator<Pregunta> itKR = modeloJuego.getHashMapPreguntas().keySet().iterator();
        Iterator<Integer[]> itVR = modeloJuego.getHashMapRespuestas().values().iterator();
        while(itKR.hasNext()){
            Integer[] posicion = itVR.next();
            botones[posicion[0]][posicion[1]].setText("<html><p style=\"color:blue;\">"+itKR.next().getRespuesta()+"</p></html>");
        }
    }//GEN-LAST:event_btnAyudaTotalActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                botones[i][j].setText("<html><p>"+"-"+"</p></html>");
            }
        }
    }//GEN-LAST:event_btnResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyudaParcial;
    private javax.swing.JButton btnAyudaTotal;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSonido;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
    private JButton[][] botones;
    private Memory modeloJuego;
    private boolean segundoBoton;
    private int filaAnterior;
    private int columnaAnterior;
}
