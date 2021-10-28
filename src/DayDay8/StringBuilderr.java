package DayDay8;

public class StringBuilderr {
    public static void main(String[] args) {
        String numbers = " ";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++)
            numbers += i + " ";

        System.out.println(numbers.toString());

        long stopTime = System.currentTimeMillis();


        System.out.println("Длительность первого случая в мс : " + (stopTime - startTime));

        System.out.println("                                   ");

StringBuilder sb = new StringBuilder("");
        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i<=20000; i++){
            sb.append(i).append(" ");

        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Длительность второго случая в мс: "+ (stopTime1 - startTime1));
    }

}
