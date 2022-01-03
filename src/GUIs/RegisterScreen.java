// https://mailtrap.io/blog/java-email-validation/

package GUIs;

import Other.SQLStatements;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    public static String Username;

    public RegisterScreen() {
        initComponents();

        LongUsernameErrorMessage.setVisible(false);
        InvalidEmailErrorMessage.setVisible(false);
        PasswordCharactersErrorMessage.setVisible(false);
        UniqueUsernameErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        AccountCreatedMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LongUsernameErrorMessage = new javax.swing.JLabel();
        InvalidEmailErrorMessage = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        PasswordCharactersErrorMessage = new javax.swing.JLabel();
        UniqueUsernameErrorMessage = new javax.swing.JLabel();
        UniqueEmailErrorMessage = new javax.swing.JLabel();
        AccountCreatedMessage = new javax.swing.JLabel();
        InappropriateUsernameErrorMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LongUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Long Username Error.png"))); // NOI18N
        getContentPane().add(LongUsernameErrorMessage);
        LongUsernameErrorMessage.setBounds(710, 650, 500, 300);

        InvalidEmailErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Invalid Email Error.png"))); // NOI18N
        getContentPane().add(InvalidEmailErrorMessage);
        InvalidEmailErrorMessage.setBounds(710, 760, 410, 80);

        BackButton.setBorderPainted(false);
        BackButton.setContentAreaFilled(false);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(29, 25, 190, 70);

        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(760, 840, 400, 170);
        getContentPane().add(UsernameField);
        UsernameField.setBounds(370, 360, 1180, 40);
        getContentPane().add(EmailField);
        EmailField.setBounds(370, 520, 1180, 40);
        getContentPane().add(PasswordField);
        PasswordField.setBounds(370, 680, 1180, 40);

        PasswordCharactersErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Password Characters Error Message.png"))); // NOI18N
        getContentPane().add(PasswordCharactersErrorMessage);
        PasswordCharactersErrorMessage.setBounds(710, 710, 500, 170);

        UniqueUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Unique Username Error Message.png"))); // NOI18N
        getContentPane().add(UniqueUsernameErrorMessage);
        UniqueUsernameErrorMessage.setBounds(700, 730, 510, 130);
        UniqueUsernameErrorMessage.getAccessibleContext().setAccessibleName("UniqueUsernameErrorMessage");

        UniqueEmailErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/UniqueEmailErrorMessage.png"))); // NOI18N
        getContentPane().add(UniqueEmailErrorMessage);
        UniqueEmailErrorMessage.setBounds(710, 720, 520, 150);

        AccountCreatedMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Account Created Message.png"))); // NOI18N
        getContentPane().add(AccountCreatedMessage);
        AccountCreatedMessage.setBounds(710, 750, 430, 100);

        InappropriateUsernameErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Inappropriate Username Error Message.png"))); // NOI18N
        getContentPane().add(InappropriateUsernameErrorMessage);
        InappropriateUsernameErrorMessage.setBounds(700, 730, 430, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Register Screen.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed

        Username = UsernameField.getText();
        String Email = EmailField.getText();
        String Password = new String(PasswordField.getPassword());
        boolean check = false;

        LongUsernameErrorMessage.setVisible(false);
        InvalidEmailErrorMessage.setVisible(false);
        PasswordCharactersErrorMessage.setVisible(false);
        UniqueUsernameErrorMessage.setVisible(false);
        UniqueEmailErrorMessage.setVisible(false);
        InappropriateUsernameErrorMessage.setVisible(false);
        

        while (true) {
            if (Username.length() > 25) {
                LongUsernameErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            String LoweredUsername= Username.toLowerCase();
            System.out.println(LoweredUsername);
            
            if (LoweredUsername.contains("dog")||LoweredUsername.contains("yellow") || LoweredUsername.contains("four")){
                InappropriateUsernameErrorMessage.setVisible(true);
                check = true;
                break;
            }

            ArrayList<String> ExistingUsernames = SQLStatements.GetExistingUsernames();

            for (int i = 0; i < ExistingUsernames.size(); i++) {
                if (ExistingUsernames.get(i).equals(Username)) {
                    UniqueUsernameErrorMessage.setVisible(true);
                    check = true;
                    break;
                }
            }
            
            ExistingUsernames.clear();
            
            if (UniqueUsernameErrorMessage.isVisible()== true) {
                break;
            }

            String RegEx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(RegEx);
            Matcher matcher = pattern.matcher(Email);
            
            if (matcher.matches() == false) {
                InvalidEmailErrorMessage.setVisible(true);
                check = true;
                break;
            }
            
            ArrayList<String> ExistingEmails = SQLStatements.GetExistingEmails();
            
            for (int i = 0; i < ExistingEmails.size(); i++) {
                if (ExistingEmails.get(i).equals(Email)) {
                    UniqueEmailErrorMessage.setVisible(true);
                    check = true;
                    break;
                }
            }
            
            if(UniqueEmailErrorMessage.isVisible() == true){
                break;
            }
            
            ExistingEmails.clear();
            
            

            if (Password.length() < 8) {
                PasswordCharactersErrorMessage.setVisible(true);
                check = true;
                break;
            }

            break;
        }
        
        if (check == false){
            String JoinDate = Other.Utilities.GetCurrentDate();
            String HashedPassword = null;
            try{
                HashedPassword = Other.Utilities.GetHashedPassword(Password);
            }
            catch(Exception e){
                System.out.println("Error with hashed password when creating a user's account: "+e);
            }
            
            Objects.User NewUser = new Objects.User(Username, Email, HashedPassword, JoinDate);
            Other.Utilities.UpdateCurrentUser(NewUser);
            Other.SQLStatements.AddNewUser(NewUser);
            AccountCreatedMessage.setVisible(true);
            
            GUIs.NicknameChoosingScreen nicknameChoosing = new GUIs.NicknameChoosingScreen();
            
            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();
            
            nicknameChoosing.setSize(WidthSize, HeightSize);
            nicknameChoosing.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        GUIs.StartUpScreen startup = new GUIs.StartUpScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        //(width, height)
        startup.setSize(WidthSize, HeightSize);
        startup.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountCreatedMessage;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel InappropriateUsernameErrorMessage;
    private javax.swing.JLabel InvalidEmailErrorMessage;
    private javax.swing.JLabel LongUsernameErrorMessage;
    private javax.swing.JLabel PasswordCharactersErrorMessage;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel UniqueEmailErrorMessage;
    private javax.swing.JLabel UniqueUsernameErrorMessage;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
