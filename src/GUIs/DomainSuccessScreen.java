
package GUIs;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

public class DomainSuccessScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    Random rand = new Random();
    
    private String DomainType = GUIs.DomainSelectionScreen.DomainType;
    private ArrayList<Objects.Item> Rewards = new ArrayList<>();
    
    public DomainSuccessScreen() {
        initComponents();
        
        UpdateDomainAmount();
        UpdateDomainDate();
        GetRewards();
        
        RewardsLabel.setText(Rewards.get(0).getItemName()+", "+Rewards.get(1).getItemName()+", "+Rewards.get(2).getItemName());
        
        AddRewardsToDatabase();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        RewardsLabel = new javax.swing.JLabel();
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
        ExitButton.setBounds(749, 775, 430, 210);

        RewardsLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        RewardsLabel.setText("Rewards");
        getContentPane().add(RewardsLabel);
        RewardsLabel.setBounds(300, 510, 1340, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Domain Success Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        GUIs.DomainSelectionScreen domains = new GUIs.DomainSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        domains.setSize(WidthSize, HeightSize);
        domains.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(DomainSuccessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DomainSuccessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DomainSuccessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DomainSuccessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DomainSuccessScreen().setVisible(true);
            }
        });
    }
    
    
    private void UpdateDomainAmount(){
        int NewDomainAmount = Other.NEAGame.CurrentCharacter.get(0).getDomainAmount() +1;
        Objects.Character UpdatedCharacter = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), Other.NEAGame.CurrentCharacter.get(0).getCharacterGender(), Other.NEAGame.CurrentCharacter.get(0).getClassID(), NewDomainAmount, Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate(), Other.NEAGame.CurrentCharacter.get(0).getHighScore());
        Other.SQLStatements.UpdateCharacter(UpdatedCharacter, UpdatedCharacter.getUsername());
        Other.Utilities.UpdateCurrentCharacter(UpdatedCharacter);
    }
    
    private void UpdateDomainDate(){
        String CurrentDate = Other.Utilities.GetCurrentDate();
        String DomainDate = Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate();
        if (!CurrentDate.equals(DomainDate)){
            Objects.Character UpdatedCharacter = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), Other.NEAGame.CurrentCharacter.get(0).getCharacterGender(), Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), CurrentDate, Other.NEAGame.CurrentCharacter.get(0).getHighScore());
            Other.SQLStatements.UpdateCharacter(UpdatedCharacter, UpdatedCharacter.getUsername());
            Other.Utilities.UpdateCurrentCharacter(UpdatedCharacter);
        }
    }
    
    private void GetRewards(){
        Objects.Item Potion = new Objects.Item(18, "Health Potion", "Potion", "Healing", 20, "N/A");
        Rewards.add(Potion);
        
        ArrayList<Objects.Item> AllDomainItems = Other.SQLStatements.GetAllDomainItems(DomainType);
        
        for (int i = 0; i < 2; i++) {
            int RandomNum = rand.nextInt(AllDomainItems.size());
            Rewards.add(AllDomainItems.get(RandomNum));
        } 
    }
    
    private void AddRewardsToDatabase(){
        for (int i = 0; i < Rewards.size(); i++) {
            Objects.CharacterItem NextCharacterItem = new Objects.CharacterItem(0, Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Rewards.get(i).getItemID());
            Other.SQLStatements.AddNewCharacterItem(NextCharacterItem);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel RewardsLabel;
    // End of variables declaration//GEN-END:variables
}
