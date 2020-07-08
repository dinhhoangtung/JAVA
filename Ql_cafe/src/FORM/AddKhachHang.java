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
public class AddKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form AddKhachHang
     */
    public AddKhachHang() {
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

        Gioitinh = new javax.swing.JPanel();
        txtGT = new javax.swing.JComboBox<>();
        DC = new javax.swing.JLabel();
        Thêm = new javax.swing.JButton();
        txtTenKH = new javax.swing.JTextField();
        EMAILKH = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TenKhachHang = new javax.swing.JLabel();
        SDTKH = new javax.swing.JLabel();
        txtNS = new com.toedter.calendar.JDateChooser();
        GT = new javax.swing.JLabel();
        txtNBD = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        Thoát = new javax.swing.JButton();
        txtSDT = new javax.swing.JTextField();
        NSKH = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Gioitinh.setBackground(new java.awt.Color(91, 48, 91));

        txtGT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        txtGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGTActionPerformed(evt);
            }
        });

        DC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DC.setForeground(new java.awt.Color(255, 255, 255));
        DC.setText("Ngày Bắt Đầu :");

        Thêm.setBackground(new java.awt.Color(61, 29, 61));
        Thêm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Thêm.setForeground(new java.awt.Color(255, 255, 255));
        Thêm.setText("Lưu");
        Thêm.setActionCommand("Thêm");
        Thêm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThêmActionPerformed(evt);
            }
        });

        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        EMAILKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EMAILKH.setForeground(new java.awt.Color(255, 255, 255));
        EMAILKH.setText("Email :");

        jPanel2.setBackground(new java.awt.Color(61, 29, 61));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Thêm Thông Tin Khách Hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        TenKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        TenKhachHang.setText("Tên Khách Hàng");

        SDTKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SDTKH.setForeground(new java.awt.Color(255, 255, 255));
        SDTKH.setText("Điện thoại :");

        GT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GT.setForeground(new java.awt.Color(255, 255, 255));
        GT.setText("Giới Tính :");

        txtNBD.setDateFormatString("yyyy-MM-dd");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        Thoát.setBackground(new java.awt.Color(61, 29, 61));
        Thoát.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Thoát.setForeground(new java.awt.Color(255, 255, 255));
        Thoát.setText("Thoát");
        Thoát.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoátActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        NSKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NSKH.setForeground(new java.awt.Color(255, 255, 255));
        NSKH.setText("Ngày sinh :");

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

        javax.swing.GroupLayout GioitinhLayout = new javax.swing.GroupLayout(Gioitinh);
        Gioitinh.setLayout(GioitinhLayout);
        GioitinhLayout.setHorizontalGroup(
            GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GioitinhLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GioitinhLayout.createSequentialGroup()
                        .addComponent(GT)
                        .addGap(25, 25, 25)
                        .addComponent(txtGT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DC)
                            .addComponent(TenKhachHang)
                            .addComponent(SDTKH))
                        .addGap(18, 18, 18))
                    .addGroup(GioitinhLayout.createSequentialGroup()
                        .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GioitinhLayout.createSequentialGroup()
                                .addComponent(NSKH)
                                .addGap(18, 18, 18)
                                .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(GioitinhLayout.createSequentialGroup()
                                .addComponent(EMAILKH)
                                .addGap(45, 45, 45)
                                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Thêm, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GioitinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GioitinhLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GioitinhLayout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Thoát, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        GioitinhLayout.setVerticalGroup(
            GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GioitinhLayout.createSequentialGroup()
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GioitinhLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenKhachHang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GT)
                            .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DC))))
                    .addComponent(txtNBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NSKH)
                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EMAILKH)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDTKH)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(GioitinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thêm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thoát, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGTActionPerformed

    private void ThêmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThêmActionPerformed
        //        // TODO add your handling code here:
        String row[] = new String[8];
        // lấy giá trị ở TextFiel để đưa vào mảng

        row[1] = txtTenKH.getText();
        row[2] = txtNS.getDateFormatString();
        row[3] = txtGT.getSelectedItem().toString();
   
        row[5] = txtSDT.getText();
        row[6] = txtEmail.getText();
        row[7] = txtNBD.getDateFormatString();
        // thêm  1 dòng mới vào  Defaultablemodel
        //DefaultTableModel TableBn = (DefaultTableModel) tbNhanVien.getModel();
        //TableBn.addRow(row);
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    }//GEN-LAST:event_ThêmActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void ThoátActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoátActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ThoátActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        
        txtTenKH.setText("");
        txtNS.setDateFormatString("");
        txtGT.getSelectedItem().toString();
        
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
            java.util.logging.Logger.getLogger(AddKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DC;
    private javax.swing.JLabel EMAILKH;
    private javax.swing.JLabel GT;
    private javax.swing.JPanel Gioitinh;
    private javax.swing.JLabel NSKH;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel SDTKH;
    private javax.swing.JLabel TenKhachHang;
    private javax.swing.JButton Thoát;
    private javax.swing.JButton Thêm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGT;
    private com.toedter.calendar.JDateChooser txtNBD;
    private com.toedter.calendar.JDateChooser txtNS;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables

    void NewScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
