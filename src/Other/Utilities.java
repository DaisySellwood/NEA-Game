package Other;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Utilities {    
    
    private static String[] SortedItems;
    
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
        boolean check = StoredPassword.equals(EnteredPassword);
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
    
    public static void UpdateCurrentCharacter(Objects.Character character){
        Other.NEAGame.CurrentCharacter.clear(); //to remove the current character
        Other.NEAGame.CurrentCharacter.add(character);
    }
    
    public static void UpdateCurrentUser(Objects.User user){
        Other.NEAGame.CurrentUser.clear(); //to remove the current user
        Other.NEAGame.CurrentUser.add(user);
    }
    
    public static void SetHighScore(int CurrentLevel, int CurrentHighScore){
    if (CurrentLevel>CurrentHighScore){
        Objects.Character NewCharacter = new Objects.Character(Other.NEAGame.CurrentCharacter.get(0).getCharacterID(), Other.NEAGame.CurrentCharacter.get(0).getUsername(), Other.NEAGame.CurrentCharacter.get(0).getNickname(), Other.NEAGame.CurrentCharacter.get(0).getCharacterGender(), Other.NEAGame.CurrentCharacter.get(0).getClassID(), Other.NEAGame.CurrentCharacter.get(0).getDomainAmount(), Other.NEAGame.CurrentCharacter.get(0).getLastDomainDate(), CurrentLevel);
        Other.SQLStatements.UpdateCharacter(NewCharacter, Other.NEAGame.CurrentUser.get(0).getUsername());
        Other.Utilities.UpdateCurrentCharacter(NewCharacter);
        }
    }
    
    public static String[] GetItemsToSort(ArrayList<Objects.Item> AllItems, ArrayList<Objects.CharacterItem> CharacterItems){
        int Size = CharacterItems.size();
        String[] Items = new String[Size];
        for (int i = 0; i < Size; i++) {
            Items[i] = AllItems.get(CharacterItems.get(i).getItemID()-1).getItemName();
        }
        return Items;
    }
    
    public static String[] GetItemTypeToSort(ArrayList<Objects.Item> AllItems, ArrayList<Objects.CharacterItem> CharacterItems){
        int Size = CharacterItems.size();
        String[] Items = new String[Size];
        for (int i = 0; i < Size; i++) {
            Items[i] = AllItems.get(CharacterItems.get(i).getItemID()-1).getBuff();
        }
        return Items;
    }
    
    public static void SortItems(String[] List){
        if (List.length >= 2) {
            String[] right = new String[List.length - List.length / 2];
            String[] left = new String[List.length/2];

            for (int i = 0; i < right.length; i++) {
                right[i] = List[i + List.length / 2];
            }
            
            for (int i = 0; i < left.length; i++) {
                left[i] = List[i];
            }

            SortItems(left);
            SortItems(right);

            SortedItems = MergeItems(List, left, right); //putting left and right together
        }
    }
    
    public static String[] MergeItems(String[] Final, String[] Left, String[] Right){
        int PointerOne = 0;
        int PointerTwo = 0;
        for (int i = 0; i < Final.length; i++) {
            if (PointerTwo >= Right.length || (PointerOne < Left.length && Left[PointerOne].compareToIgnoreCase(Right[PointerTwo]) < 0)) {
                Final[i] = Left[PointerOne];
                PointerOne++;
            } else {
                Final[i] = Right[PointerTwo];
                PointerTwo++;
            }
        }
        return Final;
    }
    
    public static ArrayList<Objects.Item> ReturnSortedItems(ArrayList<Objects.Item> AllItems){
        ArrayList<Objects.Item> SortedItemsList = new ArrayList<>();
        for (int i = 0; i < SortedItems.length; i++) {
            Objects.Item CertainItem = Other.SQLStatements.GetCertainItem(SortedItems[i]);
            SortedItemsList.add(CertainItem);
        }
        return SortedItemsList;
    }
    
    public static ArrayList<Objects.Item> ReturnSortedItemTypes(ArrayList<Objects.Item> AllItems, ArrayList<Objects.CharacterItem> CharacterItems){
        ArrayList<Objects.Item> SortedItemTypeList = new ArrayList<>();
        ArrayList<Objects.CharacterItem> ExtraCharacterItems = CharacterItems;
        
        for (int i = 0; i < SortedItems.length; i++) {
            int z =0;
            while (true){
                if (SortedItems[i].equals(AllItems.get(ExtraCharacterItems.get(z).getItemID()-1).getBuff())) {
                    Objects.Item CertainItem = Other.SQLStatements.GetCertainItem(AllItems.get((ExtraCharacterItems.get(z).getItemID()-1)).getItemName());
                    SortedItemTypeList.add(CertainItem);
                    ExtraCharacterItems.remove(z);
                    break;
                }else{
                    z++;
                }
            }
        }
        return SortedItemTypeList;
    }
}
