public abstract class Hero implements PhysAttack {
    protected final static int MAX_HEALTH = 100;
    protected final static int MIN_HEALTH = 0;
    protected int magicAtt;
    protected int physAtt;
    protected double physDef;
    protected double magicDef;
    protected int health;



    public Hero(){
        this.health = 100;
    }


    @Override
    public void physicalAttack(Hero hero) {
        double uron = physAtt * (1 - hero.physDef);
        if(hero.health - uron < 0)
            hero.health = 0;
        else hero.health -= uron;
    }
}
