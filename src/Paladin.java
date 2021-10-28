public class Paladin extends Hero implements Healer{
    private final static int HEAL_HIMSELF = 25;
    private final static int HEAL_TEAMMATE = 10;

    public Paladin(){

        physAtt = 15;
        physDef = 0.5;
       magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if(health + HEAL_HIMSELF > MAX_HEALTH)
            health = 100;
        else health += HEAL_HIMSELF;

    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + HEAL_TEAMMATE > MAX_HEALTH)
            hero.health = 100;
        else hero.health += HEAL_TEAMMATE;

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
