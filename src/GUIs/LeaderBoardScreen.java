/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Other.NEAGame;
import java.util.ArrayList;
import java.awt.Toolkit;

public class LeaderBoardScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    
    ArrayList<Objects.Character> AllCharacters = Other.SQLStatements.GetAllCharacters();
    
    public LeaderBoardScreen() {
        initComponents();
        
        CurrentHighScoreLabel.setText(Integer.toString(NEAGame.CurrentCharacter.get(0).getHighScore()));
        SortLeaderboard();
        PrintLeaderboard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CurrentHighScoreLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        HighScoreFiveLabel = new javax.swing.JLabel();
        CharacterFiveLabel = new javax.swing.JLabel();
        UsernameFiveLabel = new javax.swing.JLabel();
        HighScoreFourLabel = new javax.swing.JLabel();
        CharacterFourLabel = new javax.swing.JLabel();
        UsernameFourLabel = new javax.swing.JLabel();
        HighScoreThreeLabel = new javax.swing.JLabel();
        CharacterThreeLabel = new javax.swing.JLabel();
        UsernameThreeLabel = new javax.swing.JLabel();
        HighScoreTwoLabel = new javax.swing.JLabel();
        CharacterTwoLabel = new javax.swing.JLabel();
        UsernameTwoLabel = new javax.swing.JLabel();
        HighScoreOneLabel = new javax.swing.JLabel();
        CharacterOneLabel = new javax.swing.JLabel();
        UsernameOneLabel = new javax.swing.JLabel();
        CharacterTitleLabel = new javax.swing.JLabel();
        UsernameTitleLabel = new javax.swing.JLabel();
        HighScoreTitleLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CurrentHighScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        CurrentHighScoreLabel.setForeground(new java.awt.Color(210, 133, 0));
        CurrentHighScoreLabel.setText("00");
        getContentPane().add(CurrentHighScoreLabel);
        CurrentHighScoreLabel.setBounds(1090, 1020, 70, 50);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(50, 50, 200, 70);

        HighScoreFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HighScoreFiveLabel.setText("- - - -");
        getContentPane().add(HighScoreFiveLabel);
        HighScoreFiveLabel.setBounds(1450, 860, 140, 29);

        CharacterFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CharacterFiveLabel.setText("- - - -");
        getContentPane().add(CharacterFiveLabel);
        CharacterFiveLabel.setBounds(990, 860, 160, 29);

        UsernameFiveLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UsernameFiveLabel.setText("- - - -");
        getContentPane().add(UsernameFiveLabel);
        UsernameFiveLabel.setBounds(410, 860, 140, 29);

        HighScoreFourLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HighScoreFourLabel.setText("- - - -");
        getContentPane().add(HighScoreFourLabel);
        HighScoreFourLabel.setBounds(1450, 730, 140, 29);

        CharacterFourLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CharacterFourLabel.setText("- - - -");
        getContentPane().add(CharacterFourLabel);
        CharacterFourLabel.setBounds(990, 730, 140, 29);

        UsernameFourLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UsernameFourLabel.setText("- - - -");
        getContentPane().add(UsernameFourLabel);
        UsernameFourLabel.setBounds(410, 730, 130, 29);

        HighScoreThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HighScoreThreeLabel.setText("- - - -");
        getContentPane().add(HighScoreThreeLabel);
        HighScoreThreeLabel.setBounds(1450, 610, 130, 29);

        CharacterThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CharacterThreeLabel.setText("- - - -");
        getContentPane().add(CharacterThreeLabel);
        CharacterThreeLabel.setBounds(990, 610, 100, 29);

        UsernameThreeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UsernameThreeLabel.setText("- - - -");
        getContentPane().add(UsernameThreeLabel);
        UsernameThreeLabel.setBounds(410, 610, 80, 29);

        HighScoreTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HighScoreTwoLabel.setText("- - - -");
        getContentPane().add(HighScoreTwoLabel);
        HighScoreTwoLabel.setBounds(1450, 490, 130, 29);

        CharacterTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CharacterTwoLabel.setText("- - - -");
        getContentPane().add(CharacterTwoLabel);
        CharacterTwoLabel.setBounds(990, 490, 120, 29);

        UsernameTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UsernameTwoLabel.setText("- - - -");
        getContentPane().add(UsernameTwoLabel);
        UsernameTwoLabel.setBounds(410, 490, 140, 29);

        HighScoreOneLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HighScoreOneLabel.setText("- - - -");
        getContentPane().add(HighScoreOneLabel);
        HighScoreOneLabel.setBounds(1450, 380, 150, 30);

        CharacterOneLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CharacterOneLabel.setText("- - - -");
        getContentPane().add(CharacterOneLabel);
        CharacterOneLabel.setBounds(990, 380, 140, 30);

        UsernameOneLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UsernameOneLabel.setText("- - - -");
        getContentPane().add(UsernameOneLabel);
        UsernameOneLabel.setBounds(410, 380, 130, 30);

        CharacterTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        CharacterTitleLabel.setText("Character");
        getContentPane().add(CharacterTitleLabel);
        CharacterTitleLabel.setBounds(910, 270, 210, 58);

        UsernameTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        UsernameTitleLabel.setText("Username");
        getContentPane().add(UsernameTitleLabel);
        UsernameTitleLabel.setBounds(340, 270, 220, 60);

        HighScoreTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        HighScoreTitleLabel.setText("High Score");
        getContentPane().add(HighScoreTitleLabel);
        HighScoreTitleLabel.setBounds(1360, 270, 240, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Leader Board Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, -4, 1930, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        
         GUIs.LevelModeSelectionScreen LevelModeSelection = new GUIs.LevelModeSelectionScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        LevelModeSelection.setSize(WidthSize, HeightSize);
        LevelModeSelection.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoardScreen().setVisible(true);
            }
            
        });
    }
    
    private void SortLeaderboard (){
        for(int x=0;x<AllCharacters.size();x++){
            for(int y=AllCharacters.size()-1;y>x;y--){
                if(AllCharacters.get(x).getHighScore()<AllCharacters.get(y).getHighScore()){
                    Objects.Character sorted = AllCharacters.get(x);
                    AllCharacters.set(x,AllCharacters.get(y));
                    AllCharacters.set(y,sorted);
                }
            }
        }
    }
    
    private void PrintLeaderboard(){
        int size = AllCharacters.size();
        
        if (size > 5){
            UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
            CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
            HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
            UsernameTwoLabel.setText(AllCharacters.get(1).getUsername());
            CharacterTwoLabel.setText(AllCharacters.get(1).getNickname());
            HighScoreTwoLabel.setText(Integer.toString(AllCharacters.get(1).getHighScore()));
            UsernameThreeLabel.setText(AllCharacters.get(2).getUsername());
            CharacterThreeLabel.setText(AllCharacters.get(2).getNickname());
            HighScoreThreeLabel.setText(Integer.toString(AllCharacters.get(2).getHighScore()));
            UsernameFourLabel.setText(AllCharacters.get(3).getUsername());
            CharacterFourLabel.setText(AllCharacters.get(3).getNickname());
            HighScoreFourLabel.setText(Integer.toString(AllCharacters.get(3).getHighScore()));
            UsernameFiveLabel.setText(AllCharacters.get(4).getUsername());
            CharacterFiveLabel.setText(AllCharacters.get(4).getNickname());
            HighScoreFiveLabel.setText(Integer.toString(AllCharacters.get(4).getHighScore()));
        }else{
            switch (size){
                case 1:
                    UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
                    CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
                    HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
                    break;
                case 2:
                    UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
                    CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
                    HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
                    UsernameTwoLabel.setText(AllCharacters.get(1).getUsername());
                    CharacterTwoLabel.setText(AllCharacters.get(1).getNickname());
                    HighScoreTwoLabel.setText(Integer.toString(AllCharacters.get(1).getHighScore()));
                    break;
                case 3:
                    UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
                    CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
                    HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
                    UsernameTwoLabel.setText(AllCharacters.get(1).getUsername());
                    CharacterTwoLabel.setText(AllCharacters.get(1).getNickname());
                    HighScoreTwoLabel.setText(Integer.toString(AllCharacters.get(1).getHighScore()));
                    UsernameThreeLabel.setText(AllCharacters.get(2).getUsername());
                    CharacterThreeLabel.setText(AllCharacters.get(2).getNickname());
                    HighScoreThreeLabel.setText(Integer.toString(AllCharacters.get(2).getHighScore()));
                    break;
                case 4:
                    UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
                    CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
                    HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
                    UsernameTwoLabel.setText(AllCharacters.get(1).getUsername());
                    CharacterTwoLabel.setText(AllCharacters.get(1).getNickname());
                    HighScoreTwoLabel.setText(Integer.toString(AllCharacters.get(1).getHighScore()));
                    UsernameThreeLabel.setText(AllCharacters.get(2).getUsername());
                    CharacterThreeLabel.setText(AllCharacters.get(2).getNickname());
                    HighScoreThreeLabel.setText(Integer.toString(AllCharacters.get(2).getHighScore()));
                    UsernameFourLabel.setText(AllCharacters.get(3).getUsername());
                    CharacterFourLabel.setText(AllCharacters.get(3).getNickname());
                    HighScoreFourLabel.setText(Integer.toString(AllCharacters.get(3).getHighScore()));
                    break;
                case 5:
                    UsernameOneLabel.setText(AllCharacters.get(0).getUsername());
                    CharacterOneLabel.setText(AllCharacters.get(0).getNickname());
                    HighScoreOneLabel.setText(Integer.toString(AllCharacters.get(0).getHighScore()));
                    UsernameTwoLabel.setText(AllCharacters.get(1).getUsername());
                    CharacterTwoLabel.setText(AllCharacters.get(1).getNickname());
                    HighScoreTwoLabel.setText(Integer.toString(AllCharacters.get(1).getHighScore()));
                    UsernameThreeLabel.setText(AllCharacters.get(2).getUsername());
                    CharacterThreeLabel.setText(AllCharacters.get(2).getNickname());
                    HighScoreThreeLabel.setText(Integer.toString(AllCharacters.get(2).getHighScore()));
                    UsernameFourLabel.setText(AllCharacters.get(3).getUsername());
                    CharacterFourLabel.setText(AllCharacters.get(3).getNickname());
                    HighScoreFourLabel.setText(Integer.toString(AllCharacters.get(3).getHighScore()));
                    UsernameFiveLabel.setText(AllCharacters.get(4).getUsername());
                    CharacterFiveLabel.setText(AllCharacters.get(4).getNickname());
                    HighScoreFiveLabel.setText(Integer.toString(AllCharacters.get(4).getHighScore()));
                    break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CharacterFiveLabel;
    private javax.swing.JLabel CharacterFourLabel;
    private javax.swing.JLabel CharacterOneLabel;
    private javax.swing.JLabel CharacterThreeLabel;
    private javax.swing.JLabel CharacterTitleLabel;
    private javax.swing.JLabel CharacterTwoLabel;
    private javax.swing.JLabel CurrentHighScoreLabel;
    private javax.swing.JLabel HighScoreFiveLabel;
    private javax.swing.JLabel HighScoreFourLabel;
    private javax.swing.JLabel HighScoreOneLabel;
    private javax.swing.JLabel HighScoreThreeLabel;
    private javax.swing.JLabel HighScoreTitleLabel;
    private javax.swing.JLabel HighScoreTwoLabel;
    private javax.swing.JLabel UsernameFiveLabel;
    private javax.swing.JLabel UsernameFourLabel;
    private javax.swing.JLabel UsernameOneLabel;
    private javax.swing.JLabel UsernameThreeLabel;
    private javax.swing.JLabel UsernameTitleLabel;
    private javax.swing.JLabel UsernameTwoLabel;
    // End of variables declaration//GEN-END:variables
}
