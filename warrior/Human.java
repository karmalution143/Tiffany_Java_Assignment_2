package warrior;

public class Human extends Warrior {

    private int minHealth = 75;
    private int maxHealth = 150;
    private int minStrength = 100;
    private int maxStrength = 100;
    private int baseDexterity = 75;
    private int bonusDexterity = 50;
    
    public Human() {
        super(); // must be called first!
        super.setHealth(super.randNum.nextInt(maxHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(maxStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + baseDexterity);
    } // constructor
} // class
