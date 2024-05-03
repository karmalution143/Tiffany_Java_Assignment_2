package warrior;

public class Orc extends Warrior {

    private int minHealth = 175;
    private int maxHealth = 250;
    private int minStrength = 200;
    private int maxStrength = 200;
    private int baseDexterity = 50;
    private int bonusDexterity = 50;
    
    public Orc() {
        super(); // must be called first!
        super.setHealth(super.randNum.nextInt(maxHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(maxStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + baseDexterity);
    } // constructor
} // class