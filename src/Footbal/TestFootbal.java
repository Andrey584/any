package Footbal;

public class TestFootbal {
    public static void main(String[] args) {
        Player player1 = new Player(93);
        Player player2 = new Player(97);
        Player player3 = new Player(100);

        Player.info();

        Player player4 = new Player(95);
        Player player5 = new Player(91);
        Player player6 = new Player(94);
        Player player7 = new Player(98);

        Player.info();

        for(int i = 0; i<95; i++){
            player6.run();
        }

        Player.info();
    }
}
