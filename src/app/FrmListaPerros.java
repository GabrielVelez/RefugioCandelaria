package app;

import dao.entidades.*;
import java.beans.PropertyVetoException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zelbag
 */
public class FrmListaPerros extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmListaPerros(FrmMenuPrincipal mP) throws PropertyVetoException {
        initComponents();
        load();
        mPrincipal = mP;
    }

    FrmMenuPrincipal mPrincipal;
    
    private void load() {
        loadTable();
    }
    
    
    private void loadTable(){
        try{
            ArrayList<Perro> perros = Perro.getPerros();
            String col[] = {"id","Nombre","Edad", "Ingreso", "Raza", "Sexo", "Castrado", "Despar.", "Vacuna", "Antirrabica", "Adopción", "Egreso"};
            DefaultTableModel tableModel = new DefaultTableModel(col, 0);
            tblPerros.setModel(tableModel);
            for(Perro p:perros){
                String raza = "", sexo = "", castrado = "", desparacitado = "", vacuna = "", antirrabica = "", adopcion = "";
                
                Raza r = Raza.getRazaId((p.getId_raza()));
                raza = r.getNombre();
                if(p.isSexo()){
                    sexo = "Macho";
                }
                else{
                    sexo = "Hembra";
                }
                if(p.isCastrado()){
                    castrado = "Si";
                }
                else{
                    castrado = "No";
                }
                if(p.isDesparacitado()){
                    desparacitado = "Si";
                }
                else{
                    desparacitado = "No";
                }
                if(p.isVacuna()){
                    vacuna = "Si";
                }
                else{
                    vacuna = "No";
                }
                if(p.isAntirrabica()){
                    antirrabica = "Si";
                }
                else{
                    antirrabica = "No";
                }
                if(p.isAdopcion()){
                    adopcion = "Si";
                }
                else{
                    adopcion = "No";
                }
                
                Date dt = new Date(System.currentTimeMillis());
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
                int esteAnio = Integer.parseInt(formatter.format(dt));
                formatter = new SimpleDateFormat("yyyy");
                int ingres = Integer.parseInt(formatter.format(p.getIngresado()));
                int masEdad = esteAnio - ingres;
                
                
                Object[] obj = {p.getId(), p.getNombre(), p.getEdad() + masEdad, 
                    p.getIngresado(), raza, sexo, castrado
                    , desparacitado, vacuna,
                    antirrabica, adopcion};
                tableModel.addRow(obj);
                
                tblPerros.getColumnModel().getColumn(0).setMaxWidth(0);
                tblPerros.getColumnModel().getColumn(0).setPreferredWidth(0);
                tblPerros.getColumnModel().getColumn(0).setMinWidth(0);
                tblPerros.getColumnModel().getColumn(0).setWidth(0);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al cargar los perros.\n:Excepción:"+ex.toString());
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
        tblPerros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setTitle("Listado de perros");
        setMaximumSize(new java.awt.Dimension(1038, 765));
        setMinimumSize(new java.awt.Dimension(1038, 765));
        setPreferredSize(new java.awt.Dimension(1038, 765));

        tblPerros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPerros);

        jButton1.setText("Filtrar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try{
            AltaPerro aP = new AltaPerro(mPrincipal, true);
            aP.show();

            loadTable();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al abrir el formulario.\n:Excepción:"+ex.toString());
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if(tblPerros.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un registro de la tabla");
                return;
            }
            int id =(Integer.parseInt(tblPerros.getValueAt(tblPerros.getSelectedRow(), 0).toString()));
            String nombre =(tblPerros.getValueAt(tblPerros.getSelectedRow(), 1).toString());
            String edad = (tblPerros.getValueAt(tblPerros.getSelectedRow(), 2).toString());
            int input = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar a "+nombre+" de edad "+edad+" años, de la lista?");
        
            if(input == 0){
                String mensaje = Perro.deletePerro(id);
                if(mensaje.equals("")){
                    loadTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, mensaje);
                }
            }
        }
        catch (Exception ex) {
            Logger.getLogger(FrmListaDuenios.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerros;
    // End of variables declaration//GEN-END:variables
}
