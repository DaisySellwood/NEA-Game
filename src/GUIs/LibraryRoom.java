
package GUIs;

import java.awt.Toolkit;
import java.util.Random;

public class LibraryRoom extends javax.swing.JFrame {
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();
    
    public LibraryRoom() {
        initComponents();
        
        DoorCodeLabel.setText(Integer.toString(GUIs.DifficultySelectScreen.DoorCode));
        
        int Decider = rand.nextInt(1);
        if (Decider == 1){
        GUIs.DifficultySelectScreen.LastMovesStack.add("Main Hall");
            
        GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        StoryBattle.setSize(WidthSize, HeightSize);
        StoryBattle.setVisible(true);
        this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoorCodeLabel = new javax.swing.JLabel();
        DownwardsButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        DoorCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DoorCodeLabel.setText("0000");
        getContentPane().add(DoorCodeLabel);
        DoorCodeLabel.setBounds(241, 266, 240, 190);

        DownwardsButton.setBorderPainted(false);
        DownwardsButton.setContentAreaFilled(false);
        DownwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DownwardsButton);
        DownwardsButton.setBounds(909, 845, 150, 220);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Library.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DownwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownwardsButtonActionPerformed
        GUIs.MainHall mainHall = new GUIs.MainHall();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        mainHall.setSize(WidthSize, HeightSize);
        mainHall.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DownwardsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel DoorCodeLabel;
    private javax.swing.JButton DownwardsButton;
    // End of variables declaration//GEN-END:variables
}
