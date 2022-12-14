package GUIs;

import java.awt.Toolkit;

public class AssassinClassScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();

    public AssassinClassScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        ChooseButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

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
        BackButton.setBounds(30, 40, 220, 90);

        ChooseButton.setBorderPainted(false);
        ChooseButton.setContentAreaFilled(false);
        ChooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ChooseButton);
        ChooseButton.setBounds(1550, 920, 330, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Assassin Class Screen.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1930, 1100);

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

    private void ChooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseButtonActionPerformed

        ClassSelectionScreen.CharacterClass = 2;

        GUIs.GenderSelectionScreen GenderSelec = new GUIs.GenderSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        GenderSelec.setSize(WidthSize, HeightSize);
        GenderSelec.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ChooseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AssassinClassScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssassinClassScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssassinClassScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssassinClassScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssassinClassScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChooseButton;
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
