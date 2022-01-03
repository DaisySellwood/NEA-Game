package GUIs;

import Other.SQLStatements;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

public class StoryModeBattleScreen extends javax.swing.JFrame {

    Toolkit tk = Toolkit.getDefaultToolkit();
    private static Random rand = new Random();

    public static String FightType;
    private static String Monster;

    private static int PlayerClass = Other.NEAGame.CurrentCharacter.get(0).getClassID();
    private static Objects.CharacterClass ClassInformation = Other.SQLStatements.GetCertainClass(PlayerClass);
    private static ArrayList<Objects.Attack> ClassAttacks = Other.SQLStatements.GetClassAttacks(PlayerClass);
    private static Objects.Monster CurrentMonster;

    private static double PlayerHealth;
    private static double MonsterHealth;
    private static int Buff = 0;

    private static boolean PlayerTurn = true;

    public StoryModeBattleScreen() {
        initComponents();

        BattleQuitConfirmationBox.setVisible(false);
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        if (FightType.equals("Normal")) {
            ArrayList<Objects.Monster> NormalMonsters = SQLStatements.GetNormalMonsters();
            int RandNumber = rand.nextInt(NormalMonsters.size());
            Monster = NormalMonsters.get(RandNumber).getMonsterName();
            CurrentMonster = Other.SQLStatements.GetCertainMonster(Monster);
        } else if (FightType.equals("Boss")) {
            ArrayList<Objects.Monster> BossMonsters = SQLStatements.GetBossMonsters();
            int RandNumber = rand.nextInt(BossMonsters.size());
            Monster = BossMonsters.get(RandNumber).getMonsterName();
            CurrentMonster = Other.SQLStatements.GetCertainMonster(Monster);
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

        PlayerHealth85.setVisible(false);
        PlayerHealth71.setVisible(false);
        PlayerHealth57.setVisible(false);
        PlayerHealth42.setVisible(false);
        PlayerHealth28.setVisible(false);
        PlayerHealth14.setVisible(false);
        PlayerHealth0.setVisible(false);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpponentTurnBanner = new javax.swing.JLabel();
        PlayerTurnBanner = new javax.swing.JLabel();
        NoButton = new javax.swing.JButton();
        YesButton = new javax.swing.JButton();
        BattleQuitConfirmationBox = new javax.swing.JLabel();
        Vampire = new javax.swing.JLabel();
        Spirit = new javax.swing.JLabel();
        Spider = new javax.swing.JLabel();
        Ghost = new javax.swing.JLabel();
        Bat = new javax.swing.JLabel();
        Zombie = new javax.swing.JLabel();
        MonsterName = new javax.swing.JLabel();
        MonsterHealth0 = new javax.swing.JLabel();
        MonsterHealth14 = new javax.swing.JLabel();
        MonsterHealth28 = new javax.swing.JLabel();
        MonsterHealth42 = new javax.swing.JLabel();
        MonsterHealth57 = new javax.swing.JLabel();
        MonsterHealth71 = new javax.swing.JLabel();
        MonsterHealth85 = new javax.swing.JLabel();
        MonsterHealth100 = new javax.swing.JLabel();
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
        FightButton = new javax.swing.JButton();
        BagButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PlayerName = new javax.swing.JLabel();
        PlayerHealth0 = new javax.swing.JLabel();
        PlayerHealth14 = new javax.swing.JLabel();
        PlayerHealth57 = new javax.swing.JLabel();
        PlayerHealth42 = new javax.swing.JLabel();
        PlayerHealth28 = new javax.swing.JLabel();
        PlayerHealth71 = new javax.swing.JLabel();
        PlayerHealth85 = new javax.swing.JLabel();
        PlayerHealth100 = new javax.swing.JLabel();
        StickNB = new javax.swing.JLabel();
        StickM = new javax.swing.JLabel();
        StickF = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        OpponentTurnBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Opponent Turn Banner.png"))); // NOI18N
        getContentPane().add(OpponentTurnBanner);
        OpponentTurnBanner.setBounds(610, 40, 740, 180);

        PlayerTurnBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Player Turn Banner.png"))); // NOI18N
        getContentPane().add(PlayerTurnBanner);
        PlayerTurnBanner.setBounds(610, 40, 740, 180);

        NoButton.setBorderPainted(false);
        NoButton.setContentAreaFilled(false);
        NoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NoButton);
        NoButton.setBounds(1119, 585, 40, 40);

        YesButton.setBorderPainted(false);
        YesButton.setContentAreaFilled(false);
        YesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YesButton);
        YesButton.setBounds(799, 585, 60, 40);

        BattleQuitConfirmationBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Battle Quit Confirmation.jpg"))); // NOI18N
        getContentPane().add(BattleQuitConfirmationBox);
        BattleQuitConfirmationBox.setBounds(740, 340, 510, 310);

        Vampire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Vampire.png"))); // NOI18N
        getContentPane().add(Vampire);
        Vampire.setBounds(1440, 410, 360, 340);

        Spirit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Spirit.png"))); // NOI18N
        getContentPane().add(Spirit);
        Spirit.setBounds(1420, 400, 370, 330);

        Spider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Spider.png"))); // NOI18N
        getContentPane().add(Spider);
        Spider.setBounds(1440, 430, 410, 280);

        Ghost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Ghost.png"))); // NOI18N
        getContentPane().add(Ghost);
        Ghost.setBounds(1410, 390, 410, 340);

        Bat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Bat.png"))); // NOI18N
        getContentPane().add(Bat);
        Bat.setBounds(1410, 360, 430, 350);

        Zombie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Zombie.png"))); // NOI18N
        getContentPane().add(Zombie);
        Zombie.setBounds(1420, 350, 350, 410);

        MonsterName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MonsterName.setForeground(new java.awt.Color(255, 255, 255));
        MonsterName.setText("Name");
        getContentPane().add(MonsterName);
        MonsterName.setBounds(1230, 350, 310, 50);

        MonsterHealth0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health0.png"))); // NOI18N
        getContentPane().add(MonsterHealth0);
        MonsterHealth0.setBounds(1100, 380, 380, 80);

        MonsterHealth14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health14.2.png"))); // NOI18N
        getContentPane().add(MonsterHealth14);
        MonsterHealth14.setBounds(1100, 390, 380, 70);

        MonsterHealth28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health28.5.png"))); // NOI18N
        getContentPane().add(MonsterHealth28);
        MonsterHealth28.setBounds(1100, 380, 360, 80);

        MonsterHealth42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health42.8.png"))); // NOI18N
        getContentPane().add(MonsterHealth42);
        MonsterHealth42.setBounds(1100, 370, 360, 100);

        MonsterHealth57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health57.1.png"))); // NOI18N
        getContentPane().add(MonsterHealth57);
        MonsterHealth57.setBounds(1100, 380, 370, 90);

        MonsterHealth71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health71.4.png"))); // NOI18N
        getContentPane().add(MonsterHealth71);
        MonsterHealth71.setBounds(1100, 380, 360, 80);

        MonsterHealth85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health85.7.png"))); // NOI18N
        getContentPane().add(MonsterHealth85);
        MonsterHealth85.setBounds(1100, 380, 360, 90);

        MonsterHealth100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health100.png"))); // NOI18N
        getContentPane().add(MonsterHealth100);
        MonsterHealth100.setBounds(1100, 380, 360, 90);

        FightThreeType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightThreeType.setText("Type");
        getContentPane().add(FightThreeType);
        FightThreeType.setBounds(1590, 960, 220, 40);

        FightThreeName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightThreeName.setText("Name");
        getContentPane().add(FightThreeName);
        FightThreeName.setBounds(1600, 870, 240, 50);

