package Footbal;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;

    private static int countPlayers;

    public Player(int stamina) {
        if (countPlayers < 6) {
            this.stamina = stamina;
            countPlayers++;
        } else
            System.out.println("В команде не может быть больше шести игроков!");
    }


        public int getStamina () {
            return stamina;
        }

        public static int getCountPlayers () {
            return countPlayers;
        }

        public void run() {

            if (stamina == 0) {
                countPlayers--;
                return;
            }

            if (stamina > 0)
                stamina--;

        }
        public static void info() {
            if (countPlayers < 6)
                System.out.println("Команды неполные. Необходимо вывести на поле еще " + (6 - countPlayers) + " игроков.");
            else
                System.out.println("Нет свободных мест на поле");
        }

    }
