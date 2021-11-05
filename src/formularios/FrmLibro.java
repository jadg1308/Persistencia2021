/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.DLibro;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class FrmLibro extends javax.swing.JFrame {
    private DLibro libros = new DLibro();
    private boolean esNuevo=true;
    private int posActual = 0;

    /**
     * Creates new form FrmLibro
     */
    public FrmLibro() {
        initComponents();
        mostrarRegEnTf(posActual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BtnAnterior = new javax.swing.JButton();
        LblRegistros = new javax.swing.JLabel();
        BtnSiguiente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        BtnActualizarBD = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TfCodigo = new javax.swing.JTextField();
        TfTitulo = new javax.swing.JTextField();
        TfEdicion = new javax.swing.JTextField();
        TfCopyright = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Libros");

        jToolBar2.setRollover(true);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Nuevo.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setFocusable(false);
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnNuevo);

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.setFocusable(false);
        BtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnGuardar);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setFocusable(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnEliminar);
        jToolBar2.add(jSeparator1);

        BtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/anterior.png"))); // NOI18N
        BtnAnterior.setText("Anterior");
        BtnAnterior.setFocusable(false);
        BtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnAnterior);

        LblRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblRegistros.setText("0 de 0");
        jToolBar2.add(LblRegistros);

        BtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/next.png"))); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.setFocusable(false);
        BtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnSiguiente);
        jToolBar2.add(jSeparator2);

        BtnActualizarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/iconos/BDOk.png"))); // NOI18N
        BtnActualizarBD.setText("Actualizar BD");
        BtnActualizarBD.setFocusable(false);
        BtnActualizarBD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnActualizarBD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnActualizarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarBDActionPerformed(evt);
            }
        });
        jToolBar2.add(BtnActualizarBD);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)), "Datos de Libro"));

        jLabel1.setText("Código:");

        jLabel2.setText("Título:");

        jLabel3.setText("Edición:");

        jLabel4.setText("Copyright:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfTitulo)
                    .addComponent(TfEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TfEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TfCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarTF();
        esNuevo = true;
        
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void limpiarTF(){
        TfCodigo.setText("");
        TfTitulo.setText("");
        TfEdicion.setText(null);
        TfCopyright.setText(null);
        TfCodigo.requestFocus();
    }
    
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        if(TfCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Escriba el Código del libro"
                    , "Libro", JOptionPane.WARNING_MESSAGE);
            TfCodigo.requestFocus();
            return ;
        }
        if(TfTitulo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Escriba el título del libro"
                    , "Libro", JOptionPane.WARNING_MESSAGE);
            TfTitulo.requestFocus();
            return;
        } 
        int b = 0;
        if(esNuevo){
            
            b = libros.agregarLibro(TfCodigo.getText(), 
                    TfTitulo.getText(), 
                    Integer.parseInt(TfEdicion.getText()), 
                    TfCopyright.getText());
        }else{
            
            b = libros.editarLibro(TfCodigo.getText(), 
                    TfTitulo.getText(), 
                    Integer.parseInt(TfEdicion.getText()), 
                    TfCopyright.getText());
        }
       
        if (b == 1){
            JOptionPane.showMessageDialog(this, "Registro guardado...",
                    "Libros", JOptionPane.INFORMATION_MESSAGE);
            posActual = libros.getListaLibro().size();
            this.mostrarRegEnTf(posActual-1);
        }else{
            JOptionPane.showMessageDialog(this, "Error al guardar registro",
                    "Libros", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el registro de "  +
        this.TfTitulo.getText() + "?", "Libro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == 0){
            int b = libros.eliminarLibro(this.TfCodigo.getText());
            if(b == 1){
                JOptionPane.showMessageDialog(this, "El registro se elimino satisfactoriamente",
                        "Libro", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Surgio un error al eliminar, "
                        + "por favor verifique si los datos proporcionado son correctos", "Libro",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
        // TODO add your handling code here:
        if(posActual == 0) posActual = libros.getListaLibro().size();
        posActual--;
        mostrarRegEnTf(posActual);
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        // TODO add your handling code here:
        posActual ++;
        if(posActual >= libros.getListaLibro().size()) posActual  = 0;
        this.mostrarRegEnTf(posActual);
                
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void BtnActualizarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarBDActionPerformed
        // TODO add your handling code here:
        String msn = libros.actualizarBD();
        JOptionPane.showMessageDialog(this, msn, "Actualizar BD", JOptionPane.INFORMATION_MESSAGE);
        posActual  =0;
        mostrarRegEnTf(posActual);
    }//GEN-LAST:event_BtnActualizarBDActionPerformed

    private void mostrarRegEnTf(int fila){
        if(!libros.getListaLibro().isEmpty()){
            TfCodigo.setText(libros.getListaLibro().get(fila).getIsbn());
            TfTitulo.setText(libros.getListaLibro().get(fila).getTitulo());
            TfEdicion.setText(""+ libros.getListaLibro().get(fila).getEdicion());
            TfCopyright.setText(libros.getListaLibro().get(fila).getCopyright());
            esNuevo = false;
            
            int ultReg = libros.getListaLibro().size();
            LblRegistros.setText("" + (fila +1)+ " de " + ultReg);
            TfCodigo.requestFocus();
        }else{
            limpiarTF();
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
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarBD;
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JLabel LblRegistros;
    private javax.swing.JTextField TfCodigo;
    private javax.swing.JTextField TfCopyright;
    private javax.swing.JTextField TfEdicion;
    private javax.swing.JTextField TfTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
