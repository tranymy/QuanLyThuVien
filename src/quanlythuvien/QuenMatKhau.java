/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlythuvien;

//import Dao.QuenMKDAO;
import Dao.NhanVienDao;
import Entity.NhanVien;
import java.awt.Color;
import java.awt.Font;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import utils.Auth;
import utils.Auth_02;
import utils.MsgBox;
import utils.ramdom;

/**
 *
 * @author Admin
 */
public class QuenMatKhau extends javax.swing.JFrame {

    NhanVienDao dao = new NhanVienDao();
 private static final String P_Mail = "^[a-zA-Z0-9._%+-]+@(fpt\\.edu\\.vn|gmail\\.com)$";
    /**
     * Creates new form NewJFrame
     */
    public QuenMatKhau() {
        initComponents();
        init();

    }

    void guiOTP() {

        String combination = "0123456789";
        int len = 6;
        char[] maOTP = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            maOTP[i] = combination.charAt(r.nextInt(combination.length()));
        }
        lblOTP.setText(new String(maOTP));

        final String username = "tranymy1505@gmail.com";
        final String password = "ubxbmpkrqfoyucju";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("tranymy1505@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(txtEmail.getText()));
            message.setSubject("Mã xác nhận Gmail");
            message.setText(
                    "Xin chào bạn \n"
                    + "Chúng tôi muốn cho bạn biết rằng emai trên ứng dụng QUANLYTHUVIEN của bạn đã được xác nhận để lấy mã OTP.\n"
                    + "Mã OTP của bạn là: " + new String(maOTP) + ". \n"
                    + "Vui lòng truy cập vào form LayLaiMatKhau để tiến hành đặt lại mật khẩu ngay!\n"
                    + "Nếu bạn gặp sự cố, vui lòng liên hệ với bộ phận hỗ trợ thông qua email: \n"
                    + "tranymy1505@gmail.com hoặc email: duyvnpc05487@fpt.edu.vn\n"
                    + "Chúng tôi sẽ không bao giờ hỏi mật khẩu của bạn và "
                    + "chúng tôi đặc biệt không khuyến khích bạn chia sẻ mật khẩu đó với bất kỳ ai.\n"
                    + "Xin chân thành cảm ơn."
            );

            Transport.send(message);

            JOptionPane.showMessageDialog(this, "Gửi thành công mã OTP");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    void xacNhanOTP() {
        if (txtotp.getText().equalsIgnoreCase(lblOTP.getText())) {
            JOptionPane.showMessageDialog(this, "Xác nhận thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Nhập sai mã OTP vui lòng nhập lại");
        }
        return;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOTP = new javax.swing.JLabel();
        menu_11 = new component.menu_1();
        jLabel3 = new javax.swing.JLabel();
        panelBorder1 = new swing.menu.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        btnxacNhan = new button.MyButton();
        btnGui = new button.MyButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMacapcha = new button.textfield.TextField();
        txtEmail = new button.textfield.TextField();
        txtCapcha = new button.textfield.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtotp = new button.textfield.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quên mật khẩu");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout menu_11Layout = new javax.swing.GroupLayout(menu_11);
        menu_11.setLayout(menu_11Layout);
        menu_11Layout.setHorizontalGroup(
            menu_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_11Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_11Layout.setVerticalGroup(
            menu_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelBorder1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã");


        btnxacNhan.setText("Xác Nhận");
        btnxacNhan.setRadius(12);
        btnxacNhan.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxacNhanActionPerformed(evt);
            }
        });

        btnGui.setText("Gửi");
        btnGui.setRadius(12);
        btnGui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuiMouseClicked(evt);
            }
        });
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Capcha");

        txtMacapcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMacapchaActionPerformed(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtCapcha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCapchaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCapchaFocusLost(evt);
            }
        });
        txtCapcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapchaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Enter OTP");

        txtotp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtotpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtotpFocusLost(evt);
            }
        });
        txtotp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnxacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMacapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(284, 284, 284))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(txtotp, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMacapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtotp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGui, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menu_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxacNhanActionPerformed
        // TODO add your handling code here:

        String email = txtEmail.getText();
        NhanVien nv = dao.selectByEmail(email);
        //MsgBox.showMessageDialog(this,nv.getEMAIL());         
        xacNhanOTP();
        Auth_02.Email = nv;
        //MsgBox.showMessageDialog(this, "Đăng nhập thành công !\nNgười dùng " + "'" + Auth_02.Email.getEMAIL()+ "'");
        LayLaiMatKhau llmk = new LayLaiMatKhau();
        llmk.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnxacNhanActionPerformed

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        // TODO add your handling code here:
        // this.resetPass();
        //  guiOTP();

    }//GEN-LAST:event_btnGuiActionPerformed

    private void txtMacapchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMacapchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMacapchaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if (txtEmail.getText().equalsIgnoreCase("Email...")) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (txtEmail.getText().equalsIgnoreCase("")) {
            txtEmail.setText("Email...");
            txtEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtCapchaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapchaFocusGained
        // TODO add your handling code here:
        if (txtCapcha.getText().equalsIgnoreCase("Capcha...")) {
            txtCapcha.setText("");
            txtCapcha.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCapchaFocusGained

    private void txtCapchaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCapchaFocusLost
        // TODO add your handling code here:
        if (txtCapcha.getText().equalsIgnoreCase("")) {
            txtCapcha.setText("Capcha...");
            txtCapcha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCapchaFocusLost

    private void txtCapchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapchaActionPerformed


    private void txtotpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtotpFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotpFocusGained

    private void txtotpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtotpFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotpFocusLost

    private void txtotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotpActionPerformed

    private void btnGuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuiMouseClicked
        // TODO add your handling code here:
        if (kiemloi()) {
            guiOTP();
            lammoi();
        }
    }//GEN-LAST:event_btnGuiMouseClicked


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
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuenMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnGui;
    private button.MyButton btnxacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblOTP;
    private component.menu_1 menu_11;
    private swing.menu.PanelBorder panelBorder1;
    private button.textfield.TextField txtCapcha;
    private button.textfield.TextField txtEmail;
    private button.textfield.TextField txtMacapcha;
    private button.textfield.TextField txtotp;
    // End of variables declaration//GEN-END:variables

    void init() {
        hienthiGoiY();
        maCapcha();


    }

    public void hienthiGoiY() {
//        txtEmail.setText("Email....");
//        txtCapcha.setText("Capcha...");

        txtMacapcha.setForeground(Color.gray);
        txtMacapcha.setEditable(false);
        txtMacapcha.requestFocus();
    }

    boolean kiemloi() {

        if (txtEmail.getText().equalsIgnoreCase("")) {
            txtEmail.requestFocus();
            MsgBox.alert(this, "Không để trống Email");
            return false;
        } 
        Matcher Mail = Pattern.compile(P_Mail).matcher(txtEmail.getText());
        if (!Mail.matches()) {
            JOptionPane.showMessageDialog(this, "Sai định dạng mail!");
            return false;
        }
       

        if (txtCapcha.getText().equalsIgnoreCase("")) {
            txtCapcha.requestFocus();
            MsgBox.alert(this, "Không để trống Capcha");
            return false;
        }
        if (!txtCapcha.getText().equalsIgnoreCase(txtMacapcha.getText())) {
            txtCapcha.requestFocus();
            MsgBox.alert(this, "Mã capcha không khớp");
            maCapcha();
            return false;
        }
        return true;
    }

    void maCapcha() {
        String capcha = new ramdom().soNgauNHIEN(5);
        txtMacapcha.setText(capcha);
        txtMacapcha.setFont(new Font(capcha, Font.HANGING_BASELINE, 14));
    }

    void lammoi() {

        // hienthiGoiY();
        maCapcha();
    }
    //     private String getRandomString(int n) {
//        String txt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ1234567890";
//        StringBuilder sb = new StringBuilder();
//        while (n > 0) {
//            Random rd = new Random();
//            sb.append(txt.charAt(rd.nextInt(txt.length())));
//            n--;
//        }
//        return sb.toString();
//    }
// void hienmaOTP() {
//        String combination = "0123456789";
//        int len = 6;
//        char[] maOTP = new char[len];
//        Random r = new Random();
//        for (int i = 0; i < len; i++) {
//            maOTP[i] = combination.charAt(r.nextInt(combination.length()));
//        }
//        txtotp.setText(new String(maOTP));
//    }
//private void resetPass() {
//    if(kiemloi()){
//        try {
//             QuenMKDAO qmk  = new QuenMKDAO();
//            qmk.update(txtEmail.getText());
//            qmk.sendmail(txtEmail.getText());
//
//            System.out.println("The e-mail has been sent successfully!");
//            MsgBox.alert(this, "Email đã được gửi thành công. Vui lòng kiểm tra ngay!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        lammoi();
//    }
//    }

}
