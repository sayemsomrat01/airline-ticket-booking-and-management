
package javaapplication56;
public class welcome extends javax.swing.JFrame {

    
    public welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        components = new javax.swing.JLabel();
        loadPercent = new javax.swing.JLabel();
        head1 = new javax.swing.JLabel();
        head2 = new javax.swing.JLabel();
        head3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        welcomeBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        components.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(components, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 280, 30));

        loadPercent.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(loadPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, 70, 30));

        head1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        head1.setForeground(new java.awt.Color(255, 255, 255));
        head1.setText("Project ");
        getContentPane().add(head1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 70));

        head2.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        head2.setForeground(new java.awt.Color(255, 255, 255));
        head2.setText("ASTRA");
        getContentPane().add(head2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 170, 70));

        head3.setFont(new java.awt.Font("Vladimir Script", 1, 36)); // NOI18N
        head3.setForeground(new java.awt.Color(255, 255, 255));
        head3.setText("Airline");
        getContentPane().add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 110, 30));

        logo.setIcon(new javax.swing.ImageIcon("D:\\ProjectImage\\take-off.png")); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 300, 320));

        progressbar.setBackground(new java.awt.Color(0, 0, 0));
        progressbar.setForeground(new java.awt.Color(0, 153, 102));
        progressbar.setBorder(null);
        getContentPane().add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1110, 10));

        welcomeBG.setIcon(new javax.swing.ImageIcon("D:\\ProjectImage\\welcomeScreen.jpg")); // NOI18N
        getContentPane().add(welcomeBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 570));

        setSize(new java.awt.Dimension(1125, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        welcome splash = new welcome();
         splash.setVisible(true);
         
         try
         {
             for(int i=0; i<=100;i++)
             {
                 Thread.sleep(100);
                 splash.loadPercent.setText(i+"%"); 
                 
                 if(i == 0)
                 {
                     splash.components.setText("Loading....");
                 }
                 if(i == 10)
                 {
                     splash.components.setText("Turning On Modules....");
                 }
                 if(i == 30)
                 {
                     splash.components.setText("Loading Modules....");
                 }
                 if(i == 50)
                 {
                     splash.components.setText("Connecting To Database....");
                 }
                 if(i == 70)
                 {
                     splash.components.setText("Connection Successful....");
                 }
                 if(i == 85)
                 {
                     splash.components.setText("Launching Application....");
                 }
                 
                 splash.progressbar.setValue(i);

             }
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());   
         }
         new loginnn().setVisible(true);
         splash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel components;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel head3;
    private javax.swing.JLabel loadPercent;
    private javax.swing.JLabel logo;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel welcomeBG;
    // End of variables declaration//GEN-END:variables
}
