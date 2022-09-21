
package javaapplication56;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class adminpannel extends javax.swing.JFrame {
    Connection con;
    PreparedStatement p;
    ResultSet r;
    
    ArrayList<airlineAdmin> airadm;
    String header[] = new String[]{"Flight","Price","Available","Seat"};
    DefaultTableModel dtm;
    int row,col;
    
    public adminpannel() {
        initComponents();
        airadm = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        dataTable.setModel(dtm);
        this.setLocationRelativeTo(null);
        createConnection();
    }
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

        flightlbl = new javax.swing.JLabel();
        pricelbl = new javax.swing.JLabel();
        availabltylbl = new javax.swing.JLabel();
        seatlbl = new javax.swing.JLabel();
        admlbl = new javax.swing.JLabel();
        flightinp = new javax.swing.JTextField();
        priceinp = new javax.swing.JTextField();
        avlbltyipt = new javax.swing.JTextField();
        booklistShow = new javax.swing.JButton();
        seatinp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        admbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flightlbl.setForeground(new java.awt.Color(255, 255, 255));
        flightlbl.setText("Flight name :");
        getContentPane().add(flightlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 30));

        pricelbl.setForeground(new java.awt.Color(255, 255, 255));
        pricelbl.setText("Price :");
        getContentPane().add(pricelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 70, 30));

        availabltylbl.setForeground(new java.awt.Color(255, 255, 255));
        availabltylbl.setText("Availability :");
        getContentPane().add(availabltylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 70, 30));

        seatlbl.setForeground(new java.awt.Color(255, 255, 255));
        seatlbl.setText("Seat :");
        getContentPane().add(seatlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 70, 30));

        admlbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        admlbl.setForeground(new java.awt.Color(255, 255, 255));
        admlbl.setText("Admin Dashboard");
        getContentPane().add(admlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 300, 50));

        flightinp.setBackground(new java.awt.Color(0, 0, 0));
        flightinp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(flightinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 182, 220, 30));

        priceinp.setBackground(new java.awt.Color(0, 0, 0));
        priceinp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(priceinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 220, 30));

        avlbltyipt.setBackground(new java.awt.Color(0, 0, 0));
        avlbltyipt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(avlbltyipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 220, 30));

        booklistShow.setBackground(new java.awt.Color(0, 0, 0));
        booklistShow.setForeground(new java.awt.Color(255, 255, 255));
        booklistShow.setText("List of Booking");
        booklistShow.setBorder(null);
        booklistShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booklistShowActionPerformed(evt);
            }
        });
        getContentPane().add(booklistShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 100, 30));

        seatinp.setBackground(new java.awt.Color(0, 0, 0));
        seatinp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(seatinp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 220, 30));

        dataTable.setBackground(new java.awt.Color(153, 153, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Flight", "Price", "Available", "Seat"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 890, -1));

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 80, 30));

        dltbtn.setBackground(new java.awt.Color(0, 0, 0));
        dltbtn.setForeground(new java.awt.Color(255, 255, 255));
        dltbtn.setText("DELETE");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });
        getContentPane().add(dltbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 80, 30));

        savebtn.setBackground(new java.awt.Color(0, 0, 0));
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, 30));

        viewbtn.setBackground(new java.awt.Color(0, 0, 0));
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("VIEW");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 80, 30));

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("logout");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 70, 30));

        admbg.setIcon(new javax.swing.ImageIcon("D:\\ProjectImage\\adminBg_ccexpress.jpeg")); // NOI18N
        getContentPane().add(admbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 1057));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        String flight = flightinp.getText();
        double price = Double.parseDouble(priceinp.getText());
        String available = avlbltyipt.getText();
        int seatnumber = Integer.parseInt(seatinp.getText());
        airadm.add(new airlineAdmin(flight,price,available,seatnumber));
        dtm.setRowCount(0);
        for(int i = 0; i < airadm.size(); i++){
            Object[] objs = {airadm.get(i).flightname,airadm.get(i).price,airadm.get(i).available,airadm.get(i).seat};
            dtm.addRow(objs);
            }
    }//GEN-LAST:event_addbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String flight = flightinp.getText();
        double price = Double.parseDouble(priceinp.getText());
        String available = avlbltyipt.getText();
        int seatnumber = Integer.parseInt(seatinp.getText());
         try {
            // Database section here
            Statement stmt = con.createStatement();
            String addOp = "INSERT INTO flight_info VALUES('" +flight+ "','" +price+"','" +available+ "','" +seatnumber+ "')";
            stmt.execute(addOp);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(adminpannel.class.getName()).log(Level.SEVERE, null, ex);
        }
         clearField();        
    }//GEN-LAST:event_savebtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        String sql="SELECT * FROM flight_info";
    try{      
         p=con.prepareStatement(sql); 
         r= p.executeQuery();
          DefaultTableModel model=(DefaultTableModel)dataTable.getModel();
          model.setRowCount(0);
          
          while(r.next()){
          model.addRow(new String[]{ r.getString(1),r.getString(2),r.getString(3),r.getString(4)});
          }
        }
        catch(Exception e){System.out.println("eroor"+ e.getMessage());
        }

    }//GEN-LAST:event_viewbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        int dialogueButton = JOptionPane.YES_NO_OPTION;
        int dialogueResult = JOptionPane.showConfirmDialog(this, "Dele this Row?", "Delete",dialogueButton);
        if(dialogueResult == 0){
            dtm.removeRow(row);
            airadm.remove(row);
            dtm.setRowCount(0);
            for( int i = 0; i < airadm.size(); i++){
            Object[] obj = {airadm.get(i).flightname,airadm.get(i).price,airadm.get(i).available,airadm.get(i).seat};
            dtm.addRow(obj);
            }
            clearField();
        }
    }//GEN-LAST:event_dltbtnActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        loginnn login = new loginnn();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void booklistShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booklistShowActionPerformed
        bookingList book = new bookingList();
        this.setVisible(false);
        book.setVisible(true);

    }//GEN-LAST:event_booklistShowActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel admbg;
    private javax.swing.JLabel admlbl;
    private javax.swing.JLabel availabltylbl;
    private javax.swing.JTextField avlbltyipt;
    private javax.swing.JButton booklistShow;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton dltbtn;
    private javax.swing.JTextField flightinp;
    private javax.swing.JLabel flightlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField priceinp;
    private javax.swing.JLabel pricelbl;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField seatinp;
    private javax.swing.JLabel seatlbl;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
        try{
        flightinp.setText(null);
        priceinp.setText(null);
        avlbltyipt.setText(null);
        seatinp.setText(null);
    }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
