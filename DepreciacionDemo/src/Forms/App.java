/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Pojo.ActivoFijo;
import Pojo.TipoActivoFijo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class App extends javax.swing.JFrame {

    private DefaultComboBoxModel modelComboBox;
    private final String[] modelcombo =
    {
        "Edificio", "Vehiculo", "Maquinaria", "Mobiliario", "Equipo de oficina"
    };

    private DefaultTableModel modelTable;
    private final String[] header =
    {
        "Activo Fijo", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
    };

    private List<ActivoFijo> listAf;
    private TipoActivoFijo taf;

    public App() {
        initComponents();
        modelComboBox = new DefaultComboBoxModel(modelcombo);
        cmbTipoActivoFijo.setModel(modelComboBox);

        modelTable = new DefaultTableModel(header, 0);
        tblDepreciacion.setModel(modelTable);

        listAf = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorResidual = new javax.swing.JTextField();
        txtValorActivo = new javax.swing.JTextField();
        cmbTipoActivoFijo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepreciacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(662, 215));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setText("Valor del activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel2.setText("Tipo de Activo Fijo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setText("Valor Residual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtValorResidual, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtValorActivo, gridBagConstraints);

        cmbTipoActivoFijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(cmbTipoActivoFijo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtNombre, gridBagConstraints);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        jPanel1.add(btnCalcular, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setViewportView(tblDepreciacion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String nombre = txtNombre.getText();
        float v_Activo = Float.parseFloat(txtValorActivo.getText());
        int index = cmbTipoActivoFijo.getSelectedIndex();
        float v_Residual = Float.parseFloat(txtValorResidual.getText());

        float depreciacion = 0;
        int n = 0; //Cantidad de depreciaciones

        switch (index)
        {
            case 0:
                n = 20;
                depreciacion = (v_Activo - v_Residual) / 20;
                break;
            case 1:
                n = 5;
                depreciacion = (v_Activo - v_Residual) / 5;
                
                break;
            case 2:
                n = 8;
                depreciacion = (v_Activo - v_Residual) / 8;
                break;
            case 3:
                n = 2;
                depreciacion = (v_Activo - v_Residual) / 2;
                break;
            case 4:
                n = 1;
                depreciacion = (v_Activo - v_Residual) / 1;
                break;
        }

        ActivoFijo af = new ActivoFijo(nombre, depreciacion);
        listAf.add(af);
        
        int rows = tblDepreciacion.getRowCount();
        
        String [] afTableRows = new String[21];
        
        afTableRows[0] = af.getNombre();
        
        for (int i = 1 ; i<=n ; i++){
            afTableRows[i] = String.valueOf(af.getDepreciacion());
            if (i > n){
                for (int m = n; m< afTableRows.length ; m++){
                    afTableRows[m] = "-";
                }
            }
        }
        
        modelTable.addRow(afTableRows);
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTipoActivoFijo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDepreciacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValorActivo;
    private javax.swing.JTextField txtValorResidual;
    // End of variables declaration//GEN-END:variables
}
