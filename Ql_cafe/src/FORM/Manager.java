/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORM;

import Models.KhachHang;
import Models.Luong;
import Models.NhanVien;
import com.mysql.jdbc.Statement;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import ql_cafe.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class Manager extends javax.swing.JFrame {
GridBagLayout layout = new GridBagLayout();


    /**
     * Creates new form MENU
     */
     public void TaoTableLuong() throws SQLException{
        //lấy dữ liệu từ mysql
//        Connection con = new ConnectDB().dbConnector();
//        ArrayList<Luong> list = new ArrayList();
//        String sqlString = "Select * from luong";
//        Statement start = (Statement) con.createStatement();
//        ResultSet rs = start.executeQuery(sqlString);
//        while(rs.next()){
//        Luong luong = new Luong();
//            luong.setMaNV(rs.getString("manv"));
//            luong.setTenNV(rs.getString("tennv"));
//            luong.setGioiTinh(rs.getString("gioitinh"));
//            luong.setNgayBD(rs.getDate("ngaybd"));
//            luong.setThoiGian(rs.getDate("thoigian"));
//            luong.setGioLamViec(rs.getString("giolamviec"));
//            luong.setBoPhan(rs.getString("bophan"));
//            luong.setLuong(rs.getString("luong"));
//            luong.setGhiChu(rs.getString("ghichu"));
//            list.add(luong);
//            System.out.println(luong);
//        }
//        rs.close();
//        start.close();
//        con.close();
//        //
//        DefaultTableModel tblModelTT = new DefaultTableModel();
//        tblModelTT = (DefaultTableModel) tbLuong.getModel();
//        for(var x: list)
//            tblModelTT.addRow(new Object[] {x.getMaNV(), x.getTenNV(), x.getGioiTinh(), x.getNgayBD(), x.getThoiGian(), x.getGioLamViec(), x.getBoPhan(), x.getLuong(), x.getGhiChu()} );
    };
    public void TaoTableNhanVien() throws SQLException{
       // lấy dữ liệu từ mysql
//        Connection con = ConnectDB.getConnection(ConnectDB.DB_URL, ConnectDB.USER_NAME, ConnectDB.PASSWORD);
//        ArrayList<NhanVien> list = new ArrayList();
//        String sqlString = "Select * from nhanvien";
//        Statement start = (Statement) con.createStatement();
//        ResultSet rs = start.executeQuery(sqlString);
//        while(rs.next()){
//        NhanVien nv = new NhanVien();
//            nv.setMaNV(rs.getString("manv"));
//            nv.setTenNV(rs.getString("tennv"));
//            nv.setNgaySinh(rs.getDate("ngaysinh"));
//            nv.setGioiTinh(rs.getString("gioitinh"));
//            nv.setCMND(rs.getString("cmnd"));
//            nv.setSDT(rs.getString("sdt"));
//            nv.setEmail(rs.getString("email"));
//            nv.setNgayBatDau(rs.getDate("ngaybatdau"));
//            nv.setTrangThai(rs.getString("trangthai"));
//            nv.setGhiChu(rs.getString("ghichu"));
//            list.add(nv);
//            System.out.println(nv);
//        }
//        rs.close();
//        start.close();
//        con.close();
//        //
//        DefaultTableModel tblModelTT = new DefaultTableModel();
//        tblModelTT = (DefaultTableModel) tbNhanVien.getModel();
//        for(var x: list)
//            tblModelTT.addRow(new Object[] {x.getMaNV(), x.getTenNV(), x.getNgaySinh(), x.getGioiTinh(), x.getCMND(), x.getSDT(), x.getEmail(), x.getNgayBatDau(), x.getTrangThai(), x.getGhiChu()} );
    };
    public void TaoTableKhackHang() throws SQLException{
        //lấy dữ liệu từ mysql
//        Connection con = new ConnectDB().dbConnector();
//        ArrayList<KhachHang> list = new ArrayList();
//        String sqlString = "Select * from khachhang";
//        Statement start = (Statement) con.createStatement();
//        ResultSet rs = start.executeQuery(sqlString);
//        while(rs.next()){
//        KhachHang kh = new KhachHang();
//            kh.setMaKH(rs.getString("makh"));
//            kh.setTenKH(rs.getString("tenkh"));
//            kh.setNgaySinh(rs.getDate("ngaysinh"));
//            kh.setGioiTinh(rs.getString("gioitinh"));
//            kh.setCMND(rs.getString("cmnd"));
//            kh.setSDT(rs.getString("sdt"));
//            kh.setEmail(rs.getString("email"));
//            kh.setNgayDK(rs.getDate("ngaydk"));
//            kh.setLoaiKH(rs.getString("loaikh"));
//            kh.setGhiChu(rs.getString("ghichu"));
//            list.add(kh);
//            System.out.println(kh);
//        }
//        rs.close();
//        start.close();
//        con.close();
//        //
//        DefaultTableModel tblModelTT = new DefaultTableModel();
//        tblModelTT = (DefaultTableModel) tbKH.getModel();
//        for(var x: list)
//            tblModelTT.addRow(new Object[] {x.getMaKH(), x.getTenKH(), x.getNgaySinh(), x.getGioiTinh(), x.getCMND(), x.getSDT(), x.getEmail(), x.getNgayDK(), x.getLoaiKH(), x.getGhiChu()} );
    };
    
    public Manager() throws SQLException {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        TaoTableNhanVien();
        TaoTableKhackHang();
        TaoTableLuong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        Staff = new javax.swing.JPanel();
        function = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        HomeFun = new javax.swing.JButton();
        MenuFun = new javax.swing.JButton();
        SalaryFun = new javax.swing.JButton();
        CustomerFun = new javax.swing.JButton();
        StaffFun = new javax.swing.JButton();
        Head = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        control = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Drinks = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Search = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        itemDrinks = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        DrinksFun = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        Table = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        Salary = new javax.swing.JPanel();
        table2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbLuong = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        Customer = new javax.swing.JPanel();
        table1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbKH = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Employee = new javax.swing.JPanel();
        table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        AddNV = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jButton21.setText("jButton21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Staff.setBackground(new java.awt.Color(204, 255, 204));
        Staff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        function.setBackground(new java.awt.Color(51, 0, 51));
        function.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cafe_60px.png"))); // NOI18N
        icon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        function.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 60));

        HomeFun.setBackground(new java.awt.Color(61, 29, 61));
        HomeFun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeFun.setForeground(new java.awt.Color(255, 255, 255));
        HomeFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_home_40px_1.png"))); // NOI18N
        HomeFun.setText("Home");
        HomeFun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffFunMouseClicked(evt);
            }
        });
        HomeFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeFunActionPerformed(evt);
            }
        });
        function.add(HomeFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 70));

        MenuFun.setBackground(new java.awt.Color(61, 29, 61));
        MenuFun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuFun.setForeground(new java.awt.Color(255, 255, 255));
        MenuFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_restaurant_menu_40px.png"))); // NOI18N
        MenuFun.setText("Menu");
        MenuFun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffFunMouseClicked(evt);
            }
        });
        MenuFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFunActionPerformed(evt);
            }
        });
        function.add(MenuFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 70));

        SalaryFun.setBackground(new java.awt.Color(61, 29, 61));
        SalaryFun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SalaryFun.setForeground(new java.awt.Color(255, 255, 255));
        SalaryFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_stack_of_money_40px.png"))); // NOI18N
        SalaryFun.setText("Salary");
        SalaryFun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalaryFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffFunMouseClicked(evt);
            }
        });
        SalaryFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryFunActionPerformed(evt);
            }
        });
        function.add(SalaryFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 130, 70));

        CustomerFun.setBackground(new java.awt.Color(61, 29, 61));
        CustomerFun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CustomerFun.setForeground(new java.awt.Color(255, 255, 255));
        CustomerFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_businessman_40px.png"))); // NOI18N
        CustomerFun.setText("Customer");
        CustomerFun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffFunMouseClicked(evt);
            }
        });
        CustomerFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerFunActionPerformed(evt);
            }
        });
        function.add(CustomerFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 130, 70));

        StaffFun.setBackground(new java.awt.Color(61, 29, 61));
        StaffFun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StaffFun.setForeground(new java.awt.Color(255, 255, 255));
        StaffFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_40px_2.png"))); // NOI18N
        StaffFun.setText("Staff");
        StaffFun.setToolTipText("");
        StaffFun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StaffFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaffFunMouseClicked(evt);
            }
        });
        StaffFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffFunActionPerformed(evt);
            }
        });
        function.add(StaffFun, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 130, 70));

        Staff.add(function, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 470));

        Head.setBackground(new java.awt.Color(66, 48, 86));

        jLabel3.setFont(new java.awt.Font("Vladimir Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_java_60px.png"))); // NOI18N
        jLabel3.setText("T TEAM   ");

        jLabel21.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Permission : manager");

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Staff.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 780, 70));

        control.setBackground(new java.awt.Color(102, 0, 0));
        control.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(66, 48, 86));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(0, 255, 255));
        welcome.setText("WELCOME");
        Home.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 290, 80));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cappuccino-cafe-cua-y.png"))); // NOI18N
        picture.setMaximumSize(new java.awt.Dimension(640, 500));
        picture.setPreferredSize(new java.awt.Dimension(680, 401));
        Home.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 640, -1));

        control.add(Home, "card5");

        Menu.setBackground(new java.awt.Color(0, 153, 153));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Drinks.setBackground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DRINK");

        javax.swing.GroupLayout DrinksLayout = new javax.swing.GroupLayout(Drinks);
        Drinks.setLayout(DrinksLayout);
        DrinksLayout.setHorizontalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrinksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        DrinksLayout.setVerticalGroup(
            DrinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Search.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search :");

        jTextField2.setBackground(new java.awt.Color(153, 223, 223));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        jButton41.setBackground(new java.awt.Color(0, 153, 153));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_20px.png"))); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addComponent(jButton41)
        );

        itemDrinks.setBackground(new java.awt.Color(0, 153, 153));
        itemDrinks.setLayout(new java.awt.GridLayout(4, 4, 12, 5));

        jButton1.setBackground(new java.awt.Color(153, 223, 223));
        jButton1.setText("...");
        itemDrinks.add(jButton1);

        jButton8.setBackground(new java.awt.Color(153, 223, 223));
        jButton8.setText("...");
        itemDrinks.add(jButton8);

        jButton9.setBackground(new java.awt.Color(153, 223, 223));
        jButton9.setText("...");
        itemDrinks.add(jButton9);

        jButton10.setBackground(new java.awt.Color(153, 223, 223));
        jButton10.setText("...");
        itemDrinks.add(jButton10);

        jButton2.setBackground(new java.awt.Color(153, 223, 223));
        jButton2.setText("...");
        itemDrinks.add(jButton2);

        jButton20.setBackground(new java.awt.Color(153, 223, 223));
        jButton20.setText("...");
        itemDrinks.add(jButton20);

        jButton19.setBackground(new java.awt.Color(153, 223, 223));
        jButton19.setText("...");
        itemDrinks.add(jButton19);

        jButton13.setBackground(new java.awt.Color(153, 223, 223));
        jButton13.setText("...");
        itemDrinks.add(jButton13);

        jButton14.setBackground(new java.awt.Color(153, 223, 223));
        jButton14.setText("...");
        itemDrinks.add(jButton14);

        jButton17.setBackground(new java.awt.Color(153, 223, 223));
        jButton17.setText("...");
        itemDrinks.add(jButton17);

        jButton23.setBackground(new java.awt.Color(153, 223, 223));
        jButton23.setText("...");
        itemDrinks.add(jButton23);

        jButton24.setBackground(new java.awt.Color(153, 223, 223));
        jButton24.setText("...");
        itemDrinks.add(jButton24);

        jButton22.setBackground(new java.awt.Color(153, 223, 223));
        jButton22.setText("...");
        itemDrinks.add(jButton22);

        jButton18.setBackground(new java.awt.Color(153, 223, 223));
        jButton18.setText("...");
        itemDrinks.add(jButton18);

        jButton16.setBackground(new java.awt.Color(153, 223, 223));
        jButton16.setText("...");
        itemDrinks.add(jButton16);

        jButton15.setBackground(new java.awt.Color(153, 223, 223));
        jButton15.setText("...");
        itemDrinks.add(jButton15);

        DrinksFun.setBackground(new java.awt.Color(0, 153, 153));

        jButton34.setBackground(new java.awt.Color(0, 153, 153));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_30px_1.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(0, 153, 153));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_pencil_30px.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(0, 153, 153));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_trash_can_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout DrinksFunLayout = new javax.swing.GroupLayout(DrinksFun);
        DrinksFun.setLayout(DrinksFunLayout);
        DrinksFunLayout.setHorizontalGroup(
            DrinksFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksFunLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DrinksFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DrinksFunLayout.setVerticalGroup(
            DrinksFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DrinksFunLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35)
                .addGap(18, 18, 18)
                .addComponent(jButton42)
                .addGap(17, 17, 17))
        );

        Table.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Table");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Số Bàn"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton43.setBackground(new java.awt.Color(0, 153, 153));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_30px_1.png"))); // NOI18N

        jButton44.setBackground(new java.awt.Color(0, 153, 153));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_pencil_30px.png"))); // NOI18N

        jButton45.setBackground(new java.awt.Color(0, 153, 153));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_trash_can_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout TableLayout = new javax.swing.GroupLayout(Table);
        Table.setLayout(TableLayout);
        TableLayout.setHorizontalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        TableLayout.setVerticalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(TableLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TableLayout.createSequentialGroup()
                                .addComponent(jButton43)
                                .addGap(15, 15, 15)
                                .addComponent(jButton44)
                                .addGap(19, 19, 19)
                                .addComponent(jButton45))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Drinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(itemDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DrinksFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64)))
                .addGap(91, 91, 91))
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(Drinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DrinksFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        control.add(Menu, "card4");

        Salary.setForeground(new java.awt.Color(102, 102, 0));
        Salary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setBackground(new java.awt.Color(102, 0, 0));

        tbLuong.setAutoCreateRowSorter(true);
        tbLuong.setBackground(new java.awt.Color(127, 69, 69));
        tbLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Số Giờ Làm Việc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbLuong.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tbLuong);

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Search by :");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STT", "Mã NV", "Tên NV" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(102, 0, 0));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_20px.png"))); // NOI18N

        jButton38.setBackground(new java.awt.Color(102, 0, 0));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_30px_1.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(102, 0, 0));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_pencil_30px.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(102, 0, 0));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_trash_can_30px_1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("BẢNG LƯƠNG");

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tháng Làm Viêc:");

        jTextField6.setBackground(new java.awt.Color(127, 69, 69));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout table2Layout = new javax.swing.GroupLayout(table2);
        table2.setLayout(table2Layout);
        table2Layout.setHorizontalGroup(
            table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(table2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(table2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        table2Layout.setVerticalGroup(
            table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton39, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton40, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(table2Layout.createSequentialGroup()
                        .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(table2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(table2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton37)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        Salary.add(table2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        control.add(Salary, "card3");

        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(0, 0, 153));

        tbKH.setAutoCreateRowSorter(true);
        tbKH.setBackground(new java.awt.Color(86, 114, 168));
        tbKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH", "Ngày Sinh", "Giới Tính", "SĐT", "Email", "MaNV"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbKH.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(tbKH);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search by :");

        jComboBox2.setBackground(new java.awt.Color(0, 51, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STT", "Mã NV", "Tên NV" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 51, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_20px.png"))); // NOI18N

        jButton11.setBackground(new java.awt.Color(0, 51, 153));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_30px_1.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 51, 153));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_pencil_30px.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(0, 51, 153));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_trash_can_30px_1.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KHÁCH HÀNG");

        jTextField5.setBackground(new java.awt.Color(86, 114, 168));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout table1Layout = new javax.swing.GroupLayout(table1);
        table1.setLayout(table1Layout);
        table1Layout.setHorizontalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(table1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, table1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        table1Layout.setVerticalGroup(
            table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(table1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(table1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton36)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Customer.add(table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        control.add(Customer, "card3");

        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(61, 29, 61));

        tbNhanVien.setAutoCreateRowSorter(true);
        tbNhanVien.setBackground(new java.awt.Color(109, 72, 109));
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên NV", "Ngày Sinh", "Giới Tính", "CMND", "SĐT", "Email", "Ngày Bắt Đầu", "Trị Giá Lương", "MaNV"
            }
        ));
        tbNhanVien.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbNhanVien);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search by :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STT", "Mã NV", "Tên NV" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(109, 72, 109));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(53, 17, 53));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_20px.png"))); // NOI18N

        AddNV.setBackground(new java.awt.Color(53, 17, 53));
        AddNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_30px_1.png"))); // NOI18N
        AddNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNVMouseClicked(evt);
            }
        });
        AddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNVActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(53, 17, 53));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_pencil_30px.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(53, 17, 53));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_trash_can_30px_1.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NHÂN VIÊN");

        javax.swing.GroupLayout tableLayout = new javax.swing.GroupLayout(table);
        table.setLayout(tableLayout);
        tableLayout.setHorizontalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(tableLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(AddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(tableLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        tableLayout.setVerticalGroup(
            tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AddNV)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Employee.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        control.add(Employee, "card3");

        Staff.add(control, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 750, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Staff, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void StaffFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffFunActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
       
               
        try {
            // connnect to database 'testdb'
            Connection conn =(Connection) ConnectDB.getConnection(ConnectDB.DB_URL, ConnectDB.USER_NAME, ConnectDB.PASSWORD);
            // crate statement
            Statement sts = (Statement) conn.createStatement();
            // get data from table 'student'
            ResultSet rs = sts.executeQuery("select * from nhanvien");
            // show data
            while (rs.next()) {
                 model.addRow(new Object[]{rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(5),rs.getString(4),rs.getString(6), rs.getDate(7),rs.getInt(9),rs.getInt(8)});
                 
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_StaffFunActionPerformed

    private void HomeFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeFunActionPerformed

    private void MenuFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuFunActionPerformed

    private void CustomerFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerFunActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbKH.getModel();
       
               
        try {
            // connnect to database 'testdb'
            Connection conn =(Connection) ConnectDB.getConnection(ConnectDB.DB_URL, ConnectDB.USER_NAME, ConnectDB.PASSWORD);
            // crate statement
            Statement sts = (Statement) conn.createStatement();
            // get data from table 'student'
            ResultSet rs = sts.executeQuery("select * from khachhang");
            // show data
            while (rs.next()) {
                 model.addRow(new Object[]{rs.getString(3),rs.getDate(4),rs.getString(2),rs.getInt(6),rs.getString(5),rs.getInt(1)});
                 
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_CustomerFunActionPerformed

    private void StaffFunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaffFunMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==MenuFun){
            Menu.setVisible(true);
            Customer.setVisible(false);
            Employee.setVisible(false);
            Home.setVisible(false);
            Salary.setVisible(false);
        }
        if (evt.getSource()==CustomerFun){
            Menu.setVisible(false); 
            Customer.setVisible(true);
            Employee.setVisible(false);
            Home.setVisible(false);
            Salary.setVisible(false);
        }
        if (evt.getSource()==StaffFun){
            Menu.setVisible(false);
            Customer.setVisible(false);
            Employee.setVisible(true);
            Home.setVisible(false);
            Salary.setVisible(false);
        }
        if (evt.getSource()==SalaryFun){
            Menu.setVisible(false);
            Customer.setVisible(false);
            Employee.setVisible(false);
            Salary.setVisible(true);
            Home.setVisible(false);
        }
        if (evt.getSource()==HomeFun){
            Menu.setVisible(false);
            Customer.setVisible(false);
            Employee.setVisible(false);
            Home.setVisible(true);
            Salary.setVisible(false);
        }
    }//GEN-LAST:event_StaffFunMouseClicked

    private void SalaryFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryFunActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbLuong.getModel();
       
               
        try {
            // connnect to database 'testdb'
            Connection conn =(Connection) ConnectDB.getConnection(ConnectDB.DB_URL, ConnectDB.USER_NAME, ConnectDB.PASSWORD);
            // crate statement
            Statement sts = (Statement) conn.createStatement();
            // get data from table 'student'
            ResultSet rs = sts.executeQuery("select * from luong");
            // show data
            while (rs.next()) {
                 model.addRow(new Object[]{rs.getInt(1),rs.getInt(2)});
                 
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SalaryFunActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void AddNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNVMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AddNVMouseClicked

    private void AddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNVActionPerformed
    try {
        // TODO add your handling code here:
        AddNhanVien nw = new AddNhanVien();
        nw.NewScreen();
        
    } catch (SQLException ex) {
        Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_AddNVActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed

        // TODO add your handling code here:
         AddMonAn n = new AddMonAn();
        n.setVisible(true);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        ThemThongTinLuongNV a = new ThemThongTinLuongNV();
        a.setVisible(true);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
         SuaThongTinKhachHang n = new SuaThongTinKhachHang();
        n.setVisible(true);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:
    
        SuaThongTinNV asd = new SuaThongTinNV();
        asd.setVisible(true);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        AddKhachHang n = new AddKhachHang();
        n.setVisible(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
         SuaThongTinKhachHang n = new SuaThongTinKhachHang();
        n.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        SuaThongTinMonAn n = new SuaThongTinMonAn();
        n.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Manager().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNV;
    private javax.swing.JPanel Customer;
    private javax.swing.JButton CustomerFun;
    private javax.swing.JPanel Drinks;
    private javax.swing.JPanel DrinksFun;
    private javax.swing.JPanel Employee;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel Home;
    private javax.swing.JButton HomeFun;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuFun;
    private javax.swing.JPanel Salary;
    private javax.swing.JButton SalaryFun;
    private javax.swing.JPanel Search;
    private javax.swing.JPanel Staff;
    private javax.swing.JButton StaffFun;
    private javax.swing.JPanel Table;
    private javax.swing.JPanel control;
    private javax.swing.JPanel function;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel itemDrinks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel picture;
    private javax.swing.JPanel table;
    private javax.swing.JPanel table1;
    private javax.swing.JPanel table2;
    private javax.swing.JTable tbKH;
    private javax.swing.JTable tbLuong;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
