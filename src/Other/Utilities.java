
package Other;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {    
    
    public static String GetHashedPassword(String Password) throws Exception{
        
        MessageDigest messdi = MessageDigest.getInstance("SHA-512");
        messdi.update(Password.getBytes());
        byte[] digest = messdi.digest();
        StringBuffer hexString = new StringBuffer();
        
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        
        String HashedPassword = hexString.toString();
        
        return HashedPassword;
    }
    
    public static boolean ComparePasswords(String StoredPassword, String EnteredPassword){
        boolean check; 
        if(StoredPassword.equals(EnteredPassword)){
            check = true;
        }else{
            check = false;
        }
        return check;
    }
    
    public static String GetCurrentDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM YYYY");
        Date date = new Date();
        String FormattedDate = sdf.format(date);
        
        return FormattedDate;
    }
    
    public static boolean CompareEmails(String StoredEmail, String EnteredEmail){
        boolean check = StoredEmail.equals(EnteredEmail);
        return check;
    }
    
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void UpdateCurrentCharacter(Objects.Character character){
        Other.NEAGame.CurrentCharacter.clear();
        Other.NEAGame.CurrentCharacter.add(character);
    }
    
    public static void UpdateCurrentUser(Objects.User user){
        Other.NEAGame.CurrentUser.clear();
        Other.NEAGame.CurrentUser.add(user);
    }
    
}
