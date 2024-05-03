package weapon;

public class Sword extends Weapon {

    private int damageAmount = 60;
    private int dexterityCost = 5;
    private int baseHitChance = 80;

    public Sword() {
        super();
        super.setDamageAmount(damageAmount);
        super.setDexterityCost(dexterityCost);
    } // constructor

    public int strike(int attackType, int dexerity, int strength) {
        int damage = 0;
        int roll = super.randNum.nextInt(100) + 1;
        if((roll - attackType * 5) <= baseHitChance) {
            damage = this.damageAmount + (strength / 10) + (attackType * 20);
        }
        else { // miss
            damage = 0;
        }
        return damage;
    }
} // class