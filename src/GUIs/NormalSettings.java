
package GUIs;

import java.awt.Toolkit;

public class NormalSettings extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();

    public NormalSettings() {
        initComponents();
        
        TutorialConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        AccountDetailsButton = new javax.swing.JButton();
        CharacterDetailsButton = new javax.swing.JButton();
        TutorialButton = new javax.swing.JButton();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        TutorialConfirmationBox = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(39, 45, 200, 70);

        AccountDetailsButton.setBorderPainted(false);
        AccountDetailsButton.setContentAreaFilled(false);
        AccountDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AccountDetailsButton);
        AccountDetailsButton.setBounds(409, 315, 1100, 180);

        CharacterDetailsButton.setBorderPainted(false);
        CharacterDetailsButton.setContentAreaFilled(false);
        CharacterDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharacterDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CharacterDetailsButton);
        CharacterDetailsButton.setBounds(409, 555, 1100, 170);

        TutorialButton.setBorderPainted(false);
        TutorialButton.setContentAreaFilled(false);
        TutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TutorialButton);
        TutorialButton.setBounds(410, 790, 1110, 180);

        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(780, 730, 60, 40);

        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(1100, 730, 40, 40);

        TutorialConfirmationBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Settings Tutorial Confirmation.jpg"))); // NOI18N
        getContentPane().add(TutorialConfirmationBox);
        TutorialConfirmationBox.setBounds(720, 470, 510, 350);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Normal Settings Page.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        GUIs.ModeSelectionMenu ModeMenu = new GUIs.ModeSelectionMenu();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ModeMenu.setSize(WidthSize, HeightSize);
        ModeMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AccountDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountDetailsButtonActionPerformed
        GUIs.AccountSettings AccountSet = new GUIs.AccountSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        AccountSet.setSize(WidthSize, HeightSize);
        AccountSet.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AccountDetailsButtonActionPerformed

    private void CharacterDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharacterDetailsButtonActionPerformed
        GUIs.CharacterSettings CharaSet = new GUIs.CharacterSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        CharaSet.setSize(WidthSize, HeightSize);
        CharaSet.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CharacterDetailsButtonActionPerformed

    private void TutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialButtonActionPerformed
        
        AccountDetailsButton.setVisible(false);
        CharacterDetailsButton.setVisible(false);
        TutorialButton.setVisible(false);
        
        TutorialConfirmationBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);
        
        
    }//GEN-LAST:event_TutorialButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        
        TutorialConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);
        
        AccountDetailsButton.setVisible(true);
        CharacterDetailsButton.setVisible(true);
        TutorialButton.setVisible(true);
        
    }//GEN-LAST:event_NoButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        GUIs.TutorialSeven.ExitLocation = "Settings";
        
        GUIs.TutorialOne TutOne = new GUIs.TutorialOne();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        TutOne.setSize(WidthSize, HeightSize);
        TutOne.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_YesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NormalSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NormalSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NormalSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NormalSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NormalSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountDetailsButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton CharacterDetailsButton;
    private javax.swing.JButton NoButton;
    private javax.swing.JButton TutorialButton;
    private javax.swing.JLabel TutorialConfirmationBox;
    private javax.swing.JButton YesButton;
    // End of variables declaration//GEN-END:variables
}
