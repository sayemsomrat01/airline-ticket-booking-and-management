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

public class ticketPrintMulti extends javax.swing.JFrame {
    Connection con;
   
    public ticketPrintMulti() {
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
        ticketinfoMulti = new javax.swing.JTextArea();
        DepartureToMulti1 = new javax.swing.JTextField();
        printMulti = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        departurefromMulti = new javax.swing.JTextField();
        departureToMulti = new javax.swing.JTextField();
        departFromMulti1 = new javax.swing.JTextField();
        depFrom = new javax.swing.JLabel();
        depTo = new javax.swing.JLabel();
        depFromMulti = new javax.swing.JLabel();
        depToMulti = new javax.swing.JLabel();
        numOfSeatMulti = new javax.swing.JTextField();
        passNameMulti = new javax.swing.JTextField();
        numOfSeat = new javax.swing.JLabel();
        passName = new javax.swing.JLabel();
        depDate = new javax.swing.JLabel();
        flightnameMulti = new javax.swing.JTextField();
        bookMulti = new javax.swing.JButton();
        bgPanel = new javax.swing.JPanel();
        DepartureDateMulti = new javax.swing.JTextField();
        multiFlightLbl = new javax.swing.JLabel();
        multilogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketinfoMulti.setColumns(20);
        ticketinfoMulti.setRows(5);
        ticketinfoMulti.setBorder(null);
        ticketinfoMulti.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ticket.setViewportView(ticketinfoMulti);

        getContentPane().add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 730, 290));
        getContentPane().add(DepartureToMulti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 190, 30));

        printMulti.setText("Print");
        printMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMultiActionPerformed(evt);
            }
        });
        getContentPane().add(printMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 90, 30));

        header.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("MULTI WAY BOOKING");
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 370, 50));
        getContentPane().add(departurefromMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 30));
        getContentPane().add(departureToMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, 30));
        getContentPane().add(departFromMulti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 190, 30));

        depFrom.setForeground(new java.awt.Color(255, 255, 255));
        depFrom.setText("Departure from :");
        getContentPane().add(depFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        depTo.setForeground(new java.awt.Color(255, 255, 255));
        depTo.setText("Departure to :");
        getContentPane().add(depTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 30));

        depFromMulti.setForeground(new java.awt.Color(255, 255, 255));
        depFromMulti.setText("Departure from (multi)");
        getContentPane().add(depFromMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 130, 30));

        depToMulti.setForeground(new java.awt.Color(255, 255, 255));
        depToMulti.setText("Departure to (multi)");
        getContentPane().add(depToMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 120, 30));
        getContentPane().add(numOfSeatMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 180, 30));
        getContentPane().add(passNameMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 180, 30));

        numOfSeat.setForeground(new java.awt.Color(255, 255, 255));
        numOfSeat.setText("Number of Seat :");
        getContentPane().add(numOfSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 120, 30));

        passName.setForeground(new java.awt.Color(255, 255, 255));
        passName.setText("Passenger name :");
        getContentPane().add(passName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 140, 30));

        depDate.setForeground(new java.awt.Color(255, 255, 255));
        depDate.setText("Departure date :");
        getContentPane().add(depDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 110, 30));
        getContentPane().add(flightnameMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, 170, 30));

        bookMulti.setText("Confirm");
        bookMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookMultiActionPerformed(evt);
            }
        });
        getContentPane().add(bookMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, 90, 30));

        bgPanel.setBackground(new java.awt.Color(131, 162, 208));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgPanel.add(DepartureDateMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 30));

        multiFlightLbl.setForeground(new java.awt.Color(255, 255, 255));
        multiFlightLbl.setText("Flight :");
        bgPanel.add(multiFlightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 50, 30));

        multilogout.setText("Exit");
        multilogout.setBorder(null);
        multilogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multilogoutActionPerformed(evt);
            }
        });
        bgPanel.add(multilogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 690, 90, 30));

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 760));

        setSize(new java.awt.Dimension(1154, 796));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMultiActionPerformed
        try{
           ticketinfoMulti.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_printMultiActionPerformed

    private void bookMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookMultiActionPerformed
     
        try {
            String passname = passNameMulti.getText();
            String flname = flightnameMulti.getText();
            String numOfseat = numOfSeatMulti.getText();
            String departureDate = DepartureDateMulti.getText();
            String depFrom = departurefromMulti.getText();
            String depTo = departureToMulti.getText();
            String depFromMulti = departFromMulti1.getText();
            String depToMulti = DepartureToMulti1.getText();
            String returnTo = "x";
            String returnDate = "x";
            String returnFrom = "x";
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\t\t\t\tWelcome to ASTRA AIRLINES");
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Name Of Passenger : "+passNameMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Name Of Passenger : "+flightnameMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Number of Seat : "+numOfSeatMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Departure Date : "+DepartureDateMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Departure From : "+departurefromMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Departure To : "+departureToMulti.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Departure From (multi): "+departFromMulti1.getText());
            ticketinfoMulti.setText(ticketinfoMulti.getText()+"\n Departure To (multi): "+DepartureToMulti1.getText());
            
            
            String bookingQuery = "INSERT INTO booking_list VALUES('"+passname+"','"+flname+"','"+numOfseat+"','"+departureDate+"','"+depFrom+"','"+depTo+"','"+depFromMulti+"','"+depToMulti+"','"+returnTo+"','"+returnDate+"','"+returnFrom+"')";
            Statement stmt = con.createStatement();
            stmt.execute(bookingQuery);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ticketPrintMulti.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_bookMultiActionPerformed

    private void multilogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multilogoutActionPerformed
        loginnn login = new loginnn();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_multilogoutActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketPrintMulti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DepartureDateMulti;
    private javax.swing.JTextField DepartureToMulti1;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton bookMulti;
    private javax.swing.JLabel depDate;
    private javax.swing.JLabel depFrom;
    private javax.swing.JLabel depFromMulti;
    private javax.swing.JLabel depTo;
    private javax.swing.JLabel depToMulti;
    private javax.swing.JTextField departFromMulti1;
    private javax.swing.JTextField departureToMulti;
    private javax.swing.JTextField departurefromMulti;
    private javax.swing.JTextField flightnameMulti;
    private javax.swing.JLabel header;
    private javax.swing.JLabel multiFlightLbl;
    private javax.swing.JButton multilogout;
    private javax.swing.JLabel numOfSeat;
    private javax.swing.JTextField numOfSeatMulti;
    private javax.swing.JLabel passName;
    private javax.swing.JTextField passNameMulti;
    private javax.swing.JButton printMulti;
    private javax.swing.JScrollPane ticket;
    private javax.swing.JTextArea ticketinfoMulti;
    // End of variables declaration//GEN-END:variables
}
