package Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SQLStatements {

    public static String DatabaseLocation = System.getProperty("user.dir") + "\\NEADatabase.accdb";

    private static Objects.User CurrentUser;
    private static Objects.Monster CertainMonster;
    private static Objects.CharacterClass CertainClass;

    // <editor-fold defaultstate="collapsed" desc="Basic Methods">
    public static Connection getConnection() {
        try {
            Connection connection;
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            System.out.println("Connected Successfully");
            return connection;
        } catch (Exception e) {
            System.out.println("Error in connection: " + e);
        }
        return null;
    }

    public static ResultSet ExecuteQuery(String sql, Connection connection) {
        try {

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(sql);

            statement.close();
            return resultSet;
        } catch (Exception e) {
            System.out.println("Error with the ExecuteQuery: " + e);
            return null;
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statments To Do With The Users Table">
    public static ArrayList<String> GetExistingUsernames() {
        ArrayList<String> ExistingUsernames = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT Username FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, connection);
            while (resultSet.next()) {
                ExistingUsernames.add(resultSet.getString("Username"));
            }
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error with finding the unique username: " + e);
            return null;
        }
        return ExistingUsernames;
    }

    public static ArrayList<String> GetExistingEmails() {
        ArrayList<String> ExistingEmails = new ArrayList<>();

        try {
            Connection connection = getConnection();
            String sql = "SELECT Email FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                ExistingEmails.add(resultSet.getString("Email"));
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with finding unique emails: " + e);
            return null;
        }
        return ExistingEmails;
    }

    public static void AddNewUser(Objects.User user) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Users";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                resultSet.moveToInsertRow();
                resultSet.updateString("Username", user.getUsername());
                resultSet.updateString("Email", user.getEmail());
                resultSet.updateString("Password", user.getPassword());
                resultSet.updateString("JoinDate", user.getJoinDate());
                resultSet.insertRow();
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with adding new user: " + e);
        }
    }

    public static boolean UserLogin(String username, String EnteredPassword, String EnteredEmail) {

        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Users WHERE Username = '" + username + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                Objects.User CurrentUser = new Objects.User(resultSet.getString("Username"), resultSet.getString("Email"), resultSet.getString("Password"), resultSet.getString("JoinDate"));
                String HashedEnteredPassword = Other.Utilities.GetHashedPassword(EnteredPassword);
                boolean check = Other.Utilities.ComparePasswords(HashedEnteredPassword, CurrentUser.getPassword());
                if (check == false) {
                    resultSet.close();
                    connection.close();
                    return false;
                }
                check = Other.Utilities.CompareEmails(CurrentUser.getEmail(), EnteredEmail);
                if (check == false) {
                    resultSet.close();
                    connection.close();
                    return false;
                }
                resultSet.close();
                connection.close();
                return true;
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with login SQL: " + e);
            return false;
        }
        return CurrentUser != null;

    }

    public static void UpdateUser(Objects.User user, String Username) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Users WHERE Username='" + Username + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                resultSet.moveToInsertRow();
                resultSet.updateString("Username", user.getUsername());
                resultSet.updateString("Email", user.getEmail());
                resultSet.updateString("Password", user.getPassword());
                resultSet.updateString("JoinDate", user.getJoinDate());
                resultSet.updateRow();
            }
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error with updating user: " + e);
        }
    }

    public static String GetJoinDate(String Username) {
        String JoinDate = null;
        try {
            Connection connection = getConnection();
            String sql = "SELECT JoinDate FROM Users WHERE Username='" + Username + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                JoinDate = resultSet.getString("JoinDate");
                resultSet.close();
                connection.close();
                return JoinDate;
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with gettng join date: " + e);
        }
        return JoinDate;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Characters Table">
    public static void AddNewCharacter(Objects.Character character) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Characters";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                resultSet.moveToInsertRow();
                //Primary Key - auto number
                resultSet.updateString("Username", character.getUsername());
                resultSet.updateString("Nickname", character.getNickname());
                resultSet.updateString("CharacterGender", character.getCharacterGender());
                resultSet.updateInt("ClassID", character.getClassID());
                resultSet.updateInt("DomainAmount", character.getDomainAmount());
                resultSet.updateString("LastDomainDate", character.getLastDomainDate());
                resultSet.updateInt("HighScore", character.getHighScore());
                resultSet.insertRow();
            }

            System.out.println("Added successfully"); // for testing 

            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with adding new character: " + e);
        }
    }

    public static int CountingCharacters(String Username) {
        int CharacterNumber = -1;

        try {
            Connection connection = getConnection();
            String sql = "SELECT COUNT (*) AS myInt FROM Characters WHERE Username='" + Username + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                CharacterNumber = resultSet.getInt("myInt");
            }

            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with counting characters: " + e);
        }

        return CharacterNumber;
    }

    public static ArrayList<Objects.Character> GetAllUserCharacters(String Username) {
        ArrayList<Objects.Character> UserCharacters = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Characters WHERE Username='" + Username + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                Objects.Character UserCharacter = new Objects.Character(resultSet.getInt("CharacterID"), resultSet.getString("Username"), resultSet.getString("Nickname"), resultSet.getString("CharacterGender"), resultSet.getInt("ClassID"), resultSet.getInt("DomainAmount"), resultSet.getString("LastDomainDate"), resultSet.getInt("HighScore"));
                UserCharacters.add(UserCharacter);
            }
            resultSet.close();
            connection.close();
            return UserCharacters;
        } catch (Exception e) {
            System.out.println("Error with getting all user characters: " + e);
            return null;
        }
    }

    public static void UpdateCharacter(Objects.Character character, String Username) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Characters WHERE CharacterID='" + character.getCharacterID() + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                resultSet.moveToInsertRow();
                //CharacterID - autonumber?
                resultSet.updateInt("CharacterID", character.getCharacterID());
                resultSet.updateString("Username", character.getUsername());
                resultSet.updateString("Nickname", character.getNickname());
                resultSet.updateString("CharacterGender", character.getCharacterGender());
                resultSet.updateInt("ClassID", character.getClassID());
                resultSet.updateInt("DomainAmount", character.getDomainAmount());
                resultSet.updateString("LastDomainDate", character.getLastDomainDate());
                resultSet.updateInt("HighScore", character.getHighScore());
                resultSet.updateRow();
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with updating character: " + e);
        }
    }

    public static ArrayList<Objects.Character> GetAllCharacters() {
        ArrayList<Objects.Character> AllCharacters = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Characters";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                Objects.Character NextCharacter = new Objects.Character(resultSet.getInt("CharacterID"), resultSet.getString("Username"), resultSet.getString("Nickname"), resultSet.getString("CharacterGender"), resultSet.getInt("ClassID"), resultSet.getInt("DomainAmount"), resultSet.getString("LastDomainDate"), resultSet.getInt("HighScore"));
                AllCharacters.add(NextCharacter);
            }
            resultSet.close();
            connection.close();
            return AllCharacters;
        } catch (Exception e) {
            System.out.println("Error getting all characters in SQL statments: " + e);
            return null;
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Monsters Table">
    public static ArrayList<Objects.Monster> GetNormalMonsters() {
        ArrayList<Objects.Monster> NormalMonsters = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Monsters WHERE MonsterType = 'Normal'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                Objects.Monster NextMonster = new Objects.Monster(resultSet.getInt("MonsterID"), resultSet.getString("MonsterName"), resultSet.getInt("MonsterHealth"), resultSet.getInt("MaxMonsterAttack"), resultSet.getInt("MinMonsterAttack"), resultSet.getString("MonsterType"));
                NormalMonsters.add(NextMonster);
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with getting normal monsters: " + e);
        }

        return NormalMonsters;

    }
    
    public static ArrayList<Objects.Monster> GetBossMonsters(){
        ArrayList<Objects.Monster> BossMonsters = new ArrayList<>();
        try{
            Connection connection = getConnection();
            String sql = "SELECT * FROM Monsters WHERE MonsterType = 'Boss'";
            ResultSet resultSet = ExecuteQuery(sql, connection);
            
            while (resultSet.next()) {
                Objects.Monster NextMonster = new Objects.Monster(resultSet.getInt("MonsterID"), resultSet.getString("MonsterName"), resultSet.getInt("MonsterHealth"), resultSet.getInt("MaxMonsterAttack"), resultSet.getInt("MinMonsterAttack"), resultSet.getString("MonsterType"));
                BossMonsters.add(NextMonster);
            }
            resultSet.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with getting boss monsters in SQL class: "+e);
        }
        
        return BossMonsters;
    }

    public static Objects.Monster GetCertainMonster(String Name) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Monsters WHERE MonsterName='" + Name + "'";
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                CertainMonster = new Objects.Monster(resultSet.getInt("MonsterID"), resultSet.getString("MonsterName"), resultSet.getInt("MonsterHealth"), resultSet.getInt("MaxMonsterAttack"), resultSet.getInt("MinMonsterAttack"), resultSet.getString("MonsterType"));
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with getting certain monsters: " + e);
        }
        return CertainMonster;
    }

    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Attacks Table">
    public static ArrayList<Objects.Attack> GetClassAttacks(int ClassID) {
        ArrayList<Objects.Attack> ClassAttacks = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Attacks WHERE CLassID =" + ClassID;
            ResultSet resultSet = ExecuteQuery(sql, connection);

            while (resultSet.next()) {
                Objects.Attack NextAttack = new Objects.Attack(resultSet.getInt("AttackID"), resultSet.getString("AttackName"), resultSet.getString("AttackType"), resultSet.getInt("ClassID"), resultSet.getInt("DamageMultiplier"));
                ClassAttacks.add(NextAttack);
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with getting class attacks in SQLStatements: " + e);
        }
        return ClassAttacks;
    }

    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With CharacterClass Table">
    public static Objects.CharacterClass GetCertainClass(int ClassID) {
        try {
            Connection connection = getConnection();
            String sql = "SELECT * FROM Classes WHERE ClassID =" + ClassID;
            ResultSet resultSet = ExecuteQuery(sql, connection);

            if (resultSet.next()) {
                CertainClass = new Objects.CharacterClass(resultSet.getInt("ClassID"), resultSet.getString("ClassName"), resultSet.getInt("CharacterHealth"), resultSet.getInt("MaxCharacterAttack"), resultSet.getInt("MinCharacterAttack"));
            }
            resultSet.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error with Get a certain class in SQLStatements: " + e);
        }
        return CertainClass;
    }

    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With Items Table">
    public static ArrayList<Objects.Item> GetAllDomainItems(String DomainType){
        ArrayList<Objects.Item> DomainItems = new ArrayList<>();
        try{
            Connection connection = getConnection();
            String sql = "SELECT * FROM Items WHERE Domain = '"+DomainType+"'";
            ResultSet resultSet = ExecuteQuery(sql, connection);
            
            while (resultSet.next()){
                Objects.Item NextItem = new Objects.Item(resultSet.getInt("ItemID"), resultSet.getString("ItemName"), resultSet.getString("ItemType"), resultSet.getString("Buff"), resultSet.getInt("BuffAmount"), resultSet.getString("Domain"));
                DomainItems.add(NextItem);
            }
            resultSet.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with getting all domain items in SQL class: "+e);
        }
        return DomainItems;
    }
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SQL Statements To Do With CharacterItems Table">
    public static void AddNewCharacterItem(Objects.CharacterItem CharacterItem){
        try{
            Connection connection = getConnection();
            String sql = "SELECT * FROM CharacterItems";
            ResultSet resultSet = ExecuteQuery(sql, connection);
            
            if(resultSet.next()){
                resultSet.moveToInsertRow();
                //Primary Key - auto number
                resultSet.updateInt("CharacterID", CharacterItem.getCharacterID());
                resultSet.updateInt("ItemID", CharacterItem.getItemID());
                resultSet.insertRow();
            }
            
            System.out.println("Added successfully"); // for testing 
            
            resultSet.close();
            connection.close();
        }
        catch (Exception e){
            System.out.println("Error with adding new character item in SQL class "+e);
        }
    }
    //</editor-fold>
}
