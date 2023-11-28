/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlythuvien;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author duyvo
 */
public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
        initComponents();
        init();
        this.setLocationRelativeTo(null);

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
        header8 = new component.menu_1();
        TongHopThongKe = new javax.swing.JLabel();
        lblQLNhanVien = new javax.swing.JLabel();
        lblQLPhieuMuon = new javax.swing.JLabel();
        lblQLDocGia = new javax.swing.JLabel();
        lblQLSach = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        footer = new component.menu_1();
        lblDongHo = new javax.swing.JLabel();
        lblGioiThieu = new javax.swing.JLabel();
        lblHoTro = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        myButton2 = new button.MyButton();
        myButton3 = new button.MyButton();
        jPanel3 = new javax.swing.JPanel();
        myButton10 = new button.MyButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        myButton11 = new button.MyButton();
        jPanel4 = new javax.swing.JPanel();
        myButton12 = new button.MyButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        myButton13 = new button.MyButton();
        jPanel5 = new javax.swing.JPanel();
        myButton14 = new button.MyButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        myButton15 = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TongHopThongKe.setBackground(new java.awt.Color(102, 102, 102));
        TongHopThongKe.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TongHopThongKe.setForeground(new java.awt.Color(255, 255, 255));
        TongHopThongKe.setText("Tổng hợp-Thống kê");
        TongHopThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TongHopThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TongHopThongKeMouseExited(evt);
            }
        });

        lblQLNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        lblQLNhanVien.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        lblQLNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNhanVien.setText("Quản lí nhân viên");
        lblQLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQLNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQLNhanVienMouseExited(evt);
            }
        });

        lblQLPhieuMuon.setBackground(new java.awt.Color(204, 204, 204));
        lblQLPhieuMuon.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        lblQLPhieuMuon.setForeground(new java.awt.Color(255, 255, 255));
        lblQLPhieuMuon.setText("Quản lí phiếu mượn");
        lblQLPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLPhieuMuonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQLPhieuMuonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQLPhieuMuonMouseExited(evt);
            }
        });

        lblQLDocGia.setBackground(new java.awt.Color(204, 204, 204));
        lblQLDocGia.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        lblQLDocGia.setForeground(new java.awt.Color(255, 255, 255));
        lblQLDocGia.setText("Quản lí độc giả");
        lblQLDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLDocGiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQLDocGiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQLDocGiaMouseExited(evt);
            }
        });

        lblQLSach.setBackground(new java.awt.Color(204, 204, 204));
        lblQLSach.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        lblQLSach.setForeground(new java.awt.Color(255, 255, 255));
        lblQLSach.setText("Quản lí sách");
        lblQLSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQLSachMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQLSachMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQLSachMouseExited(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(204, 204, 204));
        jLabel54.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home-regular-24.png"))); // NOI18N
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout header8Layout = new javax.swing.GroupLayout(header8);
        header8.setLayout(header8Layout);
        header8Layout.setHorizontalGroup(
            header8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TongHopThongKe)
                .addGap(41, 41, 41)
                .addComponent(lblQLNhanVien)
                .addGap(18, 18, 18)
                .addComponent(lblQLDocGia)
                .addGap(44, 44, 44)
                .addComponent(lblQLPhieuMuon)
                .addGap(44, 44, 44)
                .addComponent(lblQLSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addContainerGap())
        );
        header8Layout.setVerticalGroup(
            header8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(header8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addGroup(header8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(header8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TongHopThongKe)
                            .addGroup(header8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblQLSach)
                                .addComponent(lblQLPhieuMuon)
                                .addComponent(lblQLDocGia)
                                .addComponent(lblQLNhanVien))))))
        );

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 255, 255));

        lblGioiThieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGioiThieu.setForeground(new java.awt.Color(255, 255, 255));
        lblGioiThieu.setText("Giới thiệu");
        lblGioiThieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGioiThieuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGioiThieuMouseExited(evt);
            }
        });

        lblHoTro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHoTro.setForeground(new java.awt.Color(255, 255, 255));
        lblHoTro.setText("Hỗ trợ");
        lblHoTro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoTroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoTroMouseExited(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel57.setText("|");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblGioiThieu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHoTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDongHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGioiThieu)
                        .addComponent(lblHoTro)
                        .addComponent(jLabel57)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sách", "Số lượng ", "NXB", "Thể loại"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Năm");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Doanh thu");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Cao nhất");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Thấp nhất");
        }

        myButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-bar-chart-alt-2.png"))); // NOI18N
        myButton2.setRadius(10);

        myButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-x.png"))); // NOI18N
        myButton3.setRadius(10);
        myButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê theo sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setForeground(new java.awt.Color(255, 204, 204));

        myButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-bar-chart-alt-2.png"))); // NOI18N
        myButton10.setRadius(10);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sách", "Số lượng ", "NXB", "Thể loại"
            }
        ));
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setHeaderValue("Năm");
            jTable5.getColumnModel().getColumn(1).setHeaderValue("Doanh thu");
            jTable5.getColumnModel().getColumn(2).setHeaderValue("Cao nhất");
            jTable5.getColumnModel().getColumn(3).setHeaderValue("Thấp nhất");
        }

        myButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-x.png"))); // NOI18N
        myButton11.setRadius(10);
        myButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(myButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê theo năm", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        myButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-bar-chart-alt-2.png"))); // NOI18N
        myButton12.setRadius(10);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sách", "Số lượng ", "NXB", "Thể loại"
            }
        ));
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setHeaderValue("Năm");
            jTable6.getColumnModel().getColumn(1).setHeaderValue("Doanh thu");
            jTable6.getColumnModel().getColumn(2).setHeaderValue("Cao nhất");
            jTable6.getColumnModel().getColumn(3).setHeaderValue("Thấp nhất");
        }

        myButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-x.png"))); // NOI18N
        myButton13.setRadius(10);
        myButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(myButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê theo doanh thu", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        myButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-bar-chart-alt-2.png"))); // NOI18N
        myButton14.setRadius(10);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sách", "Số lượng ", "NXB", "Thể loại"
            }
        ));
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setHeaderValue("Năm");
            jTable7.getColumnModel().getColumn(1).setHeaderValue("Doanh thu");
            jTable7.getColumnModel().getColumn(2).setHeaderValue("Cao nhất");
            jTable7.getColumnModel().getColumn(3).setHeaderValue("Thấp nhất");
        }

        myButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bx-x.png"))); // NOI18N
        myButton15.setRadius(10);
        myButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(myButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê theo số lượng phiếu mượn", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblQLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhanVienMouseClicked
        // TODO add your handling code here:
        QLNhanVien main = new QLNhanVien();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQLNhanVienMouseClicked

    private void lblQLPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLPhieuMuonMouseClicked
        // TODO add your handling code here:
        QLPhieuMuon main = new QLPhieuMuon();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQLPhieuMuonMouseClicked

    private void lblQLDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLDocGiaMouseClicked
        // TODO add your handling code here:
        QLDocGia main = new QLDocGia();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQLDocGiaMouseClicked

    private void lblQLSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLSachMouseClicked
        // TODO add your handling code here:
        QLSach main = new QLSach();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblQLSachMouseClicked

    private void myButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton3ActionPerformed

    private void myButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton11ActionPerformed

    private void myButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton13ActionPerformed

    private void myButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton15ActionPerformed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel54MouseClicked

    private void TongHopThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TongHopThongKeMouseEntered
        // TODO add your handling code here:
        TongHopThongKe.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_TongHopThongKeMouseEntered

    private void TongHopThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TongHopThongKeMouseExited
        // TODO add your handling code here:
        TongHopThongKe.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_TongHopThongKeMouseExited

    private void lblQLNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhanVienMouseEntered
        // TODO add your handling code here:
        lblQLNhanVien.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblQLNhanVienMouseEntered

    private void lblQLNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLNhanVienMouseExited
        // TODO add your handling code here:
        lblQLNhanVien.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblQLNhanVienMouseExited

    private void lblQLDocGiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLDocGiaMouseEntered
        // TODO add your handling code here:
        lblQLDocGia.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblQLDocGiaMouseEntered

    private void lblQLDocGiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLDocGiaMouseExited
        // TODO add your handling code here:
        lblQLDocGia.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblQLDocGiaMouseExited

    private void lblQLPhieuMuonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLPhieuMuonMouseEntered
        // TODO add your handling code here:
        lblQLPhieuMuon.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblQLPhieuMuonMouseEntered

    private void lblQLPhieuMuonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLPhieuMuonMouseExited
        // TODO add your handling code here:
        lblQLPhieuMuon.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblQLPhieuMuonMouseExited

    private void lblQLSachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLSachMouseEntered
        // TODO add your handling code here:
        lblQLSach.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblQLSachMouseEntered

    private void lblQLSachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQLSachMouseExited
        // TODO add your handling code here:
        lblQLSach.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblQLSachMouseExited

    private void lblGioiThieuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioiThieuMouseEntered
        // TODO add your handling code here:
        lblGioiThieu.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblGioiThieuMouseEntered

    private void lblGioiThieuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGioiThieuMouseExited
        // TODO add your handling code here:
        lblGioiThieu.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblGioiThieuMouseExited

    private void lblHoTroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoTroMouseEntered
        // TODO add your handling code here:
        lblHoTro.setForeground(new Color(242, 242, 242));

    }//GEN-LAST:event_lblHoTroMouseEntered

    private void lblHoTroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoTroMouseExited
        // TODO add your handling code here:
        lblHoTro.setForeground(new Color(255, 255, 0));

    }//GEN-LAST:event_lblHoTroMouseExited

    /**
     * @param args the command line arguments
     */
    public void init() {

        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);

                lblDongHo.setText(text);
            }
        }).start();
    }

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TongHopThongKe;
    private component.menu_1 footer;
    private component.menu_1 header8;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblGioiThieu;
    private javax.swing.JLabel lblHoTro;
    private javax.swing.JLabel lblQLDocGia;
    private javax.swing.JLabel lblQLNhanVien;
    private javax.swing.JLabel lblQLPhieuMuon;
    private javax.swing.JLabel lblQLSach;
    private button.MyButton myButton10;
    private button.MyButton myButton11;
    private button.MyButton myButton12;
    private button.MyButton myButton13;
    private button.MyButton myButton14;
    private button.MyButton myButton15;
    private button.MyButton myButton2;
    private button.MyButton myButton3;
    // End of variables declaration//GEN-END:variables
}
