package Other;

import java.awt.Toolkit;
import java.util.ArrayList;

public class NEAGame {
    
    //Objects used throughout the whole program
    public static ArrayList <Objects.User> CurrentUser = new ArrayList<>();
    public static ArrayList <Objects.Character> CurrentCharacter = new ArrayList<>();

    public static void main(String[] args) {
    //bringing up the start up screen    
    GUIs.StartUpScreen startup = new GUIs.StartUpScreen();
    Toolkit tk = Toolkit.getDefaultToolkit();
    
    //getting specific width and height of screen to fit properly
    int WidthSize = (int)tk.getScreenSize().getWidth();
    int HeightSize = (int)tk.getScreenSize().getHeight();
    
    startup.setSize(WidthSize,HeightSize);
    startup.setVisible(true);
    }
}