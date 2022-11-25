package GUIs;

import java.awt.Toolkit;
import java.util.Random;

public class Staircase extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();

    public Staircase() {
        initComponents();

        BlockedStairsMessage.setVisible(false);
        OkButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpwardsButton = new javax.swing.JButton();
        DownwardsButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        BlockedStairsMessage = new javax.swing.JLabel();
        SettingsButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UpwardsButton.setBorderPainted(false);
        UpwardsButton.setContentAreaFilled(false);
        UpwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpwardsButton);
        UpwardsButton.setBounds(529, 375, 200, 170);

        DownwardsButton.setBorderPainted(false);
        DownwardsButton.setContentAreaFilled(false);
        DownwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DownwardsButton);
        DownwardsButton.setBounds(1409, 870, 140, 220);

        OkButton.setBorderPainted(false);
        OkButton.setContentAreaFilled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton);
        OkButton.setBounds(949, 535, 40, 40);

        BlockedStairsMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Blocked Stairs Message.jpg"))); // NOI18N
        getContentPane().add(BlockedStairsMessage);
        BlockedStairsMessage.setBounds(720, 300, 510, 310);

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Settings Icon.png"))); // NOI18N
        SettingsButton.setBorderPainted(false);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton);
        SettingsButton.setBounds(10, 20, 210, 210);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Blocked Stairs.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpwardsButtonActionPerformed
        BlockedStairsMessage.setVisible(true);
        OkButton.setVisible(true);
        UpwardsButton.setVisible(false);
        DownwardsButton.setVisible(false);
    }//GEN-LAST:event_UpwardsButtonActionPerformed

    private void DownwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownwardsButtonActionPerformed
        if (GUIs.DifficultySelectScreen.BattleCheck == false) {
            int Decider = rand.nextInt(2);
            if (Decider == 1) {
                GUIs.DifficultySelectScreen.LastMovesStack.add("Main Hall");

                GUIs.StoryModeBattleScreen.FightType = "Normal";
                GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                StoryBattle.setSize(WidthSize, HeightSize);
                StoryBattle.setVisible(true);
                this.dispose();
            } else {
                GUIs.MainHall mainHall = new GUIs.MainHall();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                mainHall.setSize(WidthSize, HeightSize);
                mainHall.setVisible(true);
                this.dispose();
            }
        } else {
            GUIs.DifficultySelectScreen.BattleCheck = false;
            GUIs.MainHall mainHall = new GUIs.MainHall();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            mainHall.setSize(WidthSize, HeightSize);
            mainHall.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_DownwardsButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        BlockedStairsMessage.setVisible(false);
        OkButton.setVisible(false);
        UpwardsButton.setVisible(true);
        DownwardsButton.setVisible(true);
    }//GEN-LAST:event_OkButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        GUIs.DifficultySelectScreen.LastMovesStack.add("Staircase");

        GUIs.NormalSettings.Type = "Story";
        GUIs.NormalSettings normSets = new GUIs.NormalSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        normSets.setSize(WidthSize, HeightSize);
        normSets.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SettingsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Staircase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staircase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staircase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staircase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staircase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BlockedStairsMessage;
    private javax.swing.JButton DownwardsButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton UpwardsButton;
    // End of variables declaration//GEN-END:variables
}
