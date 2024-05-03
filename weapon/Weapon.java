package weapon;
import java.util.Random;

public abstract class Weapon {

    private int damageAmount;
    private int dexterityCost;
    protected Random randNum = new Random();
    
    public Weapon() {
        // do nothing
    }

    //============>>
    // GETTERS
    public int getDamageAmount() {
        return this.damageAmount;
    }
    public int getDexterityCost() {
        return this.dexterityCost;
    }
    
    // SETTERS
    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }
    public void setDexterityCost(int dexterityCost) {
        this.dexterityCost = dexterityCost;
    }
    
    public abstract int strike(int attacktType, int dexerity, int strength);
} //class