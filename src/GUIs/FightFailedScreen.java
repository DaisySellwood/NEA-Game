package GUIs;

import java.awt.Toolkit;

public class FightFailedScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();

    public FightFailedScreen() {
        initComponents();
        
        if (GUIs.ForestBattleScreen.GameType.equals("Level")){
            CurrentScoreLabel.setText(Integer.toString(GUIs.LevelModeSelectionScreen.Level -1));
        }else{
            YourScoreWasLabel.setVisible(false);
            CurrentScoreLabel.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        YourScoreWasLabel = new javax.swing.JLabel();
        CurrentScoreLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(740, 730, 440, 210);

        YourScoreWasLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        YourScoreWasLabel.setText("YOUR SCORE WAS");
        getContentPane().add(YourScoreWasLabel);
        YourScoreWasLabel.setBounds(690, 640, 410, 70);

        CurrentScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        CurrentScoreLabel.setText("0");
        getContentPane().add(CurrentScoreLabel);
        CurrentScoreLabel.setBounds(1120, 650, 50, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Fight Failed Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed

        if (GUIs.ForestBattleScreen.GameType.equals("Domain")) {
            GUIs.DomainSelectionScreen domains = new GUIs.DomainSelectionScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            domains.setSize(WidthSize, HeightSize);
            domains.setVisible(true);
            this.dispose();
        } else if (GUIs.ForestBattleScreen.GameType.equals("Level")) {
            Other.Utilities.SetHighScore(GUIs.LevelModeSelectionScreen.Level -1, Other.NEAGame.CurrentCharacter.get(0).getHighScore());
            GUIs.LevelModeSelectionScreen LevelSelec = new GUIs.LevelModeSelectionScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            LevelSelec.setSize(WidthSize, HeightSize);
            LevelSelec.setVisible(true);
            this.dispose();
        }else if (GUIs.ForestBattleScreen.GameType.equals("Story")){
            GUIs.DifficultySelectScreen DiffSelec = new GUIs.DifficultySelectScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            DiffSelec.setSize(WidthSize, HeightSize);
            DiffSelec.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FightFailedScreen.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FightFailedScreen.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FightFailedScreen.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FightFailedScreen.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FightFailedScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CurrentScoreLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel YourScoreWasLabel;
    // End of variables declaration//GEN-END:variables
}
