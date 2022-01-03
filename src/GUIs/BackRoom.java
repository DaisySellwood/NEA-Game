
package GUIs;

import java.awt.Toolkit;
import java.util.Random;

public class BackRoom extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();

    public BackRoom() {
        initComponents();
        
        WrongDoorCodeMessage.setVisible(false);
        OkButton.setVisible(false);
        
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

        OkButton = new javax.swing.JButton();
        WrongDoorCodeMessage = new javax.swing.JLabel();
        DoorCodeField = new javax.swing.JTextField();
        DownwardsButton = new javax.swing.JButton();
        UpwardsButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        OkButton.setBorderPainted(false);
        OkButton.setContentAreaFilled(false);
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OkButton);
        OkButton.setBounds(920, 610, 40, 40);

        WrongDoorCodeMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Wrong Door Code Message.jpg"))); // NOI18N
        getContentPane().add(WrongDoorCodeMessage);
        WrongDoorCodeMessage.setBounds(690, 370, 510, 310);

        DoorCodeField.setText("Enter Door Code");
        getContentPane().add(DoorCodeField);
        DoorCodeField.setBounds(829, 570, 200, 50);

        DownwardsButton.setBorderPainted(false);
        DownwardsButton.setContentAreaFilled(false);
        DownwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DownwardsButton);
        DownwardsButton.setBounds(69, 855, 160, 230);

        UpwardsButton.setBorderPainted(false);
        UpwardsButton.setContentAreaFilled(false);
        UpwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpwardsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpwardsButton);
        UpwardsButton.setBounds(889, 855, 150, 220);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Back Room.jpg"))); // NOI18N
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

    private void UpwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpwardsButtonActionPerformed
        String EnteredCode = DoorCodeField.getText();
        
        if (EnteredCode.equals(Integer.toString(GUIs.DifficultySelectScreen.DoorCode))){
            //Set a variable to be a boss variable
            GUIs.StoryModeBattleScreen StoryBattle = new GUIs.StoryModeBattleScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            StoryBattle.setSize(WidthSize, HeightSize);
            StoryBattle.setVisible(true);
            this.dispose();
        }else{
            WrongDoorCodeMessage.setVisible(true);
            OkButton.setVisible(true);
            DownwardsButton.setVisible(false);
            UpwardsButton.setVisible(false);
        }
    }//GEN-LAST:event_UpwardsButtonActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        WrongDoorCodeMessage.setVisible(false);
        OkButton.setVisible(false);
        DownwardsButton.setVisible(true);
        UpwardsButton.setVisible(true);
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
            java.util.logging.Logger.getLogger(BackRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField DoorCodeField;
    private javax.swing.JButton DownwardsButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton UpwardsButton;
    private javax.swing.JLabel WrongDoorCodeMessage;
    // End of variables declaration//GEN-END:variables
}
