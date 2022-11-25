package GUIs;

import Other.SQLStatements;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

public class ForestBattleScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();

    public static String GameType;
    private static String DomainType;
    private static String Monster;

    private static int PlayerClass = Other.NEAGame.CurrentCharacter.get(0).getClassID();
    private static Objects.CharacterClass ClassInformation = Other.SQLStatements.GetCertainClass(PlayerClass);
    private static ArrayList<Objects.Attack> ClassAttacks = Other.SQLStatements.GetClassAttacks(PlayerClass);
    private static Objects.Monster CurrentMonster;
    private static ArrayList<Objects.CharacterItem> CharacterItems = Other.SQLStatements.GetCharacterItems(Other.NEAGame.CurrentCharacter.get(0).getCharacterID());
    private static ArrayList<Objects.Item> AllItems = Other.SQLStatements.GettAllItems();

    public static double PlayerHealth;
    private static double MonsterHealth;
    private static int Buff = 0;

    private static boolean PlayerTurn = true;

    public ForestBattleScreen() {
        initComponents();

        SetBagInvisible();

        BattleQuitConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        if (GameType.equals("Domain")) {
            DomainType = GUIs.DomainSelectionScreen.DomainType;
            Monster = GUIs.DomainSelectionScreen.MonsterName;
            CurrentMonster = Other.SQLStatements.GetCertainMonster(Monster);
        } else if (GameType.equals("Level")) {
            if (GUIs.LevelModeSelectionScreen.Level == 5) {
                CurrentMonster = Other.SQLStatements.GetCertainMonster("Ghost");
                Monster = CurrentMonster.getMonsterName();
            } else if (GUIs.LevelModeSelectionScreen.Level == 10) {
                CurrentMonster = Other.SQLStatements.GetCertainMonster("Vampire Overlord");
                Monster = CurrentMonster.getMonsterName();
            } else {
                ArrayList<Objects.Monster> NormalMonsters = SQLStatements.GetNormalMonsters();
                int RandNumber = rand.nextInt(NormalMonsters.size());
                Monster = NormalMonsters.get(RandNumber).getMonsterName();
                CurrentMonster = Other.SQLStatements.GetCertainMonster(Monster);
            }
        }

        Ghost.setVisible(false);
        Zombie.setVisible(false);
        Spirit.setVisible(false);
        Bat.setVisible(false);
        Vampire.setVisible(false);
        Spider.setVisible(false);

        StickNB.setVisible(false);
        StickF.setVisible(false);
        StickM.setVisible(false);

        SetMonsterImageVisible();
        SetPlayerImageVisible();

        FightBox.setVisible(false);
        FightBackButton.setVisible(false);
        FightOneButton.setVisible(false);
        FightOneName.setVisible(false);
        FightOneType.setVisible(false);
        FightTwoButton.setVisible(false);
        FightTwoName.setVisible(false);
        FightTwoType.setVisible(false);
        FightThreeButton.setVisible(false);
        FightThreeName.setVisible(false);
        FightThreeType.setVisible(false);

        if (GameType.equals("Domain")) {
            PlayerHealth = ClassInformation.getCharacterHealth();
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (GameType.equals("Level")) {
            PlayerHealth = GUIs.LevelModeSelectionScreen.Health;
            SetPlayerHealthBar();
        }

        MonsterHealth85.setVisible(false);
        MonsterHealth71.setVisible(false);
        MonsterHealth57.setVisible(false);
        MonsterHealth42.setVisible(false);
        MonsterHealth28.setVisible(false);
        MonsterHealth14.setVisible(false);
        MonsterHealth0.setVisible(false);

        OpponentTurnBanner.setVisible(false);

        PlayerName.setText(Other.NEAGame.CurrentCharacter.get(0).getNickname());
        MonsterName.setText(Monster);
        MonsterHealth = CurrentMonster.getMonsterHealth();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UseFiveButton = new javax.swing.JButton();
        UseFourButton = new javax.swing.JButton();
        UseThreeButton = new javax.swing.JButton();
        UseTwoButton = new javax.swing.JButton();
        UseOneButton = new javax.swing.JButton();
        NameFive = new javax.swing.JLabel();
        TypeFive = new javax.swing.JLabel();
        BuffFive = new javax.swing.JLabel();
        AmountFive = new javax.swing.JLabel();
        NameFour = new javax.swing.JLabel();
        TypeFour = new javax.swing.JLabel();
        BuffFour = new javax.swing.JLabel();
        AmountFour = new javax.swing.JLabel();
        NameThree = new javax.swing.JLabel();
        TypeThree = new javax.swing.JLabel();
        BuffThree = new javax.swing.JLabel();
        AmountThree = new javax.swing.JLabel();
        NameTwo = new javax.swing.JLabel();
        TypeTwo = new javax.swing.JLabel();
        BuffTwo = new javax.swing.JLabel();
        AmountTwo = new javax.swing.JLabel();
        NameOne = new javax.swing.JLabel();
        TypeOne = new javax.swing.JLabel();
        BuffOne = new javax.swing.JLabel();
        AmountOne = new javax.swing.JLabel();
        ItemTypeButton = new javax.swing.JButton();
        AlphabeticalButton = new javax.swing.JButton();
        BagBackButton = new javax.swing.JButton();
        BagBackground = new javax.swing.JLabel();
        OpponentTurnBanner = new javax.swing.JLabel();
        PlayerTurnBanner = new javax.swing.JLabel();
        FightThreeType = new javax.swing.JLabel();
        FightThreeName = new javax.swing.JLabel();
        FightThreeButton = new javax.swing.JButton();
        FightTwoType = new javax.swing.JLabel();
        FightTwoName = new javax.swing.JLabel();
        FightTwoButton = new javax.swing.JButton();
        FightOneType = new javax.swing.JLabel();
        FightOneName = new javax.swing.JLabel();
        FightOneButton = new javax.swing.JButton();
        FightBackButton = new javax.swing.JButton();
        FightBox = new javax.swing.JLabel();
        YesButton = new javax.swing.JButton();
        NoButton = new javax.swing.JButton();
        BattleQuitConfirmationBox = new javax.swing.JLabel();
        BagButton = new javax.swing.JButton();
        FightButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PlayerHealth0 = new javax.swing.JLabel();
        PlayerHealth14 = new javax.swing.JLabel();
        PlayerHealth28 = new javax.swing.JLabel();
        PlayerHealth42 = new javax.swing.JLabel();
        PlayerHealth57 = new javax.swing.JLabel();
        PlayerHealth71 = new javax.swing.JLabel();
        PlayerHealth85 = new javax.swing.JLabel();
        PlayerHealth100 = new javax.swing.JLabel();
        PlayerName = new javax.swing.JLabel();
        MonsterHealth0 = new javax.swing.JLabel();
        MonsterHealth14 = new javax.swing.JLabel();
        MonsterHealth28 = new javax.swing.JLabel();
        MonsterHealth42 = new javax.swing.JLabel();
        MonsterHealth57 = new javax.swing.JLabel();
        MonsterHealth71 = new javax.swing.JLabel();
        MonsterHealth85 = new javax.swing.JLabel();
        MonsterHealth100 = new javax.swing.JLabel();
        MonsterName = new javax.swing.JLabel();
        StickM = new javax.swing.JLabel();
        StickF = new javax.swing.JLabel();
        StickNB = new javax.swing.JLabel();
        Spider = new javax.swing.JLabel();
        Vampire = new javax.swing.JLabel();
        Bat = new javax.swing.JLabel();
        Spirit = new javax.swing.JLabel();
        Zombie = new javax.swing.JLabel();
        Ghost = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        UseFiveButton.setBorderPainted(false);
        UseFiveButton.setContentAreaFilled(false);
        UseFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseFiveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseFiveButton);
        UseFiveButton.setBounds(1409, 845, 210, 100);

        UseFourButton.setBorderPainted(false);
        UseFourButton.setContentAreaFilled(false);
        UseFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseFourButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseFourButton);
        UseFourButton.setBounds(1409, 715, 210, 100);

        UseThreeButton.setBorderPainted(false);
        UseThreeButton.setContentAreaFilled(false);
        UseThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseThreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseThreeButton);
        UseThreeButton.setBounds(1409, 585, 210, 100);

        UseTwoButton.setBorderPainted(false);
        UseTwoButton.setContentAreaFilled(false);
        UseTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseTwoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseTwoButton);
        UseTwoButton.setBounds(1410, 450, 210, 100);

        UseOneButton.setBorderPainted(false);
        UseOneButton.setContentAreaFilled(false);
        UseOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseOneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UseOneButton);
        UseOneButton.setBounds(1409, 325, 210, 100);

        NameFive.setText("----");
        getContentPane().add(NameFive);
        NameFive.setBounds(370, 890, 170, 16);

        TypeFive.setText("----");
        getContentPane().add(TypeFive);
        TypeFive.setBounds(670, 890, 120, 16);

        BuffFive.setText("----");
        getContentPane().add(BuffFive);
        BuffFive.setBounds(950, 890, 140, 16);

        AmountFive.setText("----");
        getContentPane().add(AmountFive);
        AmountFive.setBounds(1250, 890, 120, 16);

        NameFour.setText("----");
        getContentPane().add(NameFour);
        NameFour.setBounds(370, 750, 140, 16);

        TypeFour.setText("----");
        getContentPane().add(TypeFour);
        TypeFour.setBounds(670, 750, 140, 16);

        BuffFour.setText("----");
        getContentPane().add(BuffFour);
        BuffFour.setBounds(950, 750, 160, 16);

        AmountFour.setText("----");
        getContentPane().add(AmountFour);
        AmountFour.setBounds(1250, 750, 110, 16);

        NameThree.setText("----");
        getContentPane().add(NameThree);
        NameThree.setBounds(370, 620, 140, 16);

        TypeThree.setText("----");
        getContentPane().add(TypeThree);
        TypeThree.setBounds(680, 620, 130, 16);

        BuffThree.setText("----");
        getContentPane().add(BuffThree);
        BuffThree.setBounds(950, 620, 140, 16);

        AmountThree.setText("----");
        getContentPane().add(AmountThree);
        AmountThree.setBounds(1250, 620, 110, 16);

        NameTwo.setText("----");
        getContentPane().add(NameTwo);
        NameTwo.setBounds(380, 490, 100, 16);

        TypeTwo.setText("----");
        getContentPane().add(TypeTwo);
        TypeTwo.setBounds(680, 490, 150, 16);

        BuffTwo.setText("----");
        getContentPane().add(BuffTwo);
        BuffTwo.setBounds(950, 490, 140, 16);

        AmountTwo.setText("----");
        getContentPane().add(AmountTwo);
        AmountTwo.setBounds(1250, 490, 100, 16);

        NameOne.setText("----");
        getContentPane().add(NameOne);
        NameOne.setBounds(380, 380, 100, 20);

        TypeOne.setText("----");
        getContentPane().add(TypeOne);
        TypeOne.setBounds(680, 380, 140, 16);

        BuffOne.setText("----");
        getContentPane().add(BuffOne);
        BuffOne.setBounds(950, 370, 140, 16);

        AmountOne.setText("----");
        getContentPane().add(AmountOne);
        AmountOne.setBounds(1250, 370, 100, 16);

        ItemTypeButton.setBorderPainted(false);
        ItemTypeButton.setContentAreaFilled(false);
        ItemTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTypeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ItemTypeButton);
        ItemTypeButton.setBounds(1209, 135, 350, 80);

        AlphabeticalButton.setBorderPainted(false);
        AlphabeticalButton.setContentAreaFilled(false);
        AlphabeticalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlphabeticalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AlphabeticalButton);
        AlphabeticalButton.setBounds(369, 135, 350, 80);

        BagBackButton.setBorderPainted(false);
        BagBackButton.setContentAreaFilled(false);
        BagBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BagBackButton);
        BagBackButton.setBounds(70, 60, 200, 70);

        BagBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Bag Screen.jpg"))); // NOI18N
        getContentPane().add(BagBackground);
        BagBackground.setBounds(0, 0, 1920, 1090);

        OpponentTurnBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Opponent Turn Banner.png"))); // NOI18N
        getContentPane().add(OpponentTurnBanner);
        OpponentTurnBanner.setBounds(620, 60, 740, 180);

        PlayerTurnBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Player Turn Banner.png"))); // NOI18N
        getContentPane().add(PlayerTurnBanner);
        PlayerTurnBanner.setBounds(620, 60, 740, 180);

        FightThreeType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightThreeType.setText("Type");
        getContentPane().add(FightThreeType);
        FightThreeType.setBounds(1580, 940, 200, 30);

        FightThreeName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightThreeName.setText("Name");
        getContentPane().add(FightThreeName);
        FightThreeName.setBounds(1580, 860, 270, 60);

        FightThreeButton.setBorderPainted(false);
        FightThreeButton.setContentAreaFilled(false);
        FightThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightThreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightThreeButton);
        FightThreeButton.setBounds(1559, 825, 310, 210);

        FightTwoType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightTwoType.setText("Type");
        getContentPane().add(FightTwoType);
        FightTwoType.setBounds(1210, 950, 170, 29);

        FightTwoName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightTwoName.setText("Name");
        getContentPane().add(FightTwoName);
        FightTwoName.setBounds(1210, 870, 260, 50);

        FightTwoButton.setBorderPainted(false);
        FightTwoButton.setContentAreaFilled(false);
        FightTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightTwoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightTwoButton);
        FightTwoButton.setBounds(1179, 825, 310, 210);

        FightOneType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightOneType.setText("Type");
        getContentPane().add(FightOneType);
        FightOneType.setBounds(860, 950, 160, 30);

        FightOneName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightOneName.setText("Name");
        getContentPane().add(FightOneName);
        FightOneName.setBounds(860, 870, 220, 50);

        FightOneButton.setBorderPainted(false);
        FightOneButton.setContentAreaFilled(false);
        FightOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightOneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightOneButton);
        FightOneButton.setBounds(819, 825, 310, 210);

        FightBackButton.setBorderPainted(false);
        FightBackButton.setContentAreaFilled(false);
        FightBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightBackButton);
        FightBackButton.setBounds(769, 735, 100, 50);

        FightBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Fight Box.jpg"))); // NOI18N
        getContentPane().add(FightBox);
        FightBox.setBounds(750, 720, 1170, 354);

        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(800, 570, 60, 40);

        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(1120, 570, 40, 40);

        BattleQuitConfirmationBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Battle Quit Confirmation.jpg"))); // NOI18N
        getContentPane().add(BattleQuitConfirmationBox);
        BattleQuitConfirmationBox.setBounds(740, 330, 510, 310);

        BagButton.setBorderPainted(false);
        BagButton.setContentAreaFilled(false);
        BagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BagButton);
        BagButton.setBounds(1143, 863, 350, 180);

        FightButton.setBorderPainted(false);
        FightButton.setContentAreaFilled(false);
        FightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightButton);
        FightButton.setBounds(760, 860, 360, 190);

        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(1520, 860, 360, 190);

        PlayerHealth0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health0.png"))); // NOI18N
        getContentPane().add(PlayerHealth0);
        PlayerHealth0.setBounds(680, 770, 360, 70);

        PlayerHealth14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health14.2.png"))); // NOI18N
        getContentPane().add(PlayerHealth14);
        PlayerHealth14.setBounds(680, 770, 360, 80);

        PlayerHealth28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health28.5.png"))); // NOI18N
        getContentPane().add(PlayerHealth28);
        PlayerHealth28.setBounds(680, 770, 360, 70);

        PlayerHealth42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health42.8.png"))); // NOI18N
        getContentPane().add(PlayerHealth42);
        PlayerHealth42.setBounds(680, 770, 360, 70);

        PlayerHealth57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health57.1.png"))); // NOI18N
        getContentPane().add(PlayerHealth57);
        PlayerHealth57.setBounds(680, 770, 360, 80);

        PlayerHealth71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health71.4.png"))); // NOI18N
        getContentPane().add(PlayerHealth71);
        PlayerHealth71.setBounds(680, 770, 360, 70);

        PlayerHealth85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health85.7.png"))); // NOI18N
        getContentPane().add(PlayerHealth85);
        PlayerHealth85.setBounds(680, 770, 360, 70);

        PlayerHealth100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health100.png"))); // NOI18N
        getContentPane().add(PlayerHealth100);
        PlayerHealth100.setBounds(680, 770, 360, 70);

        PlayerName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PlayerName.setForeground(new java.awt.Color(255, 255, 255));
        PlayerName.setText("Name");
        getContentPane().add(PlayerName);
        PlayerName.setBounds(800, 740, 180, 44);

        MonsterHealth0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health0.png"))); // NOI18N
        getContentPane().add(MonsterHealth0);
        MonsterHealth0.setBounds(830, 270, 360, 70);

        MonsterHealth14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health14.2.png"))); // NOI18N
        getContentPane().add(MonsterHealth14);
        MonsterHealth14.setBounds(830, 270, 360, 70);

        MonsterHealth28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health28.5.png"))); // NOI18N
        getContentPane().add(MonsterHealth28);
        MonsterHealth28.setBounds(830, 270, 360, 80);

        MonsterHealth42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health42.8.png"))); // NOI18N
        getContentPane().add(MonsterHealth42);
        MonsterHealth42.setBounds(830, 270, 360, 70);

        MonsterHealth57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health57.1.png"))); // NOI18N
        getContentPane().add(MonsterHealth57);
        MonsterHealth57.setBounds(830, 270, 360, 80);

        MonsterHealth71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health71.4.png"))); // NOI18N
        getContentPane().add(MonsterHealth71);
        MonsterHealth71.setBounds(830, 270, 360, 80);

        MonsterHealth85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health85.7.png"))); // NOI18N
        getContentPane().add(MonsterHealth85);
        MonsterHealth85.setBounds(830, 270, 360, 70);

        MonsterHealth100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health100.png"))); // NOI18N
        getContentPane().add(MonsterHealth100);
        MonsterHealth100.setBounds(830, 270, 360, 80);

        MonsterName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MonsterName.setForeground(new java.awt.Color(255, 255, 255));
        MonsterName.setText("Monster");
        getContentPane().add(MonsterName);
        MonsterName.setBounds(960, 240, 390, 50);

        StickM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick M.png"))); // NOI18N
        getContentPane().add(StickM);
        StickM.setBounds(350, 510, 310, 430);

        StickF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick F.png"))); // NOI18N
        getContentPane().add(StickF);
        StickF.setBounds(350, 560, 330, 330);

        StickNB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick NB.png"))); // NOI18N
        getContentPane().add(StickNB);
        StickNB.setBounds(350, 550, 320, 340);

        Spider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Spider.png"))); // NOI18N
        getContentPane().add(Spider);
        Spider.setBounds(1170, 350, 420, 270);

        Vampire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Vampire.png"))); // NOI18N
        getContentPane().add(Vampire);
        Vampire.setBounds(1160, 310, 350, 340);

        Bat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Bat.png"))); // NOI18N
        getContentPane().add(Bat);
        Bat.setBounds(1150, 280, 430, 340);

        Spirit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Spirit.png"))); // NOI18N
        getContentPane().add(Spirit);
        Spirit.setBounds(1160, 310, 360, 320);

        Zombie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Zombie.png"))); // NOI18N
        getContentPane().add(Zombie);
        Zombie.setBounds(1150, 270, 350, 390);

        Ghost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Ghost.png"))); // NOI18N
        getContentPane().add(Ghost);
        Ghost.setBounds(1160, 300, 410, 340);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Forest Battle Background.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1930, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        BattleQuitConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        FightButton.setVisible(true);
        BagButton.setVisible(true);
        ExitButton.setVisible(true);
    }//GEN-LAST:event_NoButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        if (GameType.equals("Domain")) {
            GUIs.DomainSelectionScreen domains = new GUIs.DomainSelectionScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            domains.setSize(WidthSize, HeightSize);
            domains.setVisible(true);
            this.dispose();
        } else if (GameType.equals("Level")) {
            GUIs.LevelModeSelectionScreen levelMode = new GUIs.LevelModeSelectionScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            levelMode.setSize(WidthSize, HeightSize);
            levelMode.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_YesButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        BattleQuitConfirmationBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);

        FightButton.setVisible(false);
        BagButton.setVisible(false);
        ExitButton.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void FightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightButtonActionPerformed
        FightBox.setVisible(true);
        FightBackButton.setVisible(true);
        FightOneButton.setVisible(true);
        FightOneName.setText(ClassAttacks.get(0).getAttackName());
        FightOneName.setVisible(true);
        FightOneType.setText(ClassAttacks.get(0).getAttackType());
        FightOneType.setVisible(true);
        FightTwoButton.setVisible(true);
        FightTwoName.setText(ClassAttacks.get(1).getAttackName());
        FightTwoName.setVisible(true);
        FightTwoType.setText(ClassAttacks.get(1).getAttackType());
        FightTwoType.setVisible(true);
        FightThreeButton.setVisible(true);
        FightThreeName.setText(ClassAttacks.get(2).getAttackName());
        FightThreeName.setVisible(true);
        FightThreeType.setText(ClassAttacks.get(2).getAttackType());
        FightThreeType.setVisible(true);

        FightButton.setVisible(false);
        BagButton.setVisible(false);
        ExitButton.setVisible(false);
    }//GEN-LAST:event_FightButtonActionPerformed

    private void BagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagButtonActionPerformed
        BagBackground.setVisible(true);
        BagBackButton.setVisible(true);
        AlphabeticalButton.setVisible(true);
        ItemTypeButton.setVisible(true);

        FightButton.setVisible(false);
        BagButton.setVisible(false);
        ExitButton.setVisible(false);

        BagSetUp();
    }//GEN-LAST:event_BagButtonActionPerformed

    private void FightBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightBackButtonActionPerformed
        FightBox.setVisible(false);
        FightBackButton.setVisible(false);
        FightOneButton.setVisible(false);
        FightOneName.setVisible(false);
        FightOneType.setVisible(false);
        FightTwoButton.setVisible(false);
        FightTwoName.setVisible(false);
        FightTwoType.setVisible(false);
        FightThreeButton.setVisible(false);
        FightThreeName.setVisible(false);
        FightThreeType.setVisible(false);

        FightButton.setVisible(true);
        BagButton.setVisible(true);
        ExitButton.setVisible(true);
    }//GEN-LAST:event_FightBackButtonActionPerformed

    private void FightOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightOneButtonActionPerformed
        Objects.Attack CurrentAttack = ClassAttacks.get(0);

        if (CurrentAttack.getAttackType().equals("Damage")) {
            int CharacterAttack = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int DamgMulti = CurrentAttack.getDamageMultiplier();
            int TotalAttack = CharacterAttack + DamgMulti;
            if (Buff != 0) {
                TotalAttack = TotalAttack + Buff;
                Buff = 0;
            }
            MonsterHealth = MonsterHealth - TotalAttack;
            SetMonsterHealthBar();
            CheckMonsterHealth();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Heal")) {
            int CharacterHeal = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int HealMulti = CurrentAttack.getDamageMultiplier();
            int TotalHeal = CharacterHeal + HealMulti;
            PlayerHealth = PlayerHealth + TotalHeal;
            SetPlayerHealthBar();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Buff")) {
            Buff = CurrentAttack.getDamageMultiplier();
            PlayerTurn = false;
        }
        Main();
    }//GEN-LAST:event_FightOneButtonActionPerformed

    private void FightTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightTwoButtonActionPerformed
        Objects.Attack CurrentAttack = ClassAttacks.get(1);

        if (CurrentAttack.getAttackType().equals("Damage")) {
            int CharacterAttack = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int DamgMulti = CurrentAttack.getDamageMultiplier();
            int TotalAttack = CharacterAttack + DamgMulti;
            if (Buff != 0) {
                TotalAttack = TotalAttack + Buff;
                Buff = 0;
            }
            MonsterHealth = MonsterHealth - TotalAttack;
            SetMonsterHealthBar();
            CheckMonsterHealth();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Heal")) {
            int CharacterHeal = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int HealMulti = CurrentAttack.getDamageMultiplier();
            int TotalHeal = CharacterHeal + HealMulti;
            PlayerHealth = PlayerHealth + TotalHeal;
            SetPlayerHealthBar();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Buff")) {
            Buff = Buff + CurrentAttack.getDamageMultiplier();
            PlayerTurn = false;
        }
        Main();
    }//GEN-LAST:event_FightTwoButtonActionPerformed

    private void FightThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FightThreeButtonActionPerformed
        Objects.Attack CurrentAttack = ClassAttacks.get(2);

        if (CurrentAttack.getAttackType().equals("Damage")) {
            int CharacterAttack = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int DamgMulti = CurrentAttack.getDamageMultiplier();
            int TotalAttack = CharacterAttack + DamgMulti;
            if (Buff != 0) {
                TotalAttack = TotalAttack + Buff;
                Buff = 0;
            }
            MonsterHealth = MonsterHealth - TotalAttack;
            SetMonsterHealthBar();
            CheckMonsterHealth();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Heal")) {
            int CharacterHeal = rand.nextInt((ClassInformation.getMaxCharacterAttack() - ClassInformation.getMinCharacterAttack()) + 1) + ClassInformation.getMinCharacterAttack();
            int HealMulti = CurrentAttack.getDamageMultiplier();
            int TotalHeal = CharacterHeal + HealMulti;
            PlayerHealth = PlayerHealth + TotalHeal;
            SetPlayerHealthBar();
            PlayerTurn = false;
        } else if (CurrentAttack.getAttackType().equals("Buff")) {
            Buff = CurrentAttack.getDamageMultiplier();
            PlayerTurn = false;
        }
        Main();
    }//GEN-LAST:event_FightThreeButtonActionPerformed

    private void BagBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagBackButtonActionPerformed
        SetBagInvisible();
    }//GEN-LAST:event_BagBackButtonActionPerformed

    private void AlphabeticalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlphabeticalButtonActionPerformed
        String[] Items = Other.Utilities.GetItemsToSort(AllItems, CharacterItems);
        Other.Utilities.SortItems(Items);
        ArrayList<Objects.Item> SortedItems = Other.Utilities.ReturnSortedItems(AllItems);
        DisplaySortedItems(SortedItems);
    }//GEN-LAST:event_AlphabeticalButtonActionPerformed

    private void ItemTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTypeButtonActionPerformed
        String[] Items = Other.Utilities.GetItemTypeToSort(AllItems, CharacterItems);
        Other.Utilities.SortItems(Items);
        ArrayList<Objects.Item>SortedItems = Other.Utilities.ReturnSortedItemTypes(AllItems, CharacterItems);
        DisplaySortedItems(SortedItems);
    }//GEN-LAST:event_ItemTypeButtonActionPerformed

    private void UseOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseOneButtonActionPerformed
        Objects.Item CurrentItem = AllItems.get(CharacterItems.get(0).getItemID()-1);
        
        if (CurrentItem.getBuff().equals("Attack")) {
            Buff = Buff + CurrentItem.getBuffAmount();
        }else if(CurrentItem.getBuff().equals("Health")){
            PlayerHealth = PlayerHealth + CurrentItem.getBuffAmount();
        }
        PlayerTurn = false;
        SetBagInvisible();
        Main();
    }//GEN-LAST:event_UseOneButtonActionPerformed

    private void UseTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseTwoButtonActionPerformed
        Objects.Item CurrentItem = AllItems.get(CharacterItems.get(1).getItemID()-1);
        
        if (CurrentItem.getBuff().equals("Attack")) {
            Buff = Buff + CurrentItem.getBuffAmount();
        }else if(CurrentItem.getBuff().equals("Health")){
            PlayerHealth = PlayerHealth + CurrentItem.getBuffAmount();
        }
        PlayerTurn = false;
        SetBagInvisible();
        Main();
    }//GEN-LAST:event_UseTwoButtonActionPerformed

    private void UseThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseThreeButtonActionPerformed
        Objects.Item CurrentItem = AllItems.get(CharacterItems.get(2).getItemID()-1);
        
        if (CurrentItem.getBuff().equals("Attack")) {
            Buff = Buff + CurrentItem.getBuffAmount();
        }else if(CurrentItem.getBuff().equals("Health")){
            PlayerHealth = PlayerHealth + CurrentItem.getBuffAmount();
        }
        PlayerTurn = false;
        SetBagInvisible();
        Main();
    }//GEN-LAST:event_UseThreeButtonActionPerformed

    private void UseFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseFourButtonActionPerformed
        Objects.Item CurrentItem = AllItems.get(CharacterItems.get(3).getItemID()-1);
        
        if (CurrentItem.getBuff().equals("Attack")) {
            Buff = Buff + CurrentItem.getBuffAmount();
        }else if(CurrentItem.getBuff().equals("Health")){
            PlayerHealth = PlayerHealth + CurrentItem.getBuffAmount();
        }
        PlayerTurn = false;
        SetBagInvisible();
        Main();
    }//GEN-LAST:event_UseFourButtonActionPerformed

    private void UseFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseFiveButtonActionPerformed
        Objects.Item CurrentItem = AllItems.get(CharacterItems.get(4).getItemID()-1);
        
        if (CurrentItem.getBuff().equals("Attack")) {
            Buff = Buff + CurrentItem.getBuffAmount();
        }else if(CurrentItem.getBuff().equals("Health")){
            PlayerHealth = PlayerHealth + CurrentItem.getBuffAmount();
        }
        PlayerTurn = false;
        SetBagInvisible();
        Main();
    }//GEN-LAST:event_UseFiveButtonActionPerformed

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ForestBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForestBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForestBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForestBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForestBattleScreen().setVisible(true);
            }
        });
    }

    private void SetMonsterImageVisible() {
        switch (Monster) {
            case "Ghost":
                Ghost.setVisible(true);
                break;
            case "Arachnid Queen":
                Spider.setVisible(true);
                break;
            case "Vampire Overlord":
                Vampire.setVisible(true);
                break;
            case "Zombie":
                Zombie.setVisible(true);
                break;
            case "Spider":
                Spider.setVisible(true);
                break;
            case "Bat":
                Bat.setVisible(true);
                break;
            case "Spirit":
                Spirit.setVisible(true);
                break;
        }
    }

    private void SetMonsterImageInvisible() {
        switch (Monster) {
            case "Ghost":
                Ghost.setVisible(false);
                break;
            case "Arachnid Queen":
                Spider.setVisible(false);
                break;
            case "Vampire Overlord":
                Vampire.setVisible(false);
                break;
            case "Zombie":
                Zombie.setVisible(false);
                break;
            case "Spider":
                Spider.setVisible(false);
                break;
            case "Bat":
                Bat.setVisible(false);
                break;
            case "Spirit":
                Spirit.setVisible(false);
                break;
        }
    }

    private void SetPlayerImageVisible() {
        String CharacterGender = Other.NEAGame.CurrentCharacter.get(0).getCharacterGender();

        switch (CharacterGender) {
            case "female":
                StickF.setVisible(true);
                break;
            case "male":
                StickM.setVisible(true);
                break;
            case "other":
                StickNB.setVisible(true);
                break;
        }
    }

    private void SetPlayerImageInvisible() {
        String CharacterGender = Other.NEAGame.CurrentCharacter.get(0).getCharacterGender();

        switch (CharacterGender) {
            case "female":
                StickF.setVisible(false);
                break;
            case "male":
                StickM.setVisible(false);
                break;
            case "other":
                StickNB.setVisible(false);
                break;
        }
    }

    private void SetPlayerHealthBar() {
        double PlayerHealthPercentage = (PlayerHealth / ClassInformation.getCharacterHealth()) * 100;

        if (PlayerHealthPercentage >= 85.7) {
            PlayerHealth100.setVisible(true);

            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage >= 71.4 && PlayerHealthPercentage < 85.7) {
            PlayerHealth100.setVisible(false);

            PlayerHealth85.setVisible(true);

            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage >= 57.1 && PlayerHealthPercentage < 71.4) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);

            PlayerHealth71.setVisible(true);

            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage >= 42.8 && PlayerHealthPercentage < 57.1) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);

            PlayerHealth57.setVisible(true);

            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage >= 28.5 && PlayerHealthPercentage < 42.8) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);

            PlayerHealth42.setVisible(true);

            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage >= 14.2 && PlayerHealthPercentage < 28.5) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);

            PlayerHealth28.setVisible(true);

            PlayerHealth14.setVisible(false);
            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage > 0 && PlayerHealthPercentage < 14.2) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);

            PlayerHealth14.setVisible(true);

            PlayerHealth0.setVisible(false);
        } else if (PlayerHealthPercentage <= 0) {
            PlayerHealth100.setVisible(false);
            PlayerHealth85.setVisible(false);
            PlayerHealth71.setVisible(false);
            PlayerHealth57.setVisible(false);
            PlayerHealth42.setVisible(false);
            PlayerHealth28.setVisible(false);
            PlayerHealth14.setVisible(false);

            PlayerHealth0.setVisible(true);
        }
    }

    private void SetMonsterHealthBar() {
        double MonsterHealthPercentage = (MonsterHealth / CurrentMonster.getMonsterHealth()) * 100;

        if (MonsterHealthPercentage >= 85.7) {
            MonsterHealth100.setVisible(true);

            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage >= 71.4 && MonsterHealthPercentage < 85.7) {
            MonsterHealth100.setVisible(false);

            MonsterHealth85.setVisible(true);

            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage >= 57.1 && MonsterHealthPercentage < 71.4) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);

            MonsterHealth71.setVisible(true);

            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage >= 42.8 && MonsterHealthPercentage < 57.1) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);

            MonsterHealth57.setVisible(true);

            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage >= 28.5 && MonsterHealthPercentage < 42.8) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);

            MonsterHealth42.setVisible(true);

            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage >= 14.2 && MonsterHealthPercentage < 28.5) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);

            MonsterHealth28.setVisible(true);

            MonsterHealth14.setVisible(false);
            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage > 0 && MonsterHealthPercentage < 14.2) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);

            MonsterHealth14.setVisible(true);

            MonsterHealth0.setVisible(false);
        } else if (MonsterHealthPercentage <= 0) {
            MonsterHealth100.setVisible(false);
            MonsterHealth85.setVisible(false);
            MonsterHealth71.setVisible(false);
            MonsterHealth57.setVisible(false);
            MonsterHealth42.setVisible(false);
            MonsterHealth28.setVisible(false);
            MonsterHealth14.setVisible(false);

            MonsterHealth0.setVisible(true);
        }
    }

    private void CheckPlayerHealth() {
        if (PlayerHealth == 0 || PlayerHealth < 0) {
            SetPlayerImageInvisible();

            GUIs.FightFailedScreen fightFailed = new GUIs.FightFailedScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            fightFailed.setSize(WidthSize, HeightSize);
            fightFailed.setVisible(true);
            this.dispose();
        }
    }

    private void CheckMonsterHealth() {
        if (MonsterHealth == 0 || MonsterHealth < 0) {
            SetMonsterImageInvisible();
            if (GameType.equals("Domain")) {
                GUIs.DomainSuccessScreen domainSuccess = new GUIs.DomainSuccessScreen();

                int WidthSize = (int) tk.getScreenSize().getWidth();
                int HeightSize = (int) tk.getScreenSize().getHeight();

                domainSuccess.setSize(WidthSize, HeightSize);
                domainSuccess.setVisible(true);
                this.dispose();
            } else if (GameType.equals("Level")) {
                if (GUIs.LevelModeSelectionScreen.Level == 10) {
                    GUIs.WinningScreen winning = new GUIs.WinningScreen();

                    int WidthSize = (int) tk.getScreenSize().getWidth();
                    int HeightSize = (int) tk.getScreenSize().getHeight();

                    winning.setSize(WidthSize, HeightSize);
                    winning.setVisible(true);
                    this.dispose();
                } else {
                    GUIs.LevelModeSelectionScreen.Level++;
                    GUIs.NextLevelScreen nextLevel = new GUIs.NextLevelScreen();

                    int WidthSize = (int) tk.getScreenSize().getWidth();
                    int HeightSize = (int) tk.getScreenSize().getHeight();

                    nextLevel.setSize(WidthSize, HeightSize);
                    nextLevel.setVisible(true);
                    this.dispose();
                }
            }
        }
    }

    private void Main() {

        if (PlayerHealth > 0 && MonsterHealth > 0) {

            if (PlayerTurn == true) {
                PlayerTurnBanner.setVisible(true);
                OpponentTurnBanner.setVisible(false);
                FightButton.setVisible(true);
                BagButton.setVisible(true);
                ExitButton.setVisible(true);
            } else if (PlayerTurn == false) {
                PlayerTurnBanner.setVisible(false);
                OpponentTurnBanner.setVisible(true);

                FightBox.setVisible(false);
                FightBackButton.setVisible(false);
                FightOneButton.setVisible(false);
                FightOneName.setVisible(false);
                FightOneType.setVisible(false);
                FightTwoButton.setVisible(false);
                FightTwoName.setVisible(false);
                FightTwoType.setVisible(false);
                FightThreeButton.setVisible(false);
                FightThreeName.setVisible(false);
                FightThreeType.setVisible(false);

                FightButton.setVisible(false);
                BagButton.setVisible(false);
                ExitButton.setVisible(false);

                int MonsterAttack = rand.nextInt((CurrentMonster.getMaxMonsterAttack() - CurrentMonster.getMinMonsterAttack()) + 1) + CurrentMonster.getMinMonsterAttack();
                PlayerHealth = PlayerHealth - MonsterAttack;
                SetPlayerHealthBar();
                CheckPlayerHealth();
                PlayerTurn = true;
                Main();
            }
        }
    }
    
    private void DisplaySortedItems(ArrayList<Objects.Item> SortedItems){
        int ItemNumber = SortedItems.size();
        
        if (ItemNumber > 5) {
            ItemNumber = 5;
        }
        
        switch (ItemNumber){
            case 1:
                NameOne.setText(SortedItems.get(0).getItemName());
                TypeOne.setText(SortedItems.get(0).getItemType());
                BuffOne.setText(SortedItems.get(0).getBuff());
                AmountOne.setText(Integer.toString(SortedItems.get(0).getBuffAmount()));
                break;
            case 2:
                NameOne.setText(SortedItems.get(0).getItemName());
                TypeOne.setText(SortedItems.get(0).getItemType());
                BuffOne.setText(SortedItems.get(0).getBuff());
                AmountOne.setText(Integer.toString(SortedItems.get(0).getBuffAmount()));
                NameTwo.setText(SortedItems.get(1).getItemName());
                TypeTwo.setText(SortedItems.get(1).getItemType());
                BuffTwo.setText(SortedItems.get(1).getBuff());
                AmountTwo.setText(Integer.toString(SortedItems.get(1).getBuffAmount()));
                break;
            case 3:
                NameOne.setText(SortedItems.get(0).getItemName());
                TypeOne.setText(SortedItems.get(0).getItemType());
                BuffOne.setText(SortedItems.get(0).getBuff());
                AmountOne.setText(Integer.toString(SortedItems.get(0).getBuffAmount()));
                NameTwo.setText(SortedItems.get(1).getItemName());
                TypeTwo.setText(SortedItems.get(1).getItemType());
                BuffTwo.setText(SortedItems.get(1).getBuff());
                AmountTwo.setText(Integer.toString(SortedItems.get(1).getBuffAmount()));
                NameThree.setText(SortedItems.get(2).getItemName());
                TypeThree.setText(SortedItems.get(2).getItemType());
                BuffThree.setText(SortedItems.get(2).getBuff());
                AmountThree.setText(Integer.toString(SortedItems.get(2).getBuffAmount()));
                break;
            case 4:
                NameOne.setText(SortedItems.get(0).getItemName());
                TypeOne.setText(SortedItems.get(0).getItemType());
                BuffOne.setText(SortedItems.get(0).getBuff());
                AmountOne.setText(Integer.toString(SortedItems.get(0).getBuffAmount()));
                NameTwo.setText(SortedItems.get(1).getItemName());
                TypeTwo.setText(SortedItems.get(1).getItemType());
                BuffTwo.setText(SortedItems.get(1).getBuff());
                AmountTwo.setText(Integer.toString(SortedItems.get(1).getBuffAmount()));
                NameThree.setText(SortedItems.get(2).getItemName());
                TypeThree.setText(SortedItems.get(2).getItemType());
                BuffThree.setText(SortedItems.get(2).getBuff());
                AmountThree.setText(Integer.toString(SortedItems.get(2).getBuffAmount()));
                NameFour.setText(SortedItems.get(3).getItemName());
                TypeFour.setText(SortedItems.get(3).getItemType());
                BuffFour.setText(SortedItems.get(3).getBuff());
                AmountFour.setText(Integer.toString(SortedItems.get(3).getBuffAmount()));
                break;
            case 5:
                NameOne.setText(SortedItems.get(0).getItemName());
                TypeOne.setText(SortedItems.get(0).getItemType());
                BuffOne.setText(SortedItems.get(0).getBuff());
                AmountOne.setText(Integer.toString(SortedItems.get(0).getBuffAmount()));
                NameTwo.setText(SortedItems.get(1).getItemName());
                TypeTwo.setText(SortedItems.get(1).getItemType());
                BuffTwo.setText(SortedItems.get(1).getBuff());
                AmountTwo.setText(Integer.toString(SortedItems.get(1).getBuffAmount()));
                NameThree.setText(SortedItems.get(2).getItemName());
                TypeThree.setText(SortedItems.get(2).getItemType());
                BuffThree.setText(SortedItems.get(2).getBuff());
                AmountThree.setText(Integer.toString(SortedItems.get(2).getBuffAmount()));
                NameFour.setText(SortedItems.get(3).getItemName());
                TypeFour.setText(SortedItems.get(3).getItemType());
                BuffFour.setText(SortedItems.get(3).getBuff());
                AmountFour.setText(Integer.toString(SortedItems.get(3).getBuffAmount()));
                NameFive.setText(SortedItems.get(4).getItemName());
                TypeFive.setText(SortedItems.get(4).getItemType());
                BuffFive.setText(SortedItems.get(4).getBuff());
                AmountFive.setText(Integer.toString(SortedItems.get(4).getBuffAmount()));
                break;
        }
    }

    private void BagSetUp() {
        int ItemNumber = CharacterItems.size();

        if (ItemNumber > 5) {
            ItemNumber = 5;
        }

        switch (ItemNumber) {
            case 1:
                NameOne.setVisible(true);
                NameOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemName());
                TypeOne.setVisible(true);
                TypeOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemType());
                BuffOne.setVisible(true);
                BuffOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuff());
                AmountOne.setVisible(true);
                AmountOne.setText(Integer.toString(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuffAmount()));
                UseOneButton.setVisible(true);
                break;
            case 2:
                NameOne.setVisible(true);
                NameOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemName());
                TypeOne.setVisible(true);
                TypeOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemType());
                BuffOne.setVisible(true);
                BuffOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuff());
                AmountOne.setVisible(true);
                AmountOne.setText(Integer.toString(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuffAmount()));
                UseOneButton.setVisible(true);
                NameTwo.setVisible(true);
                NameTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemName());
                TypeTwo.setVisible(true);
                TypeTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemType());
                BuffTwo.setVisible(true);
                BuffTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuff());
                AmountTwo.setVisible(true);
                AmountTwo.setText(Integer.toString(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuffAmount()));
                UseTwoButton.setVisible(true);
                break;
            case 3:
                NameOne.setVisible(true);
                NameOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemName());
                TypeOne.setVisible(true);
                TypeOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemType());
                BuffOne.setVisible(true);
                BuffOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuff());
                AmountOne.setVisible(true);
                AmountOne.setText(Integer.toString(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuffAmount()));
                UseOneButton.setVisible(true);
                NameTwo.setVisible(true);
                NameTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemName());
                TypeTwo.setVisible(true);
                TypeTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemType());
                BuffTwo.setVisible(true);
                BuffTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuff());
                AmountTwo.setVisible(true);
                AmountTwo.setText(Integer.toString(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuffAmount()));
                UseTwoButton.setVisible(true);
                NameThree.setVisible(true);
                NameThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemName());
                TypeThree.setVisible(true);
                TypeThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemType());
                BuffThree.setVisible(true);
                BuffThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuff());
                AmountThree.setVisible(true);
                AmountThree.setText(Integer.toString(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuffAmount()));
                UseThreeButton.setVisible(true);
                break;
            case 4:
                NameOne.setVisible(true);
                NameOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemName());
                TypeOne.setVisible(true);
                TypeOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemType());
                BuffOne.setVisible(true);
                BuffOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuff());
                AmountOne.setVisible(true);
                AmountOne.setText(Integer.toString(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuffAmount()));
                UseOneButton.setVisible(true);
                NameTwo.setVisible(true);
                NameTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemName());
                TypeTwo.setVisible(true);
                TypeTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemType());
                BuffTwo.setVisible(true);
                BuffTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuff());
                AmountTwo.setVisible(true);
                AmountTwo.setText(Integer.toString(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuffAmount()));
                UseTwoButton.setVisible(true);
                NameThree.setVisible(true);
                NameThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemName());
                TypeThree.setVisible(true);
                TypeThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemType());
                BuffThree.setVisible(true);
                BuffThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuff());
                AmountThree.setVisible(true);
                AmountThree.setText(Integer.toString(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuffAmount()));
                UseThreeButton.setVisible(true);
                NameFour.setVisible(true);
                NameFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getItemName());
                TypeFour.setVisible(true);
                TypeFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getItemType());
                BuffFour.setVisible(true);
                BuffFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getBuff());
                AmountFour.setVisible(true);
                AmountFour.setText(Integer.toString(AllItems.get(CharacterItems.get(3).getItemID()-1).getBuffAmount()));
                UseFourButton.setVisible(true);
                break;
            case 5:
                NameOne.setVisible(true);
                NameOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemName());
                TypeOne.setVisible(true);
                TypeOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getItemType());
                BuffOne.setVisible(true);
                BuffOne.setText(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuff());
                AmountOne.setVisible(true);
                AmountOne.setText(Integer.toString(AllItems.get(CharacterItems.get(0).getItemID()-1).getBuffAmount()));
                UseOneButton.setVisible(true);
                NameTwo.setVisible(true);
                NameTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemName());
                TypeTwo.setVisible(true);
                TypeTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getItemType());
                BuffTwo.setVisible(true);
                BuffTwo.setText(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuff());
                AmountTwo.setVisible(true);
                AmountTwo.setText(Integer.toString(AllItems.get(CharacterItems.get(1).getItemID()-1).getBuffAmount()));
                UseTwoButton.setVisible(true);
                NameThree.setVisible(true);
                NameThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemName());
                TypeThree.setVisible(true);
                TypeThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getItemType());
                BuffThree.setVisible(true);
                BuffThree.setText(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuff());
                AmountThree.setVisible(true);
                AmountThree.setText(Integer.toString(AllItems.get(CharacterItems.get(2).getItemID()-1).getBuffAmount()));
                UseThreeButton.setVisible(true);
                NameFour.setVisible(true);
                NameFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getItemName());
                TypeFour.setVisible(true);
                TypeFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getItemType());
                BuffFour.setVisible(true);
                BuffFour.setText(AllItems.get(CharacterItems.get(3).getItemID()-1).getBuff());
                AmountFour.setVisible(true);
                AmountFour.setText(Integer.toString(AllItems.get(CharacterItems.get(3).getItemID()-1).getBuffAmount()));
                UseFourButton.setVisible(true);
                NameFive.setVisible(true);
                NameFive.setText(AllItems.get(CharacterItems.get(4).getItemID()-1).getItemName());
                TypeFive.setVisible(true);
                TypeFive.setText(AllItems.get(CharacterItems.get(4).getItemID()-1).getItemType());
                BuffFive.setVisible(true);
                BuffFive.setText(AllItems.get(CharacterItems.get(4).getItemID()-1).getBuff());
                AmountFive.setVisible(true);
                AmountFive.setText(Integer.toString(AllItems.get(CharacterItems.get(4).getItemID()-1).getBuffAmount()));
                UseFiveButton.setVisible(true);
                break;
        }
    }
    
    private void SetBagInvisible(){
        BagBackground.setVisible(false);
        BagBackButton.setVisible(false);
        AlphabeticalButton.setVisible(false);
        ItemTypeButton.setVisible(false);
        NameOne.setVisible(false);
        TypeOne.setVisible(false);
        BuffOne.setVisible(false);
        AmountOne.setVisible(false);
        UseOneButton.setVisible(false);
        NameTwo.setVisible(false);
        TypeTwo.setVisible(false);
        BuffTwo.setVisible(false);
        AmountTwo.setVisible(false);
        UseTwoButton.setVisible(false);
        NameThree.setVisible(false);
        TypeThree.setVisible(false);
        BuffThree.setVisible(false);
        AmountThree.setVisible(false);
        UseThreeButton.setVisible(false);
        NameFour.setVisible(false);
        TypeFour.setVisible(false);
        BuffFour.setVisible(false);
        AmountFour.setVisible(false);
        UseFourButton.setVisible(false);
        NameFive.setVisible(false);
        TypeFive.setVisible(false);
        BuffFive.setVisible(false);
        AmountFive.setVisible(false);
        UseFiveButton.setVisible(false);
        
        FightButton.setVisible(true);
        BagButton.setVisible(true);
        ExitButton.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlphabeticalButton;
    private javax.swing.JLabel AmountFive;
    private javax.swing.JLabel AmountFour;
    private javax.swing.JLabel AmountOne;
    private javax.swing.JLabel AmountThree;
    private javax.swing.JLabel AmountTwo;
    private javax.swing.JLabel Background;
    private javax.swing.JButton BagBackButton;
    private javax.swing.JLabel BagBackground;
    private javax.swing.JButton BagButton;
    private javax.swing.JLabel Bat;
    private javax.swing.JLabel BattleQuitConfirmationBox;
    private javax.swing.JLabel BuffFive;
    private javax.swing.JLabel BuffFour;
    private javax.swing.JLabel BuffOne;
    private javax.swing.JLabel BuffThree;
    private javax.swing.JLabel BuffTwo;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FightBackButton;
    private javax.swing.JLabel FightBox;
    private javax.swing.JButton FightButton;
    private javax.swing.JButton FightOneButton;
    private javax.swing.JLabel FightOneName;
    private javax.swing.JLabel FightOneType;
    private javax.swing.JButton FightThreeButton;
    private javax.swing.JLabel FightThreeName;
    private javax.swing.JLabel FightThreeType;
    private javax.swing.JButton FightTwoButton;
    private javax.swing.JLabel FightTwoName;
    private javax.swing.JLabel FightTwoType;
    private javax.swing.JLabel Ghost;
    private javax.swing.JButton ItemTypeButton;
    private javax.swing.JLabel MonsterHealth0;
    private javax.swing.JLabel MonsterHealth100;
    private javax.swing.JLabel MonsterHealth14;
    private javax.swing.JLabel MonsterHealth28;
    private javax.swing.JLabel MonsterHealth42;
    private javax.swing.JLabel MonsterHealth57;
    private javax.swing.JLabel MonsterHealth71;
    private javax.swing.JLabel MonsterHealth85;
    private javax.swing.JLabel MonsterName;
    private javax.swing.JLabel NameFive;
    private javax.swing.JLabel NameFour;
    private javax.swing.JLabel NameOne;
    private javax.swing.JLabel NameThree;
    private javax.swing.JLabel NameTwo;
    private javax.swing.JButton NoButton;
    private javax.swing.JLabel OpponentTurnBanner;
    private javax.swing.JLabel PlayerHealth0;
    private javax.swing.JLabel PlayerHealth100;
    private javax.swing.JLabel PlayerHealth14;
    private javax.swing.JLabel PlayerHealth28;
    private javax.swing.JLabel PlayerHealth42;
    private javax.swing.JLabel PlayerHealth57;
    private javax.swing.JLabel PlayerHealth71;
    private javax.swing.JLabel PlayerHealth85;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JLabel PlayerTurnBanner;
    private javax.swing.JLabel Spider;
    private javax.swing.JLabel Spirit;
    private javax.swing.JLabel StickF;
    private javax.swing.JLabel StickM;
    private javax.swing.JLabel StickNB;
    private javax.swing.JLabel TypeFive;
    private javax.swing.JLabel TypeFour;
    private javax.swing.JLabel TypeOne;
    private javax.swing.JLabel TypeThree;
    private javax.swing.JLabel TypeTwo;
    private javax.swing.JButton UseFiveButton;
    private javax.swing.JButton UseFourButton;
    private javax.swing.JButton UseOneButton;
    private javax.swing.JButton UseThreeButton;
    private javax.swing.JButton UseTwoButton;
    private javax.swing.JLabel Vampire;
    private javax.swing.JButton YesButton;
    private javax.swing.JLabel Zombie;
    // End of variables declaration//GEN-END:variables
}
