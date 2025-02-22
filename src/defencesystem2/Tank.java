/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem2;

/**
 *
 * @author nihindugayashan
 */
public class Tank extends javax.swing.JFrame implements Observer{
    private boolean chaPositionValue;

    public Tank() {
        initComponents();
        setVisible(true);
    }
    
    @Override
    public void setAreaClear(int areavalue){
        if(areavalue > 40){
            lblAreaClear.setText("Area Is Clear.");
        }else{
            lblAreaClear.setText("Area is Not Clear.");
        }
    }
    
    @Override
    public void setMassage(String msg){
        jTextArea.setText(msg);
    }
    
    @Override
    public void setBtnEnable(int btnvalue) {
        if(btnvalue > 90 && this.chaPositionValue == true){
            btnRotate.setEnabled(true);
        }else if(btnvalue > 80 && this.chaPositionValue == true){
            btnRedar.setEnabled(true);
            btnRotate.setEnabled(false);
        }else if(btnvalue > 60 && this.chaPositionValue == true){
            btnMissile.setEnabled(true);
            btnRedar.setEnabled(false);
            btnRotate.setEnabled(false);
        }else if(btnvalue > 40 && this.chaPositionValue == true){
            btnShoot.setEnabled(true);
            btnMissile.setEnabled(false);
            btnRedar.setEnabled(false);
            btnRotate.setEnabled(false);
        }else{
            btnShoot.setEnabled(false);
            btnMissile.setEnabled(false);
            btnRedar.setEnabled(false);
            btnRotate.setEnabled(false);
        }
    }
    
    @Override
    public void setQuickAreaClear(boolean chavalue){
        if(chavalue == true){
            lblAreaClear.setText("Area Is Clear.");
        }else{
            lblAreaClear.setText("Area is Not Clear.");
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

        jSpinner1 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        jSpinner2 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        chaPosition = new javax.swing.JCheckBox();
        btnShoot = new javax.swing.JButton();
        btnRedar = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnRotate = new javax.swing.JButton();
        lblAreaClear = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 19, 45, -1));

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 16, -1, 239));
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 54, 49, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 244, 295, 26));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel2.setText("Soldier Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 22, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel3.setText("Ammo Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 57, -1, -1));

        btnSend.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnSend.setText("Send");
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 244, -1, -1));

        chaPosition.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        chaPosition.setText("Position");
        chaPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaPositionActionPerformed(evt);
            }
        });
        getContentPane().add(chaPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 83, -1, -1));

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);
        getContentPane().add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 106, -1));

        btnRedar.setText("Redar Operation");
        btnRedar.setEnabled(false);
        getContentPane().add(btnRedar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 106, -1));

        btnMissile.setText("Missile Operation");
        btnMissile.setEnabled(false);
        getContentPane().add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 44, 106, -1));

        btnRotate.setText("Rotate Shooting");
        btnRotate.setEnabled(false);
        getContentPane().add(btnRotate, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 73, 106, -1));

        lblAreaClear.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lblAreaClear.setText("Area Not Cleared");
        getContentPane().add(lblAreaClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 22, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel4.setText("TANK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chaPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaPositionActionPerformed
        this.chaPositionValue = chaPosition.isSelected();
    }//GEN-LAST:event_chaPositionActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRedar;
    private javax.swing.JButton btnRotate;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox chaPosition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAreaClear;
    // End of variables declaration//GEN-END:variables

    
}
