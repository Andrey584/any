public class Shaman extends Hero implements MagicAttack, Healer{
private final static int HEAL_HIMSELF = 50;
private final static int HEAL_TEAMMATE = 30;


    public Shaman(){
        magicAtt = 15;
        physAtt = 10;
        physDef = 0.2;
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
    public void magicalAttack(Hero hero) {
double uron = magicAtt * (1 - hero.magicDef);
if(hero.health - uron < 0)
    hero.health = 0;
else hero.health -= uron;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
