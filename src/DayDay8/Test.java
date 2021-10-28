package DayDay8;


public class Test {
    public static void main(String[] args) {
        Airplane samolet = new Airplane("Россия", 2015, 5000, 5);
        Airplane otherSamolet = new Airplane("США", 2016, 4000, 6);



        System.out.println(samolet);
        System.out.println(samolet.fillUp(200));
        System.out.println(otherSamolet);
        System.out.println(otherSamolet.fillUp(300));
    }
}
