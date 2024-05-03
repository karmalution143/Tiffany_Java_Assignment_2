package armor;

public abstract class Armor {
    private int armorAmount;
    private int dexterityCost;

    public Armor() {
        //do nothing
    }

    // GETTERS
    public int getArmorAmount() {
        return this.armorAmount;
    }
    public int getDexterityCost() {
        return this.dexterityCost;
    }

    public abstract int getFinalDamage(int damage);

    // SETTERS
    public void setArmorAmount(int armorAmount) {
        this.armorAmount = armorAmount;
    }
    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }
}
