package interfaz;
import dominio.*;
import javax.swing.DefaultListModel; 
public class VentanaJugar extends javax.swing.JFrame {

    public VentanaJugar(Sistema sistema) {
        modelo = sistema;
        modeloListaTemas = new DefaultListModel();
        modeloListaElegidos = new DefaultListModel();
        initComponents();
        update();
    }
    
    
    public void update(){
        for (String nombreTema : modelo.darTemas()) {
            modeloListaTemas.addElement(nombreTema);
        }
        lstListaTemas.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJugar = new javax.swing.JPanel();
        btnFlashCards = new javax.swing.JButton();
        btnMemory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListaTemas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstListaElegidos = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnQuitarTema = new javax.swing.JButton();
        btnElegirTema = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlJugar.setLayout(null);

        btnFlashCards.setText("FLASHCARDS");
        pnlJugar.add(btnFlashCards);
        btnFlashCards.setBounds(190, 370, 173, 51);

        btnMemory.setText("MEMORY");
        pnlJugar.add(btnMemory);
        btnMemory.setBounds(370, 370, 173, 51);

        jLabel1.setText("ELIGE LOS TEMAS PARA JUGAR");
        pnlJugar.add(jLabel1);
        jLabel1.setBounds(250, 0, 310, 40);

        lstListaTemas.setModel(modeloListaTemas);
        jScrollPane1.setViewportView(lstListaTemas);

        pnlJugar.add(jScrollPane1);
        jScrollPane1.setBounds(100, 70, 160, 280);

        lstListaElegidos.setModel(modeloListaElegidos);
        jScrollPane2.setViewportView(lstListaElegidos);

        pnlJugar.add(jScrollPane2);
        jScrollPane2.setBounds(450, 70, 160, 280);
        pnlJugar.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 720, 10);

        btnQuitarTema.setText("<=");
        btnQuitarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTemaActionPerformed(evt);
            }
        });
        pnlJugar.add(btnQuitarTema);
        btnQuitarTema.setBounds(330, 200, 50, 40);

        btnElegirTema.setText("=>");
        btnElegirTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirTemaActionPerformed(evt);
            }
        });
        pnlJugar.add(btnElegirTema);
        btnElegirTema.setBounds(330, 140, 50, 40);

        jLabel2.setText("Lista de Temas:");
        pnlJugar.add(jLabel2);
        jLabel2.setBounds(100, 50, 160, 14);

        jLabel3.setText("Temas Elegidos:");
        pnlJugar.add(jLabel3);
        jLabel3.setBounds(450, 50, 160, 14);

        getContentPane().add(pnlJugar);
        pnlJugar.setBounds(20, 20, 720, 440);

        setBounds(0, 0, 774, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void btnElegirTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirTemaActionPerformed
        lstListaTemas.getSelectedValuesList().stream().forEach((data) -> {
            modeloListaElegidos.addElement(data);
            modeloListaTemas.removeElement(data);
        });
        lstListaTemas.revalidate();
        lstListaElegidos.revalidate();
    }//GEN-LAST:event_btnElegirTemaActionPerformed

    private void btnQuitarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTemaActionPerformed
        lstListaElegidos.getSelectedValuesList().stream().forEach((data) -> {
            modeloListaTemas.addElement(data);
            modeloListaElegidos.removeElement(data);
        });
        lstListaTemas.revalidate();
        lstListaElegidos.revalidate();
    }//GEN-LAST:event_btnQuitarTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElegirTema;
    private javax.swing.JButton btnFlashCards;
    private javax.swing.JButton btnMemory;
    private javax.swing.JButton btnQuitarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lstListaElegidos;
    private javax.swing.JList<String> lstListaTemas;
    private javax.swing.JPanel pnlJugar;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private DefaultListModel modeloListaTemas;
    private DefaultListModel modeloListaElegidos;

}
