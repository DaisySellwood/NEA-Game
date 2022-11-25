package GUIs;

import java.awt.Toolkit;

public class NormalSettings extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    
    public static String Type;
    private static String Check;

    public NormalSettings() {
        initComponents();
        
        TutorialConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);
        HintMessage.setVisible(false);
        OkButton.setVisible(false);
        QuitConfirmationBox.setVisible(false);
        QuitYesButton.setVisible(false);
        QuitNoButton.setVisible(false);
        
        if (Type.equals("Story")){
            SMBackground.setVisible(true);
            SMBackButton.setVisible(true);
            HintButton.setVisible(true);
            SMTutorialButton.setVisible(true);
            ExitStoryModeButton.setVisible(true);
            
            Background.setVisible(false);
            AccountDetailsButton.setVisible(false);
            CharacterDetailsButton.setVisible(false);
            TutorialButton.setVisible(false);
            BackButton.setVisible(false);
        }else if (Type.equals("Normal")){
            SMBackground.setVisible(false);
            SMBackButton.setVisible(false);
            HintButton.setVisible(false);
            SMTutorialButton.setVisible(false);
            ExitStoryModeButton.setVisible(false);
            
            Background.setVisible(true);
            AccountDetailsButton.setVisible(true);
            CharacterDetailsButton.setVisible(true);
            TutorialButton.setVisible(true);
            BackButton.setVisible(true);
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuitNoButton = new javax.swing.JButton();
        QuitYesButton = new javax.swing.JButton();
        QuitConfirmationBox = new javax.swing.JLabel();
        TutorialConfirmationBox = new javax.swing.JLabel();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();
        HintMessage = new javax.swing.JLabel();
        SMTutorialButton = new javax.swing.JButton();
        ExitStoryModeButton = new javax.swing.JButton();
        HintButton = new javax.swing.JButton();
        SMBackButton = new javax.swing.JButton();
        SMBackground = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        AccountDetailsButton = new javax.swing.JButton();
        CharacterDetailsButton = new javax.swing.JButton();
        TutorialButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        QuitNoButton.setBorderPainted(false);
        QuitNoButton.setContentAreaFilled(false);
        QuitNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitNoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QuitNoButton);
        QuitNoButton.setBounds(1089, 685, 40, 40);

        QuitYesButton.setBorderPainted(false);
        QuitYesButton.setContentAreaFilled(false);
        QuitYesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitYesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QuitYesButton);
        QuitYesButton.setBounds(769, 685, 60, 40);

        QuitConfirmationBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Battle Quit Confirmation.jpg"))); // NOI18N
        getContentPane().add(QuitConfirmationBox);
        QuitConfirmationBox.setBounds(710, 440, 510, 320);

        TutorialConfirmationBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Settings Tutorial Confirmation.jpg"))); // NOI18N
        getContentPane().add(TutorialConfirmationBox);
        TutorialConfirmationBox.setBounds(720, 470, 510, 350);

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

        OkButton.setBorderPainted(false);
        OkButton.setContentAreaFilled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton);
        OkButton.setBounds(940, 660, 40, 40);

        HintMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Hint Message.jpg"))); // NOI18N
        getContentPane().add(HintMessage);
        HintMessage.setBounds(710, 420, 510, 320);

        SMTutorialButton.setBorderPainted(false);
        SMTutorialButton.setContentAreaFilled(false);
        SMTutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMTutorialButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SMTutorialButton);
        SMTutorialButton.setBounds(409, 565, 1110, 180);

        ExitStoryModeButton.setBorderPainted(false);
        ExitStoryModeButton.setContentAreaFilled(false);
        ExitStoryModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitStoryModeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitStoryModeButton);
        ExitStoryModeButton.setBounds(409, 785, 1110, 190);

        HintButton.setBorderPainted(false);
        HintButton.setContentAreaFilled(false);
        HintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HintButton);
        HintButton.setBounds(409, 335, 1110, 180);

        SMBackButton.setBorderPainted(false);
        SMBackButton.setContentAreaFilled(false);
        SMBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SMBackButton);
        SMBackButton.setBounds(49, 45, 200, 70);

        SMBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Story Mode Settings.jpg"))); // NOI18N
        getContentPane().add(SMBackground);
        SMBackground.setBounds(0, 0, 1920, 1090);

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
        Check = "Normal";
        AccountDetailsButton.setVisible(false);
        CharacterDetailsButton.setVisible(false);
        TutorialButton.setVisible(false);
        BackButton.setVisible(false);
        
        TutorialConfirmationBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);
    }//GEN-LAST:event_TutorialButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        TutorialConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);
        
        if(Check.equals("Normal")){
            AccountDetailsButton.setVisible(true);
            CharacterDetailsButton.setVisible(true);
            TutorialButton.setVisible(true);
            BackButton.setVisible(true);
        }else if(Check.equals("Story")){
            SMBackButton.setVisible(true);
            SMTutorialButton.setVisible(true);
            HintButton.setVisible(true);
            ExitStoryModeButton.setVisible(true);
        }
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

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        OkButton.setVisible(false);
        HintMessage.setVisible(false);
    }//GEN-LAST:event_OkButtonActionPerformed

    private void HintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintButtonActionPerformed
        OkButton.setVisible(true);
        HintMessage.setVisible(true);
    }//GEN-LAST:event_HintButtonActionPerformed

    private void SMBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMBackButtonActionPerformed
        String Room = GUIs.DifficultySelectScreen.LastMovesStack.get(GUIs.DifficultySelectScreen.LastMovesStack.size()-1);
        GUIs.DifficultySelectScreen.LastMovesStack.remove(GUIs.DifficultySelectScreen.LastMovesStack.size()-1);
        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();
        
        switch(Room){
            case "Entrance Room":
                GUIs.EntranceRoom entrance = new GUIs.EntranceRoom();
                entrance.setSize(WidthSize, HeightSize);
                entrance.setVisible(true);
                this.dispose();
                break;
            case "Main Hall":
                GUIs.MainHall mainHall = new GUIs.MainHall();
                mainHall.setSize(WidthSize, HeightSize);
                mainHall.setVisible(true);
                this.dispose();
                break;
            case "Staircase":
                GUIs.Staircase stairs = new GUIs.Staircase();
                stairs.setSize(WidthSize, HeightSize);
                stairs.setVisible(true);
                this.dispose();
                break;
            case "Laundry Room":
                GUIs.LaundryRoom laundry = new GUIs.LaundryRoom();
                laundry.setSize(WidthSize, HeightSize);
                laundry.setVisible(true);
                this.dispose();
                break;
            case "Library Room":
                GUIs.LibraryRoom library = new GUIs.LibraryRoom();
                library.setSize(WidthSize, HeightSize);
                library.setVisible(true);
                this.dispose();
                break;
            case "Back Room":
                GUIs.BackRoom backRoom = new GUIs.BackRoom();
                backRoom.setSize(WidthSize, HeightSize);
                backRoom.setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_SMBackButtonActionPerformed

    private void SMTutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMTutorialButtonActionPerformed
        Check = "Story";
        TutorialConfirmationBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);
        
        SMBackButton.setVisible(false);
        SMTutorialButton.setVisible(false);
        HintButton.setVisible(false);
        ExitStoryModeButton.setVisible(false);
    }//GEN-LAST:event_SMTutorialButtonActionPerformed

    private void ExitStoryModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitStoryModeButtonActionPerformed
        QuitConfirmationBox.setVisible(true);
        QuitYesButton.setVisible(true);
        QuitNoButton.setVisible(true);
        
        SMBackButton.setVisible(false);
        SMTutorialButton.setVisible(false);
        HintButton.setVisible(false);
        ExitStoryModeButton.setVisible(false);
    }//GEN-LAST:event_ExitStoryModeButtonActionPerformed

    private void QuitNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitNoButtonActionPerformed
        QuitConfirmationBox.setVisible(false);
        QuitYesButton.setVisible(false);
        QuitNoButton.setVisible(false);
        
        SMBackButton.setVisible(true);
        SMTutorialButton.setVisible(true);
        HintButton.setVisible(true);
        ExitStoryModeButton.setVisible(true);
    }//GEN-LAST:event_QuitNoButtonActionPerformed

    private void QuitYesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitYesButtonActionPerformed
        GUIs.DifficultySelectScreen DiffSelec = new GUIs.DifficultySelectScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        DiffSelec.setSize(WidthSize, HeightSize);
        DiffSelec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QuitYesButtonActionPerformed

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
    private javax.swing.JButton ExitStoryModeButton;
    private javax.swing.JButton HintButton;
    private javax.swing.JLabel HintMessage;
    private javax.swing.JButton NoButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel QuitConfirmationBox;
    private javax.swing.JButton QuitNoButton;
    private javax.swing.JButton QuitYesButton;
    private javax.swing.JButton SMBackButton;
    private javax.swing.JLabel SMBackground;
    private javax.swing.JButton SMTutorialButton;
    private javax.swing.JButton TutorialButton;
    private javax.swing.JLabel TutorialConfirmationBox;
    private javax.swing.JButton YesButton;
    // End of variables declaration//GEN-END:variables
}
