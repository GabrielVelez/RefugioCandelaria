package app;

import javax.swing.JOptionPane;
import dao.entidades.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

public class AltaPerro extends javax.swing.JDialog {

    public AltaPerro() {
        initComponents();
        look();
        loadCmbs();
    }
    
    public AltaPerro(FrmMenuPrincipal ventanaPrincipal, boolean modal) {
        super(ventanaPrincipal,modal);
        initComponents();
        look();
        loadCmbs();
        asd = ventanaPrincipal;
    }
    FrmMenuPrincipal asd;
    
    public Duenio d = null;
    
    private void loadCmbs(){
        try{
            ArrayList<Raza> razas = Raza.getRazas();
            ArrayList<Estado> estados = Estado.getEstados();
            
            DefaultComboBoxModel cmb = new DefaultComboBoxModel();
            for(Raza r:razas){
                cmb.addElement(r);
            }
            cmbRaza.setModel(cmb);
            
            DefaultComboBoxModel cmb2 = new DefaultComboBoxModel();
            for(Estado e:estados){
                cmb2.addElement(new Estado(e.getId(), e.getNombre()));
            }
            cmbEstado.setModel(cmb2);
        }
        catch(Exception ex){
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbtnMacho = new javax.swing.JRadioButton();
        rbtnHembra = new javax.swing.JRadioButton();
        cmbRaza = new javax.swing.JComboBox<>();
        chkCastrado = new javax.swing.JCheckBox();
        chkDesparacitado = new javax.swing.JCheckBox();
        chkVacuna = new javax.swing.JCheckBox();
        chkAntirrabica = new javax.swing.JCheckBox();
        spnEdad = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDuenio = new javax.swing.JTextField();
        btnDuenio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dchEgreso = new com.toedter.calendar.JDateChooser();
        chkAdopcion = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        dchIngreso = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta Perro");

        jLabel2.setText("Raza:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonGroup1.add(rbtnMacho);
        rbtnMacho.setSelected(true);
        rbtnMacho.setText("Macho");

        buttonGroup1.add(rbtnHembra);
        rbtnHembra.setText("Hembra");

        chkCastrado.setText("Castrado");

        chkDesparacitado.setText("Desparecitado");

        chkVacuna.setText("Vacuna");

        chkAntirrabica.setText("Antirrábica");

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(1, 0, 30, 1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("Dueño");

        btnDuenio.setText("a");
        btnDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuenioActionPerformed(evt);
            }
        });

        jLabel6.setText("Egreso:");

        chkAdopcion.setText("En adopción");

        jLabel7.setText("ingreso:");

        jLabel9.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnMacho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnHembra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(chkVacuna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkDesparacitado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAntirrabica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkCastrado)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dchIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(chkAdopcion)
                        .addGap(37, 37, 37)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dchIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnHembra)
                    .addComponent(rbtnMacho)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDesparacitado)
                    .addComponent(chkVacuna)
                    .addComponent(chkAntirrabica)
                    .addComponent(chkCastrado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAdopcion)
                    .addComponent(jLabel9)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDuenio)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dchEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuenioActionPerformed
        // TODO add your handling code here:
        FrmSelectDuenio selectDuenio = new FrmSelectDuenio(asd, true, this);
        selectDuenio.show();
        
        if(d != null){
            txtDuenio.setText(d.getNombre()+" "+ d.getApellido());
        }
    }//GEN-LAST:event_btnDuenioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       try{
            if(txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Nombre necesario.");
                return;
            }
            if(cmbRaza.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null,"Debe elegir una raza.");
                return;
            }
            
            Date dIng;
            if(dchIngreso.getDate() == null){
                
                JOptionPane.showMessageDialog(null,"Debe elegir una fecha de ingreso.");
                return;
            }
            else{
                try{
                    dIng = dchIngreso.getDate();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Fecha de ingreso inválida.");
                    return;
                }
            }
            Date dEg;
            try{
                dEg = dchEgreso.getDate();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Fecha de egreso inválida.");
                return;
            }
            
            
            
            Perro pe = new Perro();
            pe.setNombre(txtNombre.getText());
            byte edad = Byte.parseByte(spnEdad.getValue().toString());
            pe.setEdad(edad);
            pe.setAdopcion(chkAdopcion.isSelected());
            pe.setAntirrabica(chkAntirrabica.isSelected());
            pe.setCastrado(chkCastrado.isSelected());
            pe.setDesparacitado(chkDesparacitado.isSelected());
            pe.setVacuna(chkVacuna.isSelected());
            pe.setEgreso(dEg);
            pe.setIngresado(dIng);
            
            if(rbtnMacho.isSelected()){
                pe.setSexo(true);
            }
            else{
                pe.setSexo(false);
            }
            
            Raza r = (Raza) cmbRaza.getSelectedItem();
            
            pe.setId_raza(r.getId());
            
            Estado e = (Estado) cmbEstado.getSelectedItem();
            
            pe.setId_estado(e.getId());
            
            String mensaje = Perro.createPerro(pe);
            
            if(mensaje.equals("")){
                JOptionPane.showMessageDialog(null, "Perro cargado exitosamente");
                txtNombre.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, mensaje);
            }
            
        }
        catch(HeadlessException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    public static void look(){
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDuenio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JCheckBox chkAdopcion;
    private javax.swing.JCheckBox chkAntirrabica;
    private javax.swing.JCheckBox chkCastrado;
    private javax.swing.JCheckBox chkDesparacitado;
    private javax.swing.JCheckBox chkVacuna;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbRaza;
    private com.toedter.calendar.JDateChooser dchEgreso;
    private com.toedter.calendar.JDateChooser dchIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JRadioButton rbtnHembra;
    private javax.swing.JRadioButton rbtnMacho;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
