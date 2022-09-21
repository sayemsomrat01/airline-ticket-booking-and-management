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

public class ticketPrint extends javax.swing.JFrame {
   Connection con;
    public ticketPrint() {
        initComponents(); 
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

        ticket = new javax.swing.JScrollPane();
        ticketinfoOne = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        departurefrm = new javax.swing.JTextField();
        departureTo = new javax.swing.JTextField();
        numberOfSeat = new javax.swing.JTextField();
        nameOfPassenger = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        flightNameOne = new javax.swing.JTextField();
        flightNameLblOne = new javax.swing.JLabel();
        oneWayDate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        oneWayDatelbl = new javax.swing.JLabel();
        confirmOne = new javax.swing.JButton();
        printOne = new javax.swing.JButton();
        oneLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketinfoOne.setColumns(20);
        ticketinfoOne.setRows(5);
        ticketinfoOne.setBorder(null);
        ticketinfoOne.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ticket.setViewportView(ticketinfoOne);

        getContentPane().add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 730, 290));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ONE WAY BOOKING");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 350, 50));
        getContentPane().add(departurefrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 30));
        getContentPane().add(departureTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 180, 30));
        getContentPane().add(numberOfSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 190, 30));
        getContentPane().add(nameOfPassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 190, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Departure from :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Departure to :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number of Seat :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name of Passenger :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 130, 30));
        getContentPane().add(flightNameOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 170, 30));

        flightNameLblOne.setForeground(new java.awt.Color(255, 255, 255));
        flightNameLblOne.setText("Flight :");
        getContentPane().add(flightNameLblOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 50, 30));
        getContentPane().add(oneWayDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 180, 30));

        jPanel1.setBackground(new java.awt.Color(131, 162, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oneWayDatelbl.setForeground(new java.awt.Color(255, 255, 255));
        oneWayDatelbl.setText("Date :");
        jPanel1.add(oneWayDatelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 50, 30));

        confirmOne.setText("CONFIRM");
        confirmOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOneActionPerformed(evt);
            }
        });
        jPanel1.add(confirmOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 90, 30));

        printOne.setText("Print");
        printOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printOneActionPerformed(evt);
            }
        });
        jPanel1.add(printOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 90, 30));

        oneLogout.setText("Exit");
        oneLogout.setBorder(null);
        oneLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(oneLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 680, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 760));

        setSize(new java.awt.Dimension(1154, 796));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printOneActionPerformed
        try{
           ticketinfoOne.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_printOneActionPerformed

    private void confirmOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOneActionPerformed
       try {
           String passname = nameOfPassenger.getText();
           String flname = flightNameOne.getText();
           String numOfseat = numberOfSeat.getText();
           String departureDate = oneWayDate.getText();
           String depFrom = numberOfSeat.getText();
           String depTo = departureTo.getText();
           String depFromMulti = "x";
           String depToMulti = "x";
           String returnTo = "x";
           String returnDate = "x";
           String returnFrom = "x";
           
           ticketinfoOne.setText(ticketinfoOne.getText()+"\t\t\tWelcome to ASTRA AIRLINES");
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Name Of Passenger : "+nameOfPassenger.getText());
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Name Of Flight : "+flightNameOne.getText());
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Departure From : "+departurefrm.getText());
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Departure To : "+departureTo.getText());
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Number of Seat : "+numberOfSeat.getText());
           ticketinfoOne.setText(ticketinfoOne.getText()+"\n Date of Departure : "+oneWayDate.getText());
           
           
           
           String bookingQuery = "INSERT INTO booking_list VALUES('"+passname+"','"+flname+"','"+numOfseat+"','"+departureDate+"','"+depFrom+"','"+depTo+"','"+depFromMulti+"','"+depToMulti+"','"+returnTo+"','"+returnDate+"','"+returnFrom+"')";
           Statement stmt = con.createStatement();
           stmt.execute(bookingQuery);
            stmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(ticketPrint.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_confirmOneActionPerformed

    private void oneLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneLogoutActionPerformed
        loginnn login = new loginnn();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_oneLogoutActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmOne;
    private javax.swing.JTextField departureTo;
    private javax.swing.JTextField departurefrm;
    private javax.swing.JLabel flightNameLblOne;
    private javax.swing.JTextField flightNameOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameOfPassenger;
    private javax.swing.JTextField numberOfSeat;
    private javax.swing.JButton oneLogout;
    private javax.swing.JTextField oneWayDate;
    private javax.swing.JLabel oneWayDatelbl;
    private javax.swing.JButton printOne;
    private javax.swing.JScrollPane ticket;
    private javax.swing.JTextArea ticketinfoOne;
    // End of variables declaration//GEN-END:variables
}
