package GUIs;

import java.awt.Toolkit;
import java.util.Random;

public class MainHall extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();

    public MainHall() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntranceButton = new javax.swing.JButton();
        StairsButton = new javax.swing.JButton();
        LaundryButton = new javax.swing.JButton();
        BackRoomButton = new javax.swing.JButton();
        LibraryButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        EntranceButton.setBorderPainted(false);
        EntranceButton.setContentAreaFilled(false);
        EntranceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntranceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EntranceButton);
        EntranceButton.setBounds(619, 920, 130, 160);

        StairsButton.setBorderPainted(false);
        StairsButton.setContentAreaFilled(false);
        StairsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StairsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StairsButton);
        StairsButton.setBounds(449, 785, 160, 130);

        LaundryButton.setBorderPainted(false);
        LaundryButton.setContentAreaFilled(false);
        LaundryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaundryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LaundryButton);
        LaundryButton.setBounds(619, 545, 170, 120);

        BackRoomButton.setBorderPainted(false);
        BackRoomButton.setContentAreaFilled(false);
        BackRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackRoomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackRoomButton);
        BackRoomButton.setBounds(859, 455, 120, 170);

        LibraryButton.setBorderPainted(false);
        LibraryButton.setContentAreaFilled(false);
        LibraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibraryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LibraryButton);
        LibraryButton.setBounds(959, 595, 170, 110);

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Settings Icon.png"))); // NOI18N
        SettingsButton.setBorderPainted(false);
        SettingsButton.setContentAreaFilled(false);
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton);
        SettingsButton.setBounds(10, 20, 210, 200);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Main Hall.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntranceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntranceButtonActionPerformed
        GUIs.EntranceRoom entrance = new GUIs.EntranceRoom();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        entrance.setSize(WidthSize, HeightSize);
        entrance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EntranceButtonActionPerformed

    private void StairsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StairsButtonActionPerformed
        if (GUIs.DifficultySelectScreen.BattleCheck == false) {
            int Decider = rand.nextInt(2);
            if (Decider == 1) {
                GUIs.DifficultySelectScreen.LastMovesStack.add("Staircase");

                GUIs.StoryModeBattleScreen.FightType = "Normal";
                GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                StoryBattle.setSize(WidthSize, HeightSize);
                StoryBattle.setVisible(true);
                this.dispose();
            } else {
                GUIs.Staircase stairs = new GUIs.Staircase();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                stairs.setSize(WidthSize, HeightSize);
                stairs.setVisible(true);
                this.dispose();
            }
        } else {
            GUIs.DifficultySelectScreen.BattleCheck = false;
            GUIs.Staircase stairs = new GUIs.Staircase();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            stairs.setSize(WidthSize, HeightSize);
            stairs.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_StairsButtonActionPerformed

    private void LaundryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaundryButtonActionPerformed
        if (GUIs.DifficultySelectScreen.BattleCheck == false) {
            int Decider = rand.nextInt(2);
            if (Decider == 1) {
                GUIs.DifficultySelectScreen.LastMovesStack.add("Laundry Room");

                GUIs.StoryModeBattleScreen.FightType = "Normal";
                GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                StoryBattle.setSize(WidthSize, HeightSize);
                StoryBattle.setVisible(true);
                this.dispose();
            } else {
                GUIs.LaundryRoom laundry = new GUIs.LaundryRoom();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                laundry.setSize(WidthSize, HeightSize);
                laundry.setVisible(true);
                this.dispose();
            }
        } else {
            GUIs.DifficultySelectScreen.BattleCheck = false;
            GUIs.LaundryRoom laundry = new GUIs.LaundryRoom();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            laundry.setSize(WidthSize, HeightSize);
            laundry.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LaundryButtonActionPerformed

    private void BackRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackRoomButtonActionPerformed
        if (GUIs.DifficultySelectScreen.BattleCheck == false) {
            int Decider = rand.nextInt(2);
            if (Decider == 1) {
                GUIs.DifficultySelectScreen.LastMovesStack.add("Back Room");

                GUIs.StoryModeBattleScreen.FightType = "Normal";
                GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                StoryBattle.setSize(WidthSize, HeightSize);
                StoryBattle.setVisible(true);
                this.dispose();
            } else {
                GUIs.BackRoom backRoom = new GUIs.BackRoom();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                backRoom.setSize(WidthSize, HeightSize);
                backRoom.setVisible(true);
                this.dispose();
            }
        } else {
            GUIs.DifficultySelectScreen.BattleCheck = false;
            GUIs.BackRoom backRoom = new GUIs.BackRoom();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            backRoom.setSize(WidthSize, HeightSize);
            backRoom.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BackRoomButtonActionPerformed

    private void LibraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibraryButtonActionPerformed
        if (GUIs.DifficultySelectScreen.BattleCheck == false) {
            int Decider = rand.nextInt(2);
            if (Decider == 1) {
                GUIs.DifficultySelectScreen.LastMovesStack.add("Library Room");

                GUIs.StoryModeBattleScreen.FightType = "Normal";
                GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                StoryBattle.setSize(WidthSize, HeightSize);
                StoryBattle.setVisible(true);
                this.dispose();
            } else {
                GUIs.LibraryRoom library = new GUIs.LibraryRoom();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                library.setSize(WidthSize, HeightSize);
                library.setVisible(true);
                this.dispose();
            }
        } else {
            GUIs.DifficultySelectScreen.BattleCheck = false;
            GUIs.LibraryRoom library = new GUIs.LibraryRoom();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            library.setSize(WidthSize, HeightSize);
            library.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LibraryButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        GUIs.DifficultySelectScreen.LastMovesStack.add("Main Hall");

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
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHall().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackRoomButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton EntranceButton;
    private javax.swing.JButton LaundryButton;
    private javax.swing.JButton LibraryButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton StairsButton;
    // End of variables declaration//GEN-END:variables
}
