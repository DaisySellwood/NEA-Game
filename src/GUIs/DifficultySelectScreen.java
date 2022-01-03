package GUIs;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

public class DifficultySelectScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();
    
    public static ArrayList<String> LastMovesStack = new ArrayList<>();
    public static int DoorCode;
    public static boolean BattleCheck;
    
    public DifficultySelectScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        EasyButton = new javax.swing.JButton();
        HardButton = new javax.swing.JButton();
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
        BackButton.setBounds(40, 60, 200, 70);

        EasyButton.setBorderPainted(false);
        EasyButton.setContentAreaFilled(false);
        EasyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EasyButton);
        EasyButton.setBounds(579, 355, 760, 190);

        HardButton.setBorderPainted(false);
        HardButton.setContentAreaFilled(false);
        HardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HardButton);
        HardButton.setBounds(579, 645, 760, 180);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Difficulty Select Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(2, 1, 1930, 1100);

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

    private void EasyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyButtonActionPerformed
        DoorCode = rand.nextInt((9999-1000)+1)+1000;
        BattleCheck = false;
        
        GUIs.EntranceRoom entrance = new GUIs.EntranceRoom();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        entrance.setSize(WidthSize, HeightSize);
        entrance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EasyButtonActionPerformed

    private void HardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardButtonActionPerformed
        //SET A MODIFIER
        DoorCode = rand.nextInt((9999-1000)+1)+1000;
        BattleCheck = false;
        
        GUIs.EntranceRoom entrance = new GUIs.EntranceRoom();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        entrance.setSize(WidthSize, HeightSize);
        entrance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HardButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DifficultySelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DifficultySelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DifficultySelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DifficultySelectScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DifficultySelectScreen().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton EasyButton;
    private javax.swing.JButton HardButton;
    // End of variables declaration//GEN-END:variables
}
