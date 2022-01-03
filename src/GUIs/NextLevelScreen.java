
package GUIs;

import java.awt.Toolkit;

public class NextLevelScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    
    public NextLevelScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrentScoreLabel = new javax.swing.JLabel();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CurrentScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 56)); // NOI18N
        CurrentScoreLabel.setText("0");
        getContentPane().add(CurrentScoreLabel);
        CurrentScoreLabel.setBounds(1030, 320, 80, 60);

        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(350, 740, 430, 200);

        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(1119, 735, 430, 200);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Next Level Screen.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        
        //IF CURRENT SCORE IS GREATER THAN CURRENT HIGH SCORE, CHANGE IT
        
        GUIs.LevelModeSelectionScreen LevelModeSelection = new GUIs.LevelModeSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        LevelModeSelection.setSize(WidthSize, HeightSize);
        LevelModeSelection.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NextLevelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NextLevelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NextLevelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NextLevelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NextLevelScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentScoreLabel;
    private javax.swing.JButton NoButton;
    private javax.swing.JButton YesButton;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
