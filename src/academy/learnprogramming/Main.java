package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        PasswordReminder passwordReminder = new PasswordReminder(new MySqlConnection());
        passwordReminder.remind();
    }
}
