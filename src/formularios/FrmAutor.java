/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.TablaAutor;
import javax.swing.JOptionPane;

/**
 *
 * @author POO IIS 2021
 */
public class FrmAutor extends javax.swing.JFrame {

    TablaAutor tAutor = new TablaAutor();
    boolean esNuevo;
    int idAutor = 0;
    int posActual = 0;
    
    /**
     * Creates new form FrmAutor
     */
    public FrmAutor() {
        initComponents();
        mostrarEnTF(posActual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BtnAnterior = new javax.swing.JButton();
        lContador = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BtnGuardarEnBD = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TfNombre = new javax.swing.JTextField();
        TfApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autores");

        jToolBar1.setRollover(true);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Nuevo.png"))); // NOI18N
        BtnNuevo.setFocusable(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnNuevo);

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Guardar.png"))); // NOI18N
        BtnGuardar.setFocusable(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnGuardar);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Eliminar.png"))); // NOI18N
        BtnEliminar.setFocusable(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnEliminar);
        jToolBar1.add(jSeparator1);

        BtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/anterior.png"))); // NOI18N
        BtnAnterior.setFocusable(false);
        BtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnAnterior);

        lContador.setText(" 0 de 0");
        jToolBar1.add(lContador);

        BtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/next.png"))); // NOI18N
        BtnSiguiente.setFocusable(false);
        BtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnSiguiente);
        jToolBar1.add(jSeparator2);

        BtnGuardarEnBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/ActualizarBD.png"))); // NOI18N
        BtnGuardarEnBD.setFocusable(false);
        BtnGuardarEnBD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardarEnBD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardarEnBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarEnBDActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnGuardarEnBD);
        jToolBar1.add(jSeparator3);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Autor"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(TfNombre))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void limpiar(){
        esNuevo = true;
        TfNombre.setText(null);
        TfApellido.setText(null);
        TfNombre.requestFocus();
    }
    
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if(TfNombre.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre", "Autor",
                    JOptionPane.WARNING_MESSAGE);
            this.TfNombre.requestFocus();
            return;
        }
        if(TfApellido.getText().equals(null)){
            JOptionPane.showMessageDialog(this, "Debe ingresar un apellido", "Autor",
                    JOptionPane.WARNING_MESSAGE);
            this.TfApellido.requestFocus();
            return;
        }
        int b;
        if (esNuevo ){
            b = tAutor.agregarALista(TfNombre.getText(), TfApellido.getText());
        }else{
            b = tAutor.editarEnLista(idAutor, TfNombre.getText(), TfApellido.getText());
        }
        if(b == 1){
            JOptionPane.showMessageDialog(this, "Registro guardado...", "Autor",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        this.mostrarEnTF(0);
        limpiar();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
       int resp = JOptionPane.showConfirmDialog(this, 
                "¿Realmente desea eliminar el autor " + this.TfNombre.getText() + 
                " " + this.TfApellido.getText() + "?", "Autor",
                 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == 0){
            int b = tAutor.eliminarEnLista(idAutor);
            if(b==1){
                JOptionPane.showMessageDialog(this, "Registro eliminado satisfactoriamente"
                , "Autor", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error inesperado, verifique y vuelva intentar",
                        "Autor", JOptionPane.ERROR_MESSAGE);
            }          
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
       if (posActual == 0) posActual = tAutor.getLista().size();
        posActual--;
        this.mostrarEnTF(posActual);
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        posActual++;
        if (posActual == tAutor.getLista().size()) posActual = 0;  
        this.mostrarEnTF(posActual);
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnGuardarEnBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarEnBDActionPerformed
        String msn = tAutor.actualizarBD();
        JOptionPane.showMessageDialog(this, msn, "Actualizar Base de Datos",
                JOptionPane.INFORMATION_MESSAGE);
        posActual =0;
        mostrarEnTF(posActual);
    }//GEN-LAST:event_BtnGuardarEnBDActionPerformed

    private void mostrarEnTF(int fila){
        if(!tAutor.getLista().isEmpty()){
            TfNombre.setText(tAutor.getLista().get(fila).getNombrePila());
            TfApellido.setText(tAutor.getLista().get(fila).getApellidoPaterno());
            idAutor = tAutor.getLista().get(fila).getIdAutor();
            esNuevo=false;

            int ultReg = tAutor.getLista().size();
            lContador.setText("" + (fila + 1) + " de " + ultReg);
            TfNombre.requestFocus();
        }else{
             limpiar();
        }
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarEnBD;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JTextField TfApellido;
    private javax.swing.JTextField TfNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lContador;
    // End of variables declaration//GEN-END:variables
}
