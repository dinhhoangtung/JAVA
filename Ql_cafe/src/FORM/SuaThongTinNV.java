/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class SuaThongTinNV extends javax.swing.JFrame {

    /**
     * Creates new form SuaThongTinNV
     */
    public SuaThongTinNV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addNV = new javax.swing.JPanel();
        TenBenhNhan = new javax.swing.JLabel();
        NS = new javax.swing.JLabel();
        DC = new javax.swing.JLabel();
        DT = new javax.swing.JLabel();
        GT = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtGT = new javax.swing.JComboBox<>();
        Sửa = new javax.swing.JButton();
        txtTenNV = new javax.swing.JTextField();
        DT1 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        CMND = new javax.swing.JLabel();
        txtNS = new com.toedter.calendar.JDateChooser();
        txtNBD = new com.toedter.calendar.JDateChooser();
        Thoát = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(91, 48, 91));

        jPanel2.setBackground(new java.awt.Color(61, 29, 61));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thông tin nhân viên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        addNV.setBackground(new java.awt.Color(91, 48, 91));
        addNV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TenBenhNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TenBenhNhan.setForeground(new java.awt.Color(255, 255, 255));
        TenBenhNhan.setText("Tên nhân viên");
        addNV.add(TenBenhNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 120, -1, -1));

        NS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NS.setForeground(new java.awt.Color(255, 255, 255));
        NS.setText("Ngày sinh :");
        addNV.add(NS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        DC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DC.setForeground(new java.awt.Color(255, 255, 255));
        DC.setText("Ngày Bắt Đầu :");
        addNV.add(DC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        DT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DT.setForeground(new java.awt.Color(255, 255, 255));
        DT.setText("Email :");
        addNV.add(DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        GT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GT.setForeground(new java.awt.Color(255, 255, 255));
        GT.setText("Giới Tính :");
        addNV.add(GT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        addNV.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 202, 27));

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        addNV.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 202, 27));

        txtGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        txtGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGTActionPerformed(evt);
            }
        });
        addNV.add(txtGT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 101, 30));

        Sửa.setBackground(new java.awt.Color(61, 29, 61));
        Sửa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sửa.setForeground(new java.awt.Color(255, 255, 255));
        Sửa.setText("Lưu");
        Sửa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SửaActionPerformed(evt);
            }
        });
        addNV.add(Sửa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 94, 39));

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });
        addNV.add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 202, 27));

        DT1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DT1.setForeground(new java.awt.Color(255, 255, 255));
        DT1.setText("Điện thoại :");
        addNV.add(DT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMNDActionPerformed(evt);
            }
        });
        addNV.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 202, 27));

        CMND.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CMND.setForeground(new java.awt.Color(255, 255, 255));
        CMND.setText("CMND :");
        addNV.add(CMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));
        addNV.add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 30));

        txtNBD.setDateFormatString("yyyy-MM-dd");
        addNV.add(txtNBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, 30));

        Thoát.setBackground(new java.awt.Color(61, 29, 61));
        Thoát.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Thoát.setForeground(new java.awt.Color(255, 255, 255));
        Thoát.setText("Thoát");
        Thoát.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoátActionPerformed(evt);
            }
        });
        addNV.add(Thoát, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 94, 39));

        Reset.setBackground(new java.awt.Color(61, 29, 61));
        Reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.setMaximumSize(new java.awt.Dimension(59, 23));
        Reset.setMinimumSize(new java.awt.Dimension(59, 23));
        Reset.setPreferredSize(new java.awt.Dimension(59, 23));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        addNV.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 100, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addNV, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGTActionPerformed

    private void SửaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SửaActionPerformed
        //        // TODO add your handling code here:
        String row[] = new String[8];
        // lấy giá trị ở TextFiel để đưa vào mảng
       // row[0] = txtMaNV.getText();
        row[1] = txtTenNV.getText();
        row[2] = txtNS.getDateFormatString();
        row[3] = txtGT.getSelectedItem().toString();
        row[4] = txtCMND.getText();
        row[5] = txtSDT.getText();
        row[6] = txtEmail.getText();
        row[7] = txtNBD.getDateFormatString();
        // thêm  1 dòng mới vào  Defaultablemodel
        //DefaultTableModel TableBn = (DefaultTableModel) tbNhanVien.getModel();
        //TableBn.addRow(row);
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        
    }//GEN-LAST:event_SửaActionPerformed

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void txtCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMNDActionPerformed

    private void ThoátActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoátActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_ThoátActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
       // txtMaNV.setText("");
        txtTenNV.setText("");
        txtNS.setDateFormatString("");
        txtGT.getSelectedItem().toString();
        txtCMND.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        txtNBD.setDateFormatString("");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(SuaThongTinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaThongTinNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaThongTinNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CMND;
    private javax.swing.JLabel DC;
    private javax.swing.JLabel DT;
    private javax.swing.JLabel DT1;
    private javax.swing.JLabel GT;
    private javax.swing.JLabel NS;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Sửa;
    private javax.swing.JLabel TenBenhNhan;
    private javax.swing.JButton Thoát;
    private javax.swing.JPanel addNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGT;
    private com.toedter.calendar.JDateChooser txtNBD;
    private com.toedter.calendar.JDateChooser txtNS;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables

    void NewScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
