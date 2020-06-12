import platform.Database;
import platform.MicrosoftSQLDB;
import platform.MySQLDB;
import ui.AdminInterface;
import ui.UserInterface;

public class Program {
    public static void main(String[] args) {
        {
            Database db = new MySQLDB();
            UserInterface ui = new UserInterface(db);
            ui.login("Max");
            ui.drawInterface();
        }
        {
            Database db = new MySQLDB();
            UserInterface ui = new AdminInterface(db);
            ui.login("Max");
            ui.drawInterface();
        }
        {
            Database db = new MicrosoftSQLDB();
            UserInterface ui = new UserInterface(db);
            ui.login("Max");
            ui.drawInterface();
        }
        {
            Database db = new MicrosoftSQLDB();
            UserInterface ui = new AdminInterface(db);
            ui.login("Max");
            ui.drawInterface();
        }
    }
}
