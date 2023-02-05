package academy.learnprogramming;

public class MySqlConnection implements DBConnection {
    @Override
    public int connect() {
        System.out.println("Connect to MySQL database ...");
        return 1;
    }
}
