/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Other.SQLStatements;
import Other.Utilities;
import java.awt.Toolkit;

/**
 *
 * @author daisy
 */
public class GenderSelectionScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    public static String gender;

    public GenderSelectionScreen() {
        initComponents();

        CharacterConfirmBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);
        CharacterCreatedConfirmBox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        MaleButton = new javax.swing.JButton();
        FemaleButton = new javax.swing.JButton();
        OtherButton = new javax.swing.JButton();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        CharacterConfirmBox = new javax.swing.JLabel();
        CharacterCreatedConfirmBox = new javax.swing.JLabel();
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
        BackButton.setBounds(20, 40, 230, 100);

        MaleButton.setBorderPainted(false);
        MaleButton.setContentAreaFilled(false);
        MaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MaleButton);
        MaleButton.setBounds(220, 910, 330, 150);

        FemaleButton.setBorderPainted(false);
        FemaleButton.setContentAreaFilled(false);
        FemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FemaleButton);
        FemaleButton.setBounds(809, 905, 330, 150);

        OtherButton.setBorderPainted(false);
        OtherButton.setContentAreaFilled(false);
        OtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OtherButton);
        OtherButton.setBounds(1379, 905, 320, 150);

        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(790, 670, 50, 40);

        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(1130, 670, 40, 40);

        CharacterConfirmBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Character Confirm Box.jpg"))); // NOI18N
        getContentPane().add(CharacterConfirmBox);
        CharacterConfirmBox.setBounds(730, 430, 510, 310);

        CharacterCreatedConfirmBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Character Created Confirm Box.jpg"))); // NOI18N
        getContentPane().add(CharacterCreatedConfirmBox);
        CharacterCreatedConfirmBox.setBounds(730, 430, 510, 310);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Character Gender Selection Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        GUIs.ClassSelectionScreen ClassSelec = new GUIs.ClassSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        ClassSelec.setSize(WidthSize, HeightSize);
        ClassSelec.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BackButtonActionPerformed

    private void MaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleButtonActionPerformed

        gender = "male";

        CharacterConfirmBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);

        MaleButton.setVisible(false);
        FemaleButton.setVisible(false);
        OtherButton.setVisible(false);

    }//GEN-LAST:event_MaleButtonActionPerformed

    private void FemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleButtonActionPerformed

        gender = "female";

        CharacterConfirmBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);

        MaleButton.setVisible(false);
        FemaleButton.setVisible(false);
        OtherButton.setVisible(false);

    }//GEN-LAST:event_FemaleButtonActionPerformed

    private void OtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherButtonActionPerformed

        gender = "other";

        CharacterConfirmBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);

        MaleButton.setVisible(false);
        FemaleButton.setVisible(false);
        OtherButton.setVisible(false);

    }//GEN-LAST:event_OtherButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed

        CharacterConfirmBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        MaleButton.setVisible(true);
        FemaleButton.setVisible(true);
        OtherButton.setVisible(true);


    }//GEN-LAST:event_NoButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed

        String Date = Utilities.GetCurrentDate();

        Objects.Character newCharacter = new Objects.Character(0, Other.NEAGame.CurrentUser.get(0).getUsername(), NicknameChoosingScreen.Nickname, gender, ClassSelectionScreen.CharacterClass, 0, Date, 0);
        Other.Utilities.UpdateCurrentCharacter(newCharacter);
        Other.SQLStatements.AddNewCharacter(newCharacter);

        CharacterConfirmBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        CharacterCreatedConfirmBox.setVisible(true);

        GUIs.TutorialAskScreen TutorialAsk = new GUIs.TutorialAskScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        TutorialAsk.setSize(WidthSize, HeightSize);
        TutorialAsk.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_YesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GenderSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenderSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenderSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenderSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenderSelectionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CharacterConfirmBox;
    private javax.swing.JLabel CharacterCreatedConfirmBox;
    private javax.swing.JButton FemaleButton;
    private javax.swing.JButton MaleButton;
    private javax.swing.JButton NoButton;
    private javax.swing.JButton OtherButton;
    private javax.swing.JButton YesButton;
    // End of variables declaration//GEN-END:variables
}