        FightThreeButton.setBorderPainted(false);
        FightThreeButton.setContentAreaFilled(false);
        FightThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightThreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightThreeButton);
        FightThreeButton.setBounds(1559, 835, 310, 220);

        FightTwoType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightTwoType.setText("Type");
        getContentPane().add(FightTwoType);
        FightTwoType.setBounds(1220, 960, 180, 40);

        FightTwoName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightTwoName.setText("Name");
        getContentPane().add(FightTwoName);
        FightTwoName.setBounds(1220, 870, 240, 50);

        FightTwoButton.setBorderPainted(false);
        FightTwoButton.setContentAreaFilled(false);
        FightTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightTwoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightTwoButton);
        FightTwoButton.setBounds(1179, 835, 310, 220);

        FightOneType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        FightOneType.setText("Type");
        getContentPane().add(FightOneType);
        FightOneType.setBounds(860, 960, 180, 40);

        FightOneName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        FightOneName.setText("Name");
        getContentPane().add(FightOneName);
        FightOneName.setBounds(860, 880, 220, 40);

        FightOneButton.setBorderPainted(false);
        FightOneButton.setContentAreaFilled(false);
        FightOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightOneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightOneButton);
        FightOneButton.setBounds(819, 835, 310, 220);

        FightBackButton.setBorderPainted(false);
        FightBackButton.setContentAreaFilled(false);
        FightBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightBackButton);
        FightBackButton.setBounds(779, 755, 80, 40);

        FightBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Fight Box.jpg"))); // NOI18N
        getContentPane().add(FightBox);
        FightBox.setBounds(750, 730, 1180, 360);

        FightButton.setBorderPainted(false);
        FightButton.setContentAreaFilled(false);
        FightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FightButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FightButton);
        FightButton.setBounds(759, 875, 360, 190);

        BagButton.setBorderPainted(false);
        BagButton.setContentAreaFilled(false);
        BagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BagButton);
        BagButton.setBounds(1139, 875, 360, 190);

        ExitButton.setBorderPainted(false);
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton);
        ExitButton.setBounds(1529, 875, 360, 190);

        PlayerName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PlayerName.setForeground(new java.awt.Color(255, 255, 255));
        PlayerName.setText("Name");
        getContentPane().add(PlayerName);
        PlayerName.setBounds(780, 740, 330, 60);

        PlayerHealth0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health0.png"))); // NOI18N
        getContentPane().add(PlayerHealth0);
        PlayerHealth0.setBounds(650, 780, 370, 80);

        PlayerHealth14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health14.2.png"))); // NOI18N
        getContentPane().add(PlayerHealth14);
        PlayerHealth14.setBounds(650, 780, 360, 80);

        PlayerHealth57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health57.1.png"))); // NOI18N
        getContentPane().add(PlayerHealth57);
        PlayerHealth57.setBounds(650, 780, 360, 80);

        PlayerHealth42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health42.8.png"))); // NOI18N
        getContentPane().add(PlayerHealth42);
        PlayerHealth42.setBounds(650, 780, 370, 80);

        PlayerHealth28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health28.5.png"))); // NOI18N
        getContentPane().add(PlayerHealth28);
        PlayerHealth28.setBounds(650, 770, 370, 90);

        PlayerHealth71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health71.4.png"))); // NOI18N
        getContentPane().add(PlayerHealth71);
        PlayerHealth71.setBounds(650, 780, 360, 80);

        PlayerHealth85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health85.7.png"))); // NOI18N
        getContentPane().add(PlayerHealth85);
        PlayerHealth85.setBounds(650, 780, 360, 80);

        PlayerHealth100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Health100.png"))); // NOI18N
        getContentPane().add(PlayerHealth100);
        PlayerHealth100.setBounds(650, 780, 380, 80);

        StickNB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick NB.png"))); // NOI18N
        getContentPane().add(StickNB);
        StickNB.setBounds(240, 670, 320, 340);

        StickM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick M.png"))); // NOI18N
        getContentPane().add(StickM);
        StickM.setBounds(240, 620, 310, 440);

        StickF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Stick F.png"))); // NOI18N
        getContentPane().add(StickF);
        StickF.setBounds(240, 670, 330, 330);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/Story Mode Battle Background.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1940, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        // GOD HELP THIS BUTTON
        // BRING UP ANOTHER SCREEN ON TOP OF THIS SCREEN WITH THE BAG.
        // FIND A WAY TO BRING UP ITEMS (LIKE I DID WITH SAC SCREEN?)
        // HAVE SORT BUTTONS FOR ALPHABETICAL ORDER AND ITEM TYPE THEN USE RECURSIVE MERGE SORT TO SORT THEM
        // USER WILL ONLY BE ABLE TO USE HEALTH POTIONS.
    }//GEN-LAST:event_BagButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        BattleQuitConfirmationBox.setVisible(true);
        YesButton.setVisible(true);
        NoButton.setVisible(true);

        FightButton.setVisible(false);
        BagButton.setVisible(false);
        ExitButton.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesButtonActionPerformed
        GUIs.DifficultySelectScreen DiffSelec = new GUIs.DifficultySelectScreen();

        int WidthSize = (int) tk.getScreenSize().getWidth();
        int HeightSize = (int) tk.getScreenSize().getHeight();

        DiffSelec.setSize(WidthSize, HeightSize);
        DiffSelec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoButtonActionPerformed
        YesButton.setVisible(false);
        NoButton.setVisible(false);

        FightButton.setVisible(true);
        BagButton.setVisible(true);
        ExitButton.setVisible(true);
    }//GEN-LAST:event_NoButtonActionPerformed

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
    }//GEN-LAST:event_FightThreeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StoryModeBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryModeBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryModeBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryModeBattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoryModeBattleScreen().setVisible(true);
            }
        });

        PlayerHealth = ClassInformation.getCharacterHealth();
        MonsterHealth = CurrentMonster.getMonsterHealth();

        while (PlayerHealth > 0 && MonsterHealth > 0) {

            while (PlayerTurn == true) {
                PlayerTurnBanner.setVisible(true);
                OpponentTurnBanner.setVisible(false);
            }

            while (PlayerTurn == false) {
                System.out.println("Monster Turn"); //for testing 
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
                PlayerTurn = true;
            }

        }

        //LOSE
        if (PlayerHealth == 0 || PlayerHealth < 0) {
            SetPlayerImageInvisible();

            GUIs.FightFailedScreen fightFailed = new GUIs.FightFailedScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            fightFailed.setSize(WidthSize, HeightSize);
            fightFailed.setVisible(true);
            this.dispose();

        }

        //WIN
        if (MonsterHealth == 0 || MonsterHealth < 0) {
            SetMonsterImageInvisible();
            
            if (FightType.equals("Normal")){
              //GO BACK TO CURRENT ROOM IF NORMAL  
            }else if (FightType.equals("Boss")){
            GUIs.StoryModeWinScreen StoryWin = new GUIs.StoryModeWinScreen();

            int WidthSize = (int) tk.getScreenSize().getWidth();
            int HeightSize = (int) tk.getScreenSize().getHeight();

            StoryWin.setSize(WidthSize, HeightSize);
            StoryWin.setVisible(true);
            this.dispose();
            }
        }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BagButton;
    private javax.swing.JLabel Bat;
    private javax.swing.JLabel BattleQuitConfirmationBox;
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
    private javax.swing.JLabel MonsterHealth0;
    private javax.swing.JLabel MonsterHealth100;
    private javax.swing.JLabel MonsterHealth14;
    private javax.swing.JLabel MonsterHealth28;
    private javax.swing.JLabel MonsterHealth42;
    private javax.swing.JLabel MonsterHealth57;
    private javax.swing.JLabel MonsterHealth71;
    private javax.swing.JLabel MonsterHealth85;
    private javax.swing.JLabel MonsterName;
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
    private javax.swing.JLabel Vampire;
    private javax.swing.JButton YesButton;
    private javax.swing.JLabel Zombie;
    // End of variables declaration//GEN-END:variables
}
