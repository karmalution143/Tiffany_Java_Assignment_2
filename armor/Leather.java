package armor;

public class Leather extends Armor {
    private int armorAmount = 50;
    private int dexterityCost = 50;

    public Leather() {
        super();
        super.setArmorAmount(armorAmount);
        super.setDexterityCost(dexterityCost);
    } // constructor

    public int getFinalDamage(int damage) {
        return damage - (this.armorAmount / 10);
    }
    
}
