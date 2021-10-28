public class Magician extends Hero implements MagicAttack {


    public Magician(){
        physAtt = 5;
        physDef = 0.0;
        magicDef = 0.8;
        magicAtt = 20;


    }

    @Override
    public void magicalAttack(Hero hero) {
        double uron = magicAtt * (1 -  hero.magicDef);
        if(hero.health - uron < 0)
            hero.health = 0;
        else hero.health -= uron;

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
