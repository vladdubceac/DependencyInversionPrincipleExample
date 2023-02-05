package academy.learnprogramming;

public class PasswordReminder {
    private DBConnection dbConnection;
    private boolean isConnectedToDB;

    public PasswordReminder(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    private void connectToDB(){
        int connectResult = dbConnection.connect();
        isConnectedToDB = connectResult > 0;
    }

    public void remind() {
        if(!isConnectedToDB){
            connectToDB();
        }
        System.out.println("Please update password !");
    }
}
