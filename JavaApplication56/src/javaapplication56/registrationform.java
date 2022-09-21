package javaapplication56;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class registrationform extends javax.swing.JFrame {
    Connection con;

    public registrationform() {
        initComponents();
        fname.setBackground(new Color(0,0,0,160));
        lname.setBackground(new Color(0,0,0,160));
        mailfield.setBackground(new Color(0,0,0,160));
        usernamereg.setBackground(new Color(0,0,0,160));
        passwordreg.setBackground(new Color(0,0,0,160));
        registrationbtn.setBackground(new Color(0,0,0,160));
        phn.setBackground(new Color(0,0,0,160));
        backbtn.setBackground(new Color(0,0,0,160));
        tpPannel.setBackground( new Color(0,0,0,160));
        createConnection();
    }
    //database connection are done here
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        userlbl = new javax.swing.JLabel();
        passlbl = new javax.swing.JLabel();
        usernamereg = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordreg = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        fname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lname = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        mailfield = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        phn = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        backbtn = new javax.swing.JButton();
        registrationbtn = new javax.swing.JButton();
        phnlbl = new javax.swing.JLabel();
        maiLlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fnamelbl = new javax.swing.JLabel();
        roles = new javax.swing.JComboBox<>();
        tpPannel = new javax.swing.JPanel();
        bglbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Register  Here");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 160, 40));

        header.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        header.setForeground(new java.awt.Color(204, 204, 204));
        header.setText("                                                 Safety is Our First Priority");
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        userlbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        userlbl.setForeground(new java.awt.Color(204, 204, 204));
        userlbl.setText("username :");
        getContentPane().add(userlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, 30));

        passlbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        passlbl.setForeground(new java.awt.Color(204, 204, 204));
        passlbl.setText("password :");
        passlbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                passlblAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(passlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 80, 30));

        usernamereg.setForeground(new java.awt.Color(204, 204, 204));
        usernamereg.setBorder(null);
        usernamereg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameregActionPerformed(evt);
            }
        });
        getContentPane().add(usernamereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 240, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 240, 10));

        passwordreg.setForeground(new java.awt.Color(204, 204, 204));
        passwordreg.setBorder(null);
        passwordreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordregActionPerformed(evt);
            }
        });
        getContentPane().add(passwordreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 240, 30));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 240, 10));

        fname.setForeground(new java.awt.Color(204, 204, 204));
        fname.setBorder(null);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 240, 30));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 10));

        lname.setForeground(new java.awt.Color(204, 204, 204));
        lname.setBorder(null);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, 30));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 10));

        mailfield.setForeground(new java.awt.Color(204, 204, 204));
        mailfield.setBorder(null);
        mailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailfieldActionPerformed(evt);
            }
        });
        getContentPane().add(mailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 240, 30));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 740, 10));

        phn.setForeground(new java.awt.Color(204, 204, 204));
        phn.setBorder(null);
        phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnActionPerformed(evt);
            }
        });
        getContentPane().add(phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 240, 30));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 240, 10));

        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Go Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, -1, 30));

        registrationbtn.setForeground(new java.awt.Color(204, 204, 204));
        registrationbtn.setText("Register");
        registrationbtn.setBorder(null);
        registrationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registrationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 70, 30));

        phnlbl.setForeground(new java.awt.Color(204, 204, 204));
        phnlbl.setText("Phone :");
        getContentPane().add(phnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, 30));

        maiLlbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        maiLlbl.setForeground(new java.awt.Color(204, 204, 204));
        maiLlbl.setText("E-mail :");
        getContentPane().add(maiLlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 60, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Last name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 70, 20));

        fnamelbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        fnamelbl.setForeground(new java.awt.Color(204, 204, 204));
        fnamelbl.setText("First name :");
        getContentPane().add(fnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 80, 30));

        roles.setBackground(new java.awt.Color(0, 0, 0));
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROLE", "Admin", "Passenger" }));
        roles.setBorder(null);
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });
        getContentPane().add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 240, 30));
        getContentPane().add(tpPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        bglbl.setForeground(new java.awt.Color(0, 0, 0));
        bglbl.setIcon(new javax.swing.ImageIcon("D:\\ProjectImage\\regBG1.jpeg")); // NOI18N
        getContentPane().add(bglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        setSize(new java.awt.Dimension(814, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passlblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_passlblAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_passlblAncestorAdded

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        loginnn login = new loginnn();
        setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void mailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailfieldActionPerformed

    private void usernameregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameregActionPerformed

    private void passwordregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordregActionPerformed

    private void phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnActionPerformed

    private void registrationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationbtnActionPerformed
        try {
            String frstname = fname.getText();
            String lstname = lname.getText();
            String email = mailfield.getText();
            String uname = usernamereg.getText();
            String pass = passwordreg.getText();
            String phone = phn.getText();
            String roleAs = roles.getSelectedItem().toString();
            Statement stmt = con.createStatement();
            String regop = "INSERT INTO registration_table VALUES ('" + frstname + "','" + lstname + "','" + email + "','" +uname+ "','" +pass+ "','" +phone+ "','" + roleAs + "');";
            if(frstname==" "||lstname==" "||uname==" "||pass==" "||phone==" "||roleAs=="ROLE"){
                JOptionPane.showMessageDialog(this, "FIELD empty!");
            }
            else{
                stmt.execute(regop);
                JOptionPane.showMessageDialog(this, "Rgistration complete !!");
                stmt.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(registrationform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registrationbtnActionPerformed

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed

    }//GEN-LAST:event_rolesActionPerformed

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
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel bglbl;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fnamelbl;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel maiLlbl;
    private javax.swing.JTextField mailfield;
    private javax.swing.JLabel passlbl;
    private javax.swing.JPasswordField passwordreg;
    private javax.swing.JTextField phn;
    private javax.swing.JLabel phnlbl;
    private javax.swing.JButton registrationbtn;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JPanel tpPannel;
    private javax.swing.JLabel userlbl;
    private javax.swing.JTextField usernamereg;
    // End of variables declaration//GEN-END:variables
}
