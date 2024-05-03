package warrior;

public class Elf extends Warrior {
    
    private int minHealth = 50;
    private int maxHealth = 100;
    private int minStrength = 50;
    private int maxStrength = 100;
    private int baseDexterity = 300;
    private int bonusDexterity = 150;
    
    public Elf() {
        super(); // must be called first!
        super.setHealth(super.randNum.nextInt(maxHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(maxStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + baseDexterity);
    } // constructor
} // class
