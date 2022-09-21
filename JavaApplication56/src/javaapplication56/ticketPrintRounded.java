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
public class ticketPrintRounded extends javax.swing.JFrame {

   Connection con;
    public ticketPrintRounded() {
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
        ticketinfoRound = new javax.swing.JTextArea();
        printRound = new javax.swing.JButton();
        departurefromRound = new javax.swing.JTextField();
        departureToRound = new javax.swing.JTextField();
        numberOfSeatRound = new javax.swing.JTextField();
        nameOfPassengerRound = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ReturnFromRound = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ReturnToRound = new javax.swing.JTextField();
        bookRound = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        departureDateRound = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        flightnameRound = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ReturnDateRound = new javax.swing.JTextField();
        flightRndlbl = new javax.swing.JLabel();
        roundLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketinfoRound.setColumns(20);
        ticketinfoRound.setRows(5);
        ticketinfoRound.setBorder(null);
        ticketinfoRound.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ticket.setViewportView(ticketinfoRound);

        getContentPane().add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 730, 290));

        printRound.setText("Print");
        printRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRoundActionPerformed(evt);
            }
        });
        getContentPane().add(printRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 650, 90, 30));
        getContentPane().add(departurefromRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 30));
        getContentPane().add(departureToRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, 30));
        getContentPane().add(numberOfSeatRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 190, 30));
        getContentPane().add(nameOfPassengerRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Departure from :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Departure to :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number of Seat :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 90, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name of Passenger :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Return from :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, 30));
        getContentPane().add(ReturnFromRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 190, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Return  to :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 60, 30));
        getContentPane().add(ReturnToRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 190, 30));

        bookRound.setText("Confirm");
        bookRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoundActionPerformed(evt);
            }
        });
        getContentPane().add(bookRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 90, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Departure Date :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 30));
        getContentPane().add(departureDateRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 170, 30));

        jPanel1.setBackground(new java.awt.Color(131, 162, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ROUNDED WAY BOOKING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 440, 50));

        flightnameRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightnameRoundActionPerformed(evt);
            }
        });
        jPanel1.add(flightnameRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 190, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Return Date :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 70, 30));
        jPanel1.add(ReturnDateRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 160, 30));

        flightRndlbl.setForeground(new java.awt.Color(255, 255, 255));
        flightRndlbl.setText("Flight :");
        jPanel1.add(flightRndlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 50, 30));

        roundLogout.setText("Exit");
        roundLogout.setBorder(null);
        roundLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(roundLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 692, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 760));

        setSize(new java.awt.Dimension(1154, 796));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRoundActionPerformed
        try{
           ticketinfoRound.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_printRoundActionPerformed

    private void bookRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoundActionPerformed
       try {
           String passname = nameOfPassengerRound.getText();
           String flname = flightnameRound.getText();
           String numOfseat = numberOfSeatRound.getText();
           String departureDate = departureDateRound.getText();
           String depFrom = nameOfPassengerRound.getText();
           String depTo = nameOfPassengerRound.getText();
           String depFromMulti = "x";
           String depToMulti = "x";
           String returnTo = ReturnToRound.getText();
           String returnDate = ReturnDateRound.getText();
           String returnFrom = ReturnFromRound.getText();
           
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nPassenger name :"+nameOfPassengerRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nName of Flight :"+flightnameRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nNumber of Seat :"+numberOfSeatRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nDeparture Date :"+departureDateRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nDeparture From :"+departurefromRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nDeparture To :"+departureToRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nReturn From :"+ReturnFromRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nReturn To :"+ReturnToRound.getText());
           ticketinfoRound.setText(ticketinfoRound.getText()+"\nReturn date :"+ReturnDateRound.getText());
           
           
           
           String bookingQuery = "INSERT INTO booking_list VALUES('"+passname+"','"+flname+"','"+numOfseat+"','"+departureDate+"','"+depFrom+"','"+depTo+"','"+depFromMulti+"','"+depToMulti+"','"+returnTo+"','"+returnDate+"','"+returnFrom+"')";
           Statement stmt = con.createStatement();
           stmt.execute(bookingQuery);
           stmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(ticketPrintRounded.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }//GEN-LAST:event_bookRoundActionPerformed

    private void flightnameRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightnameRoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightnameRoundActionPerformed

    private void roundLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundLogoutActionPerformed
        loginnn login = new loginnn();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_roundLogoutActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketPrintRounded().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ReturnDateRound;
    private javax.swing.JTextField ReturnFromRound;
    private javax.swing.JTextField ReturnToRound;
    private javax.swing.JButton bookRound;
    private javax.swing.JTextField departureDateRound;
    private javax.swing.JTextField departureToRound;
    private javax.swing.JTextField departurefromRound;
    private javax.swing.JLabel flightRndlbl;
    private javax.swing.JTextField flightnameRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameOfPassengerRound;
    private javax.swing.JTextField numberOfSeatRound;
    private javax.swing.JButton printRound;
    private javax.swing.JButton roundLogout;
    private javax.swing.JScrollPane ticket;
    private javax.swing.JTextArea ticketinfoRound;
    // End of variables declaration//GEN-END:variables
}
