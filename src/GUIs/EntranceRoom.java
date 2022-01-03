
package GUIs;

import java.awt.Toolkit;

public class EntranceRoom extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();

    public EntranceRoom() {
        initComponents();
        
        FrontDoorLockedMessage.setVisible(false);
        OkButton.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ForwardButton = new javax.swing.JButton();
        DownwardsButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        FrontDoorLockedMessage = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ForwardButton.setBorderPainted(false);
        ForwardButton.setContentAreaFilled(false);
        ForwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ForwardButton);
        ForwardButton.setBounds(890, 830, 150, 220);

        DownwardsButton.setBorderPainted(false);
        DownwardsButton.setContentAreaFilled(false);
        DownwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DownwardsButton);
        DownwardsButton.setBounds(69, 835, 150, 230);

        OkButton.setBorderPainted(false);
        OkButton.setContentAreaFilled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton);
        OkButton.setBounds(939, 605, 40, 40);

        FrontDoorLockedMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Front Door Locked Message.jpg"))); // NOI18N
        getContentPane().add(FrontDoorLockedMessage);
        FrontDoorLockedMessage.setBounds(710, 370, 510, 310);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Entrance Room.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DownwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownwardsButtonActionPerformed
        FrontDoorLockedMessage.setVisible(true);
        OkButton.setVisible(true);
        DownwardsButton.setVisible(false);
        ForwardButton.setVisible(false);
    }//GEN-LAST:event_DownwardsButtonActionPerformed

    private void ForwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForwardButtonActionPerformed
        GUIs.MainHall mainHall = new GUIs.MainHall();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        mainHall.setSize(WidthSize, HeightSize);
        mainHall.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ForwardButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        FrontDoorLockedMessage.setVisible(false);
        OkButton.setVisible(false);
        DownwardsButton.setVisible(true);
        ForwardButton.setVisible(true);
    }//GEN-LAST:event_OkButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(EntranceRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntranceRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntranceRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntranceRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntranceRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton DownwardsButton;
    private javax.swing.JButton ForwardButton;
    private javax.swing.JLabel FrontDoorLockedMessage;
    private javax.swing.JButton OkButton;
    // End of variables declaration//GEN-END:variables
}
