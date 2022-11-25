package Objects;

public class CharacterItem {
    
    private int CharacterItemID;
    private int CharacterID;
    private int ItemID;

    public CharacterItem(int CharacterItemID, int CharacterID, int ItemID) {
        this.CharacterItemID = CharacterItemID;
        this.CharacterID = CharacterID;
        this.ItemID = ItemID;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getCharacterItemID() {
        return CharacterItemID;
    }

    public int getCharacterID() {
        return CharacterID;
    }

    public int getItemID() {
        return ItemID;
    }
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCharacterItemID(int CharacterItemID) {
        this.CharacterItemID = CharacterItemID;
    }

    public void setCharacterID(int CharacterID) {
        this.CharacterID = CharacterID;
    }

    public void setItemID(int ItemID) {
        this.ItemID = ItemID;
    }
    //</editor-fold>
}