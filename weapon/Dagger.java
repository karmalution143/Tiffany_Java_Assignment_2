package weapon;

public class Dagger extends Weapon {

    private int damageAmount = 75;
    private int dexterityCost = 10;
    private int baseHitChance = 90;

    public Dagger() {
        super();
        super.setDamageAmount(damageAmount);
        super.setDexterityCost(dexterityCost);
    } // constructor

    public int strike(int attackType, int dexerity, int strength) {
        int damage = 0;
        int roll = super.randNum.nextInt(100) + 1;
        if((roll - attackType) <= baseHitChance) {
            damage = this.damageAmount + (strength / 10) + (attackType * 15);
        }
        else { // miss
            damage = 0;
        }
        return damage;
    }
} // class