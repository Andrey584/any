package massege;

import java.sql.DatabaseMetaData;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("Andrey");
        User user2 = new User("Vanya");
        User user3 = new User("Ildar");

        user2.subscribe(user1);
        user1.isSubscribed(user2);
        user2.isSubscribed(user1);
    }
}