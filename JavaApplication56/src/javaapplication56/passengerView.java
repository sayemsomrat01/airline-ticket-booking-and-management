
package javaapplication56;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class passengerView extends javax.swing.JFrame {
    PreparedStatement p;
    ResultSet r;
    DefaultTableModel dm;
   Connection con;
    public passengerView() {
        initComponents();
        createConnection();
        passViewPannel.setBackground(new Color(0,0,0,150));
        
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

        passViewPannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        statusTable = new javax.swing.JTable();
        flightsearch = new javax.swing.JTextField();
        passviewbtn = new javax.swing.JButton();
        passbookbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        resultField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusTable.setBackground(new java.awt.Color(51, 51, 51));
        statusTable.setForeground(new java.awt.Color(255, 255, 255));
        statusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Flight Status", "price", "Available", "Seat"
            }
        ));
        jScrollPane1.setViewportView(statusTable);

        flightsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flightsearchKeyReleased(evt);
            }
        });

        passviewbtn.setText("View");
        passviewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passviewbtnActionPerformed(evt);
            }
        });

        passbookbtn.setText("Book");
        passbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passbookbtnActionPerformed(evt);
            }
        });

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("search result:");

        searchbtn.setText("search by time");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passViewPannelLayout = new javax.swing.GroupLayout(passViewPannel);
        passViewPannel.setLayout(passViewPannelLayout);
        passViewPannelLayout.setHorizontalGroup(
            passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passViewPannelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passViewPannelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(passViewPannelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(resultField))
                            .addGroup(passViewPannelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(passViewPannelLayout.createSequentialGroup()
                        .addComponent(passviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(passbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(flightsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        passViewPannelLayout.setVerticalGroup(
            passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passViewPannelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(passViewPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passViewPannelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        getContentPane().add(passViewPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 630));

        setSize(new java.awt.Dimension(1305, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passbookbtnActionPerformed
        waySelect way = new waySelect();
        this.setVisible(false);
        way.setVisible(true);
    }//GEN-LAST:event_passbookbtnActionPerformed

    private void passviewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passviewbtnActionPerformed
         String sql="SELECT * FROM flight_info";
    try{      
         p=con.prepareStatement(sql); 
         r= p.executeQuery();
         DefaultTableModel model=(DefaultTableModel)statusTable.getModel();
         model.setRowCount(0);
          
          while(r.next()){
          model.addRow(new String[]{ r.getString(1),r.getString(2),r.getString(3),r.getString(4)});
          }
        }
        catch(Exception e){System.out.println(e);
        }
    }//GEN-LAST:event_passviewbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void flightsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightsearchKeyReleased

    }//GEN-LAST:event_flightsearchKeyReleased

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try {
            p = con.prepareStatement("select flight_name from flight_info where seat=?");
            int seat = Integer.parseInt(flightsearch.getText());
            p.setInt(1, seat);
            r = p.executeQuery();
            if(r.next()==false){
                JOptionPane.showMessageDialog(this,"Flight not found");
            }
            else{
                resultField.setText(r.getString("flight_name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(passengerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(passengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passengerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passengerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField flightsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel passViewPannel;
    private javax.swing.JButton passbookbtn;
    private javax.swing.JButton passviewbtn;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable statusTable;
    // End of variables declaration//GEN-END:variables
}
