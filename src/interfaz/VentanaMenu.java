package interfaz;
import dominio.*;
public class VentanaMenu extends javax.swing.JFrame {


    public VentanaMenu(Sistema sistema) {
        modeloSistema = sistema;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGestTemas = new javax.swing.JButton();
        btnGestPreguntas = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnExportarDatos = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gamification");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a Gamification");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 240, 14);

        btnGestTemas.setText("Gestionar Temas");
        btnGestTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestTemasActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestTemas);
        btnGestTemas.setBounds(100, 70, 160, 23);

        btnGestPreguntas.setText("Gestionar Preguntas");
        btnGestPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestPreguntasActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestPreguntas);
        btnGestPreguntas.setBounds(100, 110, 160, 23);

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(100, 150, 160, 23);

        btnExportarDatos.setText("Exportar Datos");
        getContentPane().add(btnExportarDatos);
        btnExportarDatos.setBounds(100, 190, 160, 23);

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminar);
        btnTerminar.setBounds(100, 230, 160, 23);

        setBounds(0, 0, 377, 334);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestTemasActionPerformed
        VentanaTemas vntTemas = new VentanaTemas(modeloSistema);
        vntTemas.setVisible(true);
    }//GEN-LAST:event_btnGestTemasActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        Utilidades.serializar(modeloSistema);
        this.dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnGestPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestPreguntasActionPerformed
        VentanaPreguntas vntPreguntas = new VentanaPreguntas(modeloSistema);
        vntPreguntas.setVisible(true);
    }//GEN-LAST:event_btnGestPreguntasActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        VentanaJugar vntJugar = new VentanaJugar(modeloSistema);
        vntJugar.setVisible(true);
    }//GEN-LAST:event_btnJugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportarDatos;
    private javax.swing.JButton btnGestPreguntas;
    private javax.swing.JButton btnGestTemas;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Sistema modeloSistema;
}
