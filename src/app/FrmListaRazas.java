package app;

import dao.entidades.*;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zelbag
 */
public class FrmListaRazas extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmListaRazas(FrmMenuPrincipal mP) throws PropertyVetoException {
        initComponents();
        load();
        mPrincipal = mP;
    }

    FrmMenuPrincipal mPrincipal;
    
    private void load() throws PropertyVetoException{
        try{
            this.setMaximum(true);
        }
        catch(PropertyVetoException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        loadTable();
    }
    
    
    private void loadTable(){
        try{
            ArrayList<Raza> razas = Raza.getRazas();
            String col[] = {"id","Nombre"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            tblRazas.setModel(tableModel);
            for(Raza r:razas){
                
                Object[] obj = {r.getId(), r.getNombre()};
                tableModel.addRow(obj);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo cargar las razas.\n:Excepción:"+ex.toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRazas = new javax.swing.JTable();
        btnFiltar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setTitle("Listado de razas");
        setMaximumSize(new java.awt.Dimension(1038, 765));
        setMinimumSize(new java.awt.Dimension(1038, 765));
        setPreferredSize(new java.awt.Dimension(1038, 765));

        tblRazas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRazas);

        btnFiltar.setText("Filtrar");
        btnFiltar.setToolTipText("");
        btnFiltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try{
            AltaRaza aR = new AltaRaza(mPrincipal, true);
            aR.show();

            loadTable();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al abrir el formulario.\n:Excepción:"+ex.toString());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFiltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRazas;
    // End of variables declaration//GEN-END:variables
}