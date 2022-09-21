package javaapplication56;

import java.sql.ResultSet;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class loginnn extends javax.swing.JFrame {
    Connection con;
    ResultSet rst;
    PreparedStatement pst;

    
    public loginnn() {
        initComponents();
        createConnection();
    }

   
    @SuppressWarnings("unchecked")
     void createConnection(){
        String user = "root";
        String pass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinefinal",user,pass);
            System.out.println("Connection success");
        } catch(Exception e){
        System.out.println(e);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        fieldpannel = new javax.swing.JPanel();
        unamelbl = new javax.swing.JLabel();
        passlbl = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        headingpannel = new javax.swing.JPanel();
        loginlbl = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        roles = new javax.swing.JComboBox<>();
        backgroundlbl = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldpannel.setBackground(new java.awt.Color(0, 0, 0,200));

        unamelbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        unamelbl.setForeground(new java.awt.Color(255, 255, 255));
        unamelbl.setText("username:");

        passlbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        passlbl.setForeground(new java.awt.Color(255, 255, 255));
        passlbl.setText("password:");

        username.setBackground(new java.awt.Color(0, 0, 0,200));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(0, 0, 0,200));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        headingpannel.setBackground(new java.awt.Color(0, 0, 0,180));

        loginlbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        loginlbl.setForeground(new java.awt.Color(255, 255, 255));
        loginlbl.setText("                                                 LOGIN");

        javax.swing.GroupLayout headingpannelLayout = new javax.swing.GroupLayout(headingpannel);
        headingpannel.setLayout(headingpannelLayout);
        headingpannelLayout.setHorizontalGroup(
            headingpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headingpannelLayout.setVerticalGroup(
            headingpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        register.setBackground(new java.awt.Color(0, 0, 0));
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setBorder(null);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(null);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        roles.setBackground(new java.awt.Color(0, 0, 0));
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROLE", "Admin", "Passenger" }));
        roles.setBorder(null);
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fieldpannelLayout = new javax.swing.GroupLayout(fieldpannel);
        fieldpannel.setLayout(fieldpannelLayout);
        fieldpannelLayout.setHorizontalGroup(
            fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingpannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fieldpannelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldpannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(fieldpannelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fieldpannelLayout.setVerticalGroup(
            fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldpannelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(headingpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roles, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(fieldpannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 510, 290));

        backgroundlbl.setIcon(new javax.swing.ImageIcon("D:\\ProjectImage\\rsz_airline.jpg")); // NOI18N
        getContentPane().add(backgroundlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        setSize(new java.awt.Dimension(815, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            String user = username.getText();
            String pass = password.getText();
            String roleAs = roles.getSelectedItem().toString();
            String query = "SELECT * FROM registration_table WHERE username=? and passwd=? and role=?";
            pst=con.prepareStatement(query);
            pst.setString(1,user);
            pst.setString(2,pass);
            pst.setString(3,roleAs);
            rst=pst.executeQuery();          
            
            if(roleAs=="Admin"){
                if(rst.next()){
                this.setVisible(false);
                adminpannel admin = new adminpannel();
                admin.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Something ERROR!");
                }
            }
            else{
                if(rst.next()){
                this.setVisible(false);
                passengerView passenger = new passengerView();
                passenger.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Something ERROR!");
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(loginnn.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        registrationform reg = new registrationform();
        setVisible(false);
        reg.setVisible(true);
    }//GEN-LAST:event_registerActionPerformed

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed
        
    }//GEN-LAST:event_rolesActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(loginnn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginnn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginnn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginnn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginnn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlbl;
    private javax.swing.JPanel fieldpannel;
    private javax.swing.JPanel headingpannel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JLabel passlbl;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
