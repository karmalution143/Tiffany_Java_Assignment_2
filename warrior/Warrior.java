package warrior;
import java.util.Random;

// Abstract makes it a parent!
// also protects it from being instantiated!
public abstract class Warrior {

    // public is open to everyone
    // protected is private outside, public inside
    
    protected Random randNum = new Random();
    private int health;
    private int strength;
    private int dexterity;
    private String warriorType = "";
    private String weaponType = "";
    private String armorType = "";
    

    public Warrior() {
        //do nothing
    }


    //=============>>
    //GETTERS

    public int getHealth() {
        return this.health;
    }
    public int getStrength() {
        return this.strength;
    }
    public int getDexterity() {
        return this.dexterity;
    }
    public String getWarriorType() {
        return this.warriorType;
    }
    public String getWeaponType() {
        return this.weaponType;
    }
    public String getArmorType() {
        return this.armorType;
    }

    //=============>>
    //SETTERS

    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setWarriorType(String warriorType) {
        this.warriorType = warriorType;
    }
    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void takeDamage(int damageAmount) {
        if(damageAmount > 0)
        this.health -= damageAmount;
    }

} // class