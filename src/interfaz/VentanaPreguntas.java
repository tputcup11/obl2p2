
package interfaz;
import dominio.*;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class VentanaPreguntas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPreguntas
     * @param sistema
     */
    public VentanaPreguntas(Sistema sistema) {
        modelo = sistema;
        initComponents();
        update();
    }
    public void update(){
        //Vacía y carga comboBox
        cmbTemas.removeAllItems();
        for (Tema tema : modelo.getListaTemas()) {
            cmbTemas.addItem(tema.getNombre());
        }
        //Vaciar y cargar filas de tabla
        DefaultTableModel tabla = (DefaultTableModel) tblPreguntas.getModel();
        tabla.setRowCount(0);
        for (Pregunta pregunta : modelo.getListaPreguntas()){
            Object[] fila = {pregunta.getTema().getNombre(), pregunta.getPregunta()};
            tabla.addRow(fila);
        }
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbTemas = new javax.swing.JComboBox<>();
        lblTema = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreguntas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCon = new javax.swing.JButton();
        lblTitulo2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnCargarDesdeArchivo = new javax.swing.JButton();
        spnPreguntas = new javax.swing.JSpinner();
        lblCargaTemas = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        spnTemas = new javax.swing.JSpinner();
        lblCargaPreguntas = new javax.swing.JLabel();
        btnCargarDatosPrueba = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestión de Preguntas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 5, 180, 22);

        cmbTemas.setName(""); // NOI18N
        cmbTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTemas);
        cmbTemas.setBounds(90, 80, 230, 20);

        lblTema.setText("Tema");
        getContentPane().add(lblTema);
        lblTema.setBounds(10, 80, 60, 14);

        lblPregunta.setText("Pregunta");
        getContentPane().add(lblPregunta);
        lblPregunta.setBounds(10, 120, 60, 14);

        lblRespuesta.setText("Respuesta");
        getContentPane().add(lblRespuesta);
        lblRespuesta.setBounds(10, 160, 70, 14);
        getContentPane().add(txtPregunta);
        txtPregunta.setBounds(90, 120, 230, 30);

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtRespuesta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 160, 230, 96);

        tblPreguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tema", "Pregunta"
            }
        ));
        tblPreguntas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblPreguntas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(360, 50, 230, 430);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(600, 50, 110, 23);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(600, 80, 110, 23);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 30, 760, 10);

        btnCon.setText("Confirmar");
        btnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConActionPerformed(evt);
            }
        });
        getContentPane().add(btnCon);
        btnCon.setBounds(190, 270, 130, 23);

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTitulo2.setText("Gestión Manual");
        getContentPane().add(lblTitulo2);
        lblTitulo2.setBounds(10, 40, 220, 14);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 360, 320, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Gestión Masiva");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 340, 110, 14);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 60, 320, 10);

        btnCargarDesdeArchivo.setText("Cargar desde Archivo");
        btnCargarDesdeArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDesdeArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargarDesdeArchivo);
        btnCargarDesdeArchivo.setBounds(10, 370, 310, 23);
        getContentPane().add(spnPreguntas);
        spnPreguntas.setBounds(270, 430, 50, 20);

        lblCargaTemas.setText("Temas: ");
        getContentPane().add(lblCargaTemas);
        lblCargaTemas.setBounds(10, 430, 60, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(10, 420, 310, 10);
        getContentPane().add(spnTemas);
        spnTemas.setBounds(60, 430, 50, 20);

        lblCargaPreguntas.setText("Preguntas por Tema:");
        getContentPane().add(lblCargaPreguntas);
        lblCargaPreguntas.setBounds(140, 430, 130, 20);

        btnCargarDatosPrueba.setText("Generar Datos de Prueba");
        btnCargarDatosPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargarDatosPrueba);
        btnCargarDatosPrueba.setBounds(10, 460, 310, 23);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(340, 40, 20, 450);

        setBounds(0, 0, 747, 542);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemasActionPerformed

    }//GEN-LAST:event_cmbTemasActionPerformed

    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed
      //TODO: Validar
      modelo.ingresoPregunta(modelo.getTema(cmbTemas.getSelectedItem().toString()), txtPregunta.getText(), txtRespuesta.getText());
      txtPregunta.setText("");
      txtRespuesta.setText("");
      update();
    }//GEN-LAST:event_btnConActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      
      cmbTemas.setSelectedItem(tblPreguntas.getValueAt(tblPreguntas.getSelectedRow(),0).toString());
      txtPregunta.setText(tblPreguntas.getValueAt(tblPreguntas.getSelectedRow(),1).toString());
      for(Pregunta pregunta : modelo.getListaPreguntas()){
          if(pregunta.getPregunta().equalsIgnoreCase(tblPreguntas.getValueAt(tblPreguntas.getSelectedRow(),1).toString())){
              txtRespuesta.setText(pregunta.getRespuesta());
              break;
          }
      }
      
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       for(Pregunta pregunta : modelo.getListaPreguntas()){
          if(pregunta.getPregunta().equalsIgnoreCase(tblPreguntas.getValueAt(tblPreguntas.getSelectedRow(),1).toString())){
              modelo.eliminarPregunta(pregunta);
              break;
          }
      }
      update();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCargarDesdeArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDesdeArchivoActionPerformed
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            resultado = Utilidades.cargaMasiva(filename, modelo);
            JOptionPane.showMessageDialog(this, resultado, "Resultado de Carga Masiva", 1);
            update();
        }
    }//GEN-LAST:event_btnCargarDesdeArchivoActionPerformed

    private void btnCargarDatosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosPruebaActionPerformed
        modelo.cargarDatosPrueba((Integer) spnTemas.getValue(),(Integer) spnPreguntas.getValue());
        update();
    }//GEN-LAST:event_btnCargarDatosPruebaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatosPrueba;
    private javax.swing.JButton btnCargarDesdeArchivo;
    private javax.swing.JButton btnCon;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbTemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCargaPreguntas;
    private javax.swing.JLabel lblCargaTemas;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblTema;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JSpinner spnPreguntas;
    private javax.swing.JSpinner spnTemas;
    private javax.swing.JTable tblPreguntas;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private String resultado;
}
