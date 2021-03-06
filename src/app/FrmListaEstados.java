package app;

import dao.entidades.*;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zelbag
 */
public class FrmListaEstados extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmListaEstados(FrmMenuPrincipal mP) throws PropertyVetoException {
        initComponents();
        load();
        mPrincipal = mP;
    }

    FrmMenuPrincipal mPrincipal;
    
    private void load(){
        loadTable();
    }
    
    
    private void loadTable(){
        try{
            ArrayList<Estado> estados = Estado.getEstados();
            String col[] = {"id","Nombre"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            tblEstados.setModel(tableModel);
            for(Estado e:estados){
                Object[] obj = {e.getId(), e.getNombre()};
                tableModel.addRow(obj);
            }
            
            
            
                tblEstados.getColumnModel().getColumn(0).setMaxWidth(0);
                tblEstados.getColumnModel().getColumn(0).setPreferredWidth(0);
                tblEstados.getColumnModel().getColumn(0).setMinWidth(0);
                tblEstados.getColumnModel().getColumn(0).setWidth(0);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo cargar los estados.\n:Excepción:"+ex.toString());
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
        tblEstados = new javax.swing.JTable();
        btnFiltar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setTitle("Listado de estados");
        setMaximumSize(new java.awt.Dimension(1038, 765));
        setMinimumSize(new java.awt.Dimension(1038, 765));
        setPreferredSize(new java.awt.Dimension(1038, 765));

        tblEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEstados);

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
            AltaEstado aEs = new AltaEstado(mPrincipal, true);
            aEs.show();

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
    private javax.swing.JTable tblEstados;
    // End of variables declaration//GEN-END:variables
}
