package interfaz;
import dominio.*;
public class VentanaFlashCards extends javax.swing.JFrame {

    public VentanaFlashCards(FlashCards flashCards) {
        modeloJuego = flashCards;
        initComponents();
        title = "";
        for (Tema tema : modeloJuego.getTemasElegidos()) {
            title += tema.getNombre() + " ";
        }
        this.setTitle(title);
        this.update();
    }
    
    public void update(){
        if (modeloJuego.getMostrarRespuesta()) {
            this.btnPregResp.setText(modeloJuego.getPreguntaActual().getRespuesta());
        }else{
           this.btnPregResp.setText(modeloJuego.getPreguntaActual().getPregunta()); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiguiente = new javax.swing.JButton();
        btnPregResp = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente);
        btnSiguiente.setBounds(700, 110, 130, 50);

        btnPregResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPregRespActionPerformed(evt);
            }
        });
        getContentPane().add(btnPregResp);
        btnPregResp.setBounds(220, 70, 460, 140);

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(60, 120, 130, 50);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("FlashCards");
        lblTitulo.setToolTipText("");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(380, 10, 130, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 40, 870, 10);

        setBounds(0, 0, 890, 276);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        try{
            modeloJuego.anteriorPregunta();
            this.update();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        try{
            modeloJuego.siguientePregunta();
            this.update();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnPregRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPregRespActionPerformed
        if (modeloJuego.getMostrarRespuesta()){
            modeloJuego.setMostrarRespuesta(false);
            this.update();
        }else{
           modeloJuego.setMostrarRespuesta(true);
           this.update();
        }
    }//GEN-LAST:event_btnPregRespActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnPregResp;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
    private FlashCards modeloJuego;
    private String title;
}
