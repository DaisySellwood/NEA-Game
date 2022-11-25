package GUIs;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountSettings extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    
    private String CurrentHashedPassword;
    private String NewHashedPassword;
    
    public AccountSettings() {
        initComponents();

        UsernameSection.setVisible(false);
        UsernameField.setVisible(false);
        UsernameConfirmButton.setVisible(false);
        UniqueUsernameErrorMessage.setVisible(false);
        LongUsernameErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        UsernameChangedSuccessfullyMessage.setVisible(false);

        PasswordSection.setVisible(false);
        CurrentPasswordField.setVisible(false);
        NewPasswordField.setVisible(false);
        PasswordConfirmButton.setVisible(false);
        PasswordCharactersErrorMessage.setVisible(false);
        IncorrectCurrentPasswordErrorMessage.setVisible(false);
        PasswordChangedSuccessfullyMessage.setVisible(false);

        EmailSection.setVisible(false);
        EmailField.setVisible(false);
        EmailConfirmButton.setVisible(false);
        InvalidEmailErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        EmailChangedSuccessfullyMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameChangedSuccessfullyMessage = new javax.swing.JLabel();
        EmailChangedSuccessfullyMessage = new javax.swing.JLabel();
        PasswordChangedSuccessfullyMessage = new javax.swing.JLabel();
        IncorrectCurrentPasswordErrorMessage = new javax.swing.JLabel();
        PasswordCharactersErrorMessage = new javax.swing.JLabel();
        UniqueEmailErrorMessage = new javax.swing.JLabel();
        InvalidEmailErrorMessage = new javax.swing.JLabel();
        InappropriateUsernameErrorMessage = new javax.swing.JLabel();
        LongUsernameErrorMessage = new javax.swing.JLabel();
        UniqueUsernameErrorMessage = new javax.swing.JLabel();
        EmailConfirmButton = new javax.swing.JButton();
        EmailField = new javax.swing.JTextField();
        EmailSection = new javax.swing.JLabel();
        NewPasswordField = new javax.swing.JPasswordField();
        BackButton = new javax.swing.JButton();
        UsernameButton = new javax.swing.JButton();
        EmailButton = new javax.swing.JButton();
        PasswordButton = new javax.swing.JButton();
        PasswordConfirmButton = new javax.swing.JButton();
        CurrentPasswordField = new javax.swing.JPasswordField();
        PasswordSection = new javax.swing.JLabel();
        UsernameConfirmButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        UsernameSection = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UsernameChangedSuccessfullyMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Username Changed Successfully Message.png"))); // NOI18N
        getContentPane().add(UsernameChangedSuccessfullyMessage);
        UsernameChangedSuccessfullyMessage.setBounds(720, 770, 440, 130);

        EmailChangedSuccessfullyMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Email Changed Successfully Message.png"))); // NOI18N
        getContentPane().add(EmailChangedSuccessfullyMessage);
        EmailChangedSuccessfullyMessage.setBounds(720, 770, 410, 130);

        PasswordChangedSuccessfullyMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Password Changed Successfully Message.png"))); // NOI18N
        getContentPane().add(PasswordChangedSuccessfullyMessage);
        PasswordChangedSuccessfullyMessage.setBounds(720, 770, 440, 140);

        IncorrectCurrentPasswordErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Incorrect Current Password Error Message.png"))); // NOI18N
        getContentPane().add(IncorrectCurrentPasswordErrorMessage);
        IncorrectCurrentPasswordErrorMessage.setBounds(720, 780, 450, 130);

        PasswordCharactersErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Password Characters Error Message.png"))); // NOI18N
        getContentPane().add(PasswordCharactersErrorMessage);
        PasswordCharactersErrorMessage.setBounds(720, 770, 500, 150);

        UniqueEmailErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/UniqueEmailErrorMessage.png"))); // NOI18N
        getContentPane().add(UniqueEmailErrorMessage);
        UniqueEmailErrorMessage.setBounds(720, 760, 510, 140);

        InvalidEmailErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Invalid Email Error.png"))); // NOI18N
        getContentPane().add(InvalidEmailErrorMessage);
        InvalidEmailErrorMessage.setBounds(730, 780, 390, 100);

        InappropriateUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Inappropriate Username Error Message.png"))); // NOI18N
        getContentPane().add(InappropriateUsernameErrorMessage);
        InappropriateUsernameErrorMessage.setBounds(720, 760, 430, 140);

        LongUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Long Username Error.png"))); // NOI18N
        getContentPane().add(LongUsernameErrorMessage);
        LongUsernameErrorMessage.setBounds(720, 790, 510, 90);

        UniqueUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Unique Username Error Message.png"))); // NOI18N
        getContentPane().add(UniqueUsernameErrorMessage);
        UniqueUsernameErrorMessage.setBounds(720, 680, 500, 300);

        EmailConfirmButton.setBorderPainted(false);
        EmailConfirmButton.setContentAreaFilled(false);
        EmailConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmailConfirmButton);
        EmailConfirmButton.setBounds(790, 890, 370, 170);
        getContentPane().add(EmailField);
        EmailField.setBounds(150, 560, 1640, 60);

        EmailSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Email Section.jpg"))); // NOI18N
        getContentPane().add(EmailSection);
        EmailSection.setBounds(10, 420, 1910, 673);
        getContentPane().add(NewPasswordField);
        NewPasswordField.setBounds(150, 700, 1640, 60);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(40, 60, 190, 70);

        UsernameButton.setBorderPainted(false);
        UsernameButton.setContentAreaFilled(false);
        UsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameButton);
        UsernameButton.setBounds(209, 245, 310, 140);

        EmailButton.setBorderPainted(false);
        EmailButton.setContentAreaFilled(false);
        EmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmailButton);
        EmailButton.setBounds(1419, 255, 310, 140);

        PasswordButton.setBorderPainted(false);
        PasswordButton.setContentAreaFilled(false);
        PasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordButton);
        PasswordButton.setBounds(809, 245, 300, 150);

        PasswordConfirmButton.setBorderPainted(false);
        PasswordConfirmButton.setContentAreaFilled(false);
        PasswordConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordConfirmButton);
        PasswordConfirmButton.setBounds(779, 885, 380, 180);
        getContentPane().add(CurrentPasswordField);
        CurrentPasswordField.setBounds(150, 550, 1640, 70);

        PasswordSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Password Section.jpg"))); // NOI18N
        getContentPane().add(PasswordSection);
        PasswordSection.setBounds(10, 430, 1910, 650);

        UsernameConfirmButton.setBorderPainted(false);
        UsernameConfirmButton.setContentAreaFilled(false);
        UsernameConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameConfirmButton);
        UsernameConfirmButton.setBounds(789, 885, 370, 170);
        getContentPane().add(UsernameField);
        UsernameField.setBounds(149, 552, 1640, 60);

        UsernameSection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Username Section.jpg"))); // NOI18N
        getContentPane().add(UsernameSection);
        UsernameSection.setBounds(10, 400, 1880, 700);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Change Account Details Base.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(1, 6, 1930, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        GUIs.NormalSettings normalSettings = new GUIs.NormalSettings();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        normalSettings.setSize(WidthSize, HeightSize);
        normalSettings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void UsernameConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameConfirmButtonActionPerformed
        UniqueUsernameErrorMessage.setVisible(false);
        LongUsernameErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        UsernameChangedSuccessfullyMessage.setVisible(false);
        
        String NewUsername = UsernameField.getText();
        boolean check = false;

        while (true) {
            if (NewUsername.length() > 25) {
                LongUsernameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            String LoweredUsername= NewUsername.toLowerCase();
            System.out.println(LoweredUsername);
            
            if (LoweredUsername.contains("dog")||LoweredUsername.contains("yellow") || LoweredUsername.contains("4")){
                InappropriateUsernameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            ArrayList<String> ExistingUsernames = Other.SQLStatements.GetExistingUsernames();

            for (int i = 0; i < ExistingUsernames.size(); i++) {
                if (ExistingUsernames.get(i).equals(NewUsername)) {
                    UniqueUsernameErrorMessage.setVisible(true);
                    check = true;
                    break;
                }
            }
            
            ExistingUsernames.clear();
            
             if (UniqueUsernameErrorMessage.isVisible()== true) {
                break;
            }
             break;
        }
        
        if (check == false){
            //updating username in user table
            Objects.User ChangingUsername = new Objects.User(NewUsername, Other.NEAGame.CurrentUser.get(0).getEmail(),Other.NEAGame.CurrentUser.get(0).getPassword(),Other.NEAGame.CurrentUser.get(0).getJoinDate());
            Other.SQLStatements.UpdateUser(ChangingUsername, Other.NEAGame.CurrentUser.get(0).getUsername());
            Other.Utilities.UpdateCurrentUser(ChangingUsername);
            //Upadting usernames in character table too
            ArrayList<Objects.Character> UserCharacters = Other.SQLStatements.GetAllUserCharacters(Other.NEAGame.CurrentCharacter.get(0).getUsername());
            for (int i = 0; i < UserCharacters.size(); i++) {
                Objects.Character ChangingCharacterUsername = new Objects.Character(UserCharacters.get(i).getCharacterID(), NewUsername, UserCharacters.get(i).getNickname(), UserCharacters.get(i).getCharacterGender(), UserCharacters.get(i).getClassID(), UserCharacters.get(i).getDomainAmount(), UserCharacters.get(i).getLastDomainDate(), UserCharacters.get(i).getHighScore());
                Other.SQLStatements.UpdateCharacter(ChangingCharacterUsername, Other.NEAGame.CurrentUser.get(0).getUsername());
            }
            UsernameChangedSuccessfullyMessage.setVisible(true);
        }
    }//GEN-LAST:event_UsernameConfirmButtonActionPerformed

    private void UsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameButtonActionPerformed
        UsernameSection.setVisible(true);
        UsernameField.setVisible(true);
        UsernameConfirmButton.setVisible(true);
        
        UniqueUsernameErrorMessage.setVisible(false);
        LongUsernameErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        UsernameChangedSuccessfullyMessage.setVisible(false);

        PasswordSection.setVisible(false);
        CurrentPasswordField.setVisible(false);
        NewPasswordField.setVisible(false);
        PasswordConfirmButton.setVisible(false);
        PasswordCharactersErrorMessage.setVisible(false);
        IncorrectCurrentPasswordErrorMessage.setVisible(false);
        PasswordChangedSuccessfullyMessage.setVisible(false);

        EmailSection.setVisible(false);
        EmailField.setVisible(false);
        EmailConfirmButton.setVisible(false);
        InvalidEmailErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        EmailChangedSuccessfullyMessage.setVisible(false);
    }//GEN-LAST:event_UsernameButtonActionPerformed

    private void PasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordButtonActionPerformed
        PasswordSection.setVisible(true);
        CurrentPasswordField.setVisible(true);
        NewPasswordField.setVisible(true);
        PasswordConfirmButton.setVisible(true);
        
        UsernameSection.setVisible(false);
        UsernameField.setVisible(false);
        UsernameConfirmButton.setVisible(false);
        UniqueUsernameErrorMessage.setVisible(false);
        LongUsernameErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        UsernameChangedSuccessfullyMessage.setVisible(false);

        PasswordCharactersErrorMessage.setVisible(false);
        IncorrectCurrentPasswordErrorMessage.setVisible(false);
        PasswordChangedSuccessfullyMessage.setVisible(false);

        EmailSection.setVisible(false);
        EmailField.setVisible(false);
        EmailConfirmButton.setVisible(false);
        InvalidEmailErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        EmailChangedSuccessfullyMessage.setVisible(false);
    }//GEN-LAST:event_PasswordButtonActionPerformed

    private void PasswordConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordConfirmButtonActionPerformed
        PasswordCharactersErrorMessage.setVisible(false);
        IncorrectCurrentPasswordErrorMessage.setVisible(false);
        PasswordChangedSuccessfullyMessage.setVisible(false);
        
        String CurrentPassword = new String(CurrentPasswordField.getPassword());
        try{
        CurrentHashedPassword = Other.Utilities.GetHashedPassword(CurrentPassword);
        }catch (Exception e){
            System.out.println("Error with hashing password in account settings: "+e);
        }
        
        String NewPassword = new String(NewPasswordField.getPassword());
        boolean check = false;
        
        while (true){
            if(Other.Utilities.ComparePasswords(CurrentHashedPassword, Other.NEAGame.CurrentUser.get(0).getPassword()) == false){
                IncorrectCurrentPasswordErrorMessage.setVisible(true);
                check = true;
                break;
            }
 
            if (NewPassword.length() < 8) {
                PasswordCharactersErrorMessage.setVisible(true);
                check = true;
                break;
            }
            break;
        }
        
        if (check == false){
            try{
            NewHashedPassword = Other.Utilities.GetHashedPassword(NewPassword);
            }
            catch (Exception e){
                System.out.println("Error with hashing new password in account settings: "+e);
            }
            //updating password in users table
            Objects.User ChangingPassword = new Objects.User(Other.NEAGame.CurrentUser.get(0).getUsername(), Other.NEAGame.CurrentUser.get(0).getEmail(), NewHashedPassword,Other.NEAGame.CurrentUser.get(0).getJoinDate());
            Other.SQLStatements.UpdateUser(ChangingPassword, Other.NEAGame.CurrentUser.get(0).getUsername());
            Other.Utilities.UpdateCurrentUser(ChangingPassword);
            PasswordChangedSuccessfullyMessage.setVisible(true);
        }
    }//GEN-LAST:event_PasswordConfirmButtonActionPerformed

    private void EmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailButtonActionPerformed
        EmailSection.setVisible(true);
        EmailField.setVisible(true);
        EmailConfirmButton.setVisible(true);
        
        UsernameSection.setVisible(false);
        UsernameField.setVisible(false);
        UsernameConfirmButton.setVisible(false);
        UniqueUsernameErrorMessage.setVisible(false);
        LongUsernameErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        UsernameChangedSuccessfullyMessage.setVisible(false);

        PasswordSection.setVisible(false);
        CurrentPasswordField.setVisible(false);
        NewPasswordField.setVisible(false);
        PasswordConfirmButton.setVisible(false);
        PasswordCharactersErrorMessage.setVisible(false);
        IncorrectCurrentPasswordErrorMessage.setVisible(false);
        PasswordChangedSuccessfullyMessage.setVisible(false);

        InvalidEmailErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        EmailChangedSuccessfullyMessage.setVisible(false);
    }//GEN-LAST:event_EmailButtonActionPerformed

    private void EmailConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailConfirmButtonActionPerformed
        InvalidEmailErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        EmailChangedSuccessfullyMessage.setVisible(false);
        
        String NewEmail = EmailField.getText();
        boolean check = false;
        
        while(true){
            String RegEx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(NewEmail);
            
            if (matcher.matches() == false) {
                InvalidEmailErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            ArrayList<String> ExistingEmails = Other.SQLStatements.GetExistingEmails();
            
            for (int i = 0; i < ExistingEmails.size(); i++) {
                if (ExistingEmails.get(i).equals(NewEmail)) {
                    UniqueEmailErrorMessage.setVisible(true);
                    check = true;
                    break;
                }
            }
            
            ExistingEmails.clear();
            
            if(UniqueEmailErrorMessage.isVisible() == true){
                break;
            }
            break;
        }
        
        if (check == false){
            //updating email in users table
            Objects.User ChangingEmail = new Objects.User(Other.NEAGame.CurrentUser.get(0).getUsername(), NewEmail, Other.NEAGame.CurrentUser.get(0).getPassword(),Other.NEAGame.CurrentUser.get(0).getJoinDate());
            Other.SQLStatements.UpdateUser(ChangingEmail, Other.NEAGame.CurrentUser.get(0).getUsername());
            Other.Utilities.UpdateCurrentUser(ChangingEmail);
            EmailChangedSuccessfullyMessage.setVisible(true);
        }
    }//GEN-LAST:event_EmailConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JPasswordField CurrentPasswordField;
    private javax.swing.JButton EmailButton;
    private javax.swing.JLabel EmailChangedSuccessfullyMessage;
    private javax.swing.JButton EmailConfirmButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailSection;
    private javax.swing.JLabel InappropriateUsernameErrorMessage;
    private javax.swing.JLabel IncorrectCurrentPasswordErrorMessage;
    private javax.swing.JLabel InvalidEmailErrorMessage;
    private javax.swing.JLabel LongUsernameErrorMessage;
    private javax.swing.JPasswordField NewPasswordField;
    private javax.swing.JButton PasswordButton;
    private javax.swing.JLabel PasswordChangedSuccessfullyMessage;
    private javax.swing.JLabel PasswordCharactersErrorMessage;
    private javax.swing.JButton PasswordConfirmButton;
    private javax.swing.JLabel PasswordSection;
    private javax.swing.JLabel UniqueEmailErrorMessage;
    private javax.swing.JLabel UniqueUsernameErrorMessage;
    private javax.swing.JButton UsernameButton;
    private javax.swing.JLabel UsernameChangedSuccessfullyMessage;
    private javax.swing.JButton UsernameConfirmButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameSection;
    // End of variables declaration//GEN-END:variables
}