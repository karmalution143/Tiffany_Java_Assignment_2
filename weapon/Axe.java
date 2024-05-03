package weapon;

public class Axe extends Weapon {

    private int damageAmount = 80;
    private int dexterityCost = 20;
    private int baseHitChance = 70; //odds of hitting out of 100


    public Axe() {
        super();
        super.setDamageAmount(damageAmount);
        super.setDexterityCost(dexterityCost);
    } // constructor

    public int strike(int attackType, int dexerity, int strength) {
        int damage = 0;
        int roll = super.randNum.nextInt(100) + 1;
        if((roll - attackType * 5) <= baseHitChance) {
            damage = this.damageAmount + (strength / 10) + (attackType * 10);
        }
        else { // miss
            damage = 0;
        }
        return damage;
    } // strike
} // class