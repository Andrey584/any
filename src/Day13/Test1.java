package Day13;

public class Test1 {
    public static void main(String[] args) {
        User user1 = new User("Андрей");
        User user2 = new User("Ильдар");
        User user3 = new User("Ваня");

        user1.sendMessage(user2, "Привет, БЭЛС!");

        user1.sendMessage(user2, "Когда встретимся?");
        user2.sendMessage(user1, "Как время будет");
        user2.sendMessage(user1,"Пока не знаю" );
        user2.sendMessage(user1, "Делаю курсач");
        user3.sendMessage(user1, "Андрей, как Белка?");
        user3.sendMessage(user1, "Гулял с ней?");
        user3.sendMessage(user1, "Ты дома уже?");
        user1.sendMessage(user3, "Да, гулял");
        user1.sendMessage(user3, "Все норм");
        user1.sendMessage(user3, "Дома, да");
        user3.sendMessage(user1, "Ок, на связи");

        System.out.println(MessageDatabase.getMessages());

        MessageDatabase.showDialog(user1, user3);
    }
}
