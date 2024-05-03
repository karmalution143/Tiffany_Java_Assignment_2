package armor;

public class Chainmail extends Armor {
    private int armorAmount = 150;
    private int dexterityCost = 75;

    public Chainmail() {
        super();
        super.setArmorAmount(armorAmount);
        super.setDexterityCost(dexterityCost);
    } // constructor

    public int getFinalDamage(int damage) {
        return damage-(this.armorAmount / 5);
    }
}
