package platform;

public class MySQLDB implements Database {
    @Override
    public boolean hasUser(String userName) {
        System.out.printf("SELECT * FROM Users WHERE UserName='%s'\n", userName);
        return true;
    }

    @Override
    public void queryData() {
        System.out.println("SELECT * FROM DataTable LIMIT 10");
    }
}
