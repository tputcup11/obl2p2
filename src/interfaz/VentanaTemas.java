package interfaz;
import dominio.*;

public class VentanaTemas extends javax.swing.JFrame {

    public VentanaTemas(Sistema sistema) {
        modelo = sistema;
        initComponents();
        cargarLista();
    }
    
    public void cargarLista(){
        lstTemas.setListData(modelo.darTemas());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlListaTemas = new javax.swing.JPanel();
        lblListaTemas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemas = new javax.swing.JList<>();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblTitleCantidad = new javax.swing.JLabel();
        lblCantPreguntas = new javax.swing.JLabel();
        pnlIngresoTemas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblTitleTemas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Gestión de Temas");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(290, 10, 159, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 40, 750, 10);

        lblListaTemas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblListaTemas.setText("Lista de Temas");

        lstTemas.setToolTipText("");
        lstTemas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTemasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTemas);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTitleCantidad.setText("Cantidad Preguntas");

        javax.swing.GroupLayout pnlListaTemasLayout = new javax.swing.GroupLayout(pnlListaTemas);
        pnlListaTemas.setLayout(pnlListaTemasLayout);
        pnlListaTemasLayout.setHorizontalGroup(
            pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaTemasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListaTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlListaTemasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListaTemasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(lblTitleCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlListaTemasLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblCantPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlListaTemasLayout.setVerticalGroup(
            pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaTemasLayout.createSequentialGroup()
                .addComponent(lblListaTemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListaTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlListaTemasLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitleCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        getContentPane().add(pnlListaTemas);
        pnlListaTemas.setBounds(420, 50, 330, 280);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblDescripcion.setText("Descripción");

        lblTitleTemas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitleTemas.setText("Ingreso de Temas");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIngresoTemasLayout = new javax.swing.GroupLayout(pnlIngresoTemas);
        pnlIngresoTemas.setLayout(pnlIngresoTemasLayout);
        pnlIngresoTemasLayout.setHorizontalGroup(
            pnlIngresoTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIngresoTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                        .addComponent(lblTitleTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIngresoTemasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlIngresoTemasLayout.setVerticalGroup(
            pnlIngresoTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                .addComponent(lblTitleTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlIngresoTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlIngresoTemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIngresoTemasLayout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(pnlIngresoTemas);
        pnlIngresoTemas.setBounds(0, 50, 400, 260);

        setBounds(0, 0, 766, 376);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //TODO: Validar Datos.
        mensaje = modelo.ingresoTema(txtNombre.getText(), txtDescripcion.getText());
        txtNombre.setText("");
        txtDescripcion.setText("");
        cargarLista();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lstTemasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTemasValueChanged
        lblCantPreguntas.setText(""+modelo.getCantPreguntas(modelo.getTema(lstTemas.getSelectedValue())));
    }//GEN-LAST:event_lstTemasValueChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtNombre.setText(lstTemas.getSelectedValue());
        txtDescripcion.setText(modelo.getTema(lstTemas.getSelectedValue()).getDescripcion());
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        mensaje = modelo.eliminarTema(modelo.getTema(lstTemas.getSelectedValue()));
        cargarLista();
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCantPreguntas;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblListaTemas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitleCantidad;
    private javax.swing.JLabel lblTitleTemas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstTemas;
    private javax.swing.JPanel pnlIngresoTemas;
    private javax.swing.JPanel pnlListaTemas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private String mensaje;
}
