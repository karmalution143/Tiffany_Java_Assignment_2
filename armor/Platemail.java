package armor;

public class Platemail extends Armor {
    private int armorAmount = 250;
    private int dexterityCost = 250;

    public Platemail() {
        super();
        super.setArmorAmount(armorAmount);
        super.setDexterityCost(dexterityCost);
    }

    public int getFinalDamage(int damage) {
        return damage - (this.armorAmount / 3);
    }
    
}