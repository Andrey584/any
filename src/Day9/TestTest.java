package Day9;

public class TestTest {
    public static void main(String[] args) {

        Airplane samolet = new Airplane("Россия", 2015, 5000, 5);
        Airplane otherSamolet = new Airplane("США", 2016, 4000, 6);
        Airplane.compareAirplanes(samolet, otherSamolet);

    }
}
