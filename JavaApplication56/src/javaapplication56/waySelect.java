
package javaapplication56;

import java.awt.Color;

public class waySelect extends javax.swing.JFrame {

   
    public waySelect() {
        initComponents();
        tpPanel.setBackground(new Color(0,0,0,80));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        oneWay = new javax.swing.JButton();
        multiWay = new javax.swing.JButton();
        roundedWay = new javax.swing.JButton();
        tpPanel = new javax.swing.JPanel();
        wayselectbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Select your flight way");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 240, 30));

        oneWay.setForeground(new java.awt.Color(0, 0, 0));
        oneWay.setText("ONE WAY");
        oneWay.setBorder(null);
        oneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayActionPerformed(evt);
            }
        });
        getContentPane().add(oneWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 180, 50));

        multiWay.setForeground(new java.awt.Color(0, 0, 0));
        multiWay.setText("MULTI WAY");
        multiWay.setBorder(null);
        multiWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiWayActionPerformed(evt);
            }
        });
        getContentPane().add(multiWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, 50));

        roundedWay.setForeground(new java.awt.Color(0, 0, 0));
        roundedWay.setText("ROUNDED WAY");
        roundedWay.setBorder(null);
        roundedWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedWayActionPerformed(evt);
            }
        });
        getContentPane().add(roundedWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 180, 50));
        getContentPane().add(tpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 310, 220));
        getContentPane().add(wayselectbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 320));

        setSize(new java.awt.Dimension(762, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayActionPerformed
        ticketPrint one = new ticketPrint();
        this.setVisible(false);
        one.setVisible(true);
    }//GEN-LAST:event_oneWayActionPerformed

    private void multiWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiWayActionPerformed
        ticketPrintMulti multi = new ticketPrintMulti();
        this.setVisible(false);
        multi.setVisible(true);
    }//GEN-LAST:event_multiWayActionPerformed

    private void roundedWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedWayActionPerformed
        ticketPrintRounded round = new ticketPrintRounded();
        this.setVisible(false);
        round.setVisible(true);
    }//GEN-LAST:event_roundedWayActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waySelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiWay;
    private javax.swing.JButton oneWay;
    private javax.swing.JButton roundedWay;
    private javax.swing.JPanel tpPanel;
    private javax.swing.JLabel wayselectbg;
    // End of variables declaration//GEN-END:variables
}
