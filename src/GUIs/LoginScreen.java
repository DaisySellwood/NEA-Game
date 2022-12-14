package GUIs;

import java.awt.Toolkit;

public class LoginScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();

    String HashedPassword;
    
    public LoginScreen() {
        initComponents();

        InvalidInfoErrorMessage.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        UsernameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmButton = new javax.swing.JButton();
        InvalidInfoErrorMessage = new javax.swing.JLabel();
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
        BackButton.setBounds(30, 30, 190, 70);
        getContentPane().add(UsernameField);
        UsernameField.setBounds(369, 362, 1180, 40);
        getContentPane().add(EmailField);
        EmailField.setBounds(370, 520, 1180, 50);
        getContentPane().add(PasswordField);
        PasswordField.setBounds(370, 680, 1180, 40);

        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmButton);
        ConfirmButton.setBounds(760, 840, 400, 180);

        InvalidInfoErrorMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Invalid Info Error Message.png"))); // NOI18N
        getContentPane().add(InvalidInfoErrorMessage);
        InvalidInfoErrorMessage.setBounds(720, 760, 450, 90);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Login Screen.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, -30, 1920, 1150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed

        GUIs.StartUpScreen startup = new GUIs.StartUpScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        startup.setSize(WidthSize, HeightSize);
        startup.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed

        InvalidInfoErrorMessage.setVisible(false);

        String Username = UsernameField.getText();
        String Email = EmailField.getText();
        String Password = new String(PasswordField.getPassword());
        try{
           HashedPassword = Other.Utilities.GetHashedPassword(Password); 
        }
        catch (Exception e){
            System.out.println("Error with hashing password in login screen: "+e);
        }
        

        if(!Other.SQLStatements.UserLogin(Username, Password, Email)){
            InvalidInfoErrorMessage.setVisible(true);
        }else{
            Objects.User CurrentUser = new Objects.User(Username, Email, HashedPassword, Other.SQLStatements.GetJoinDate(Username));
            Other.Utilities.UpdateCurrentUser(CurrentUser);
            GUIs.SelectACharacterScreen SACS = new GUIs.SelectACharacterScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            SACS.setSize(WidthSize, HeightSize);
            SACS.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel InvalidInfoErrorMessage;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    // End of variables declaration//GEN-END:variables
}
