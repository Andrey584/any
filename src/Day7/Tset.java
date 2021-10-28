package Day7;

public class Tset {
    public static void main(String[] args) {
        Airplane samolet = new Airplane("ФСБ России", 1980, 50, 30000);
        samolet.setProducer("ФСБ США");
        samolet.setLength(30);
        samolet.setWeight(5000);
        samolet.setYear(2020);
        System.out.println(samolet.fillUp(100));
        System.out.println(samolet.fillUp(200));
        samolet.info();
    }
}
