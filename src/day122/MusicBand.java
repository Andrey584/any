package day122;

public class MusicBand {
    private String namePerson;
    private String nameGroup;
    private int yearGroup;

    public MusicBand(String name, int year, String namePerson){
        this.nameGroup = name;
        this.yearGroup = year;
        this.namePerson = namePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getYearGroup() {
        return yearGroup;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "namePerson='" + namePerson + '\'' +
                ", nameGroup='" + nameGroup + '\'' +
                ", yearGroup=" + yearGroup +
                '}';
    }
}
