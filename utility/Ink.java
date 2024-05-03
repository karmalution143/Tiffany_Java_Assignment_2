package utility;
import warrior.*;
import weapon.*;
import armor.*;

public class Ink {
    
    public Ink() {
        // do nothing
    }

    public void Warsim2024() {
        System.out.printf("""
                
        ██     ██  █████  ██████  ███████ ██ ███    ███ 
        ██     ██ ██   ██ ██   ██ ██      ██ ████  ████ 
        ██  █  ██ ███████ ██████  ███████ ██ ██ ████ ██ 
        ██ ███ ██ ██   ██ ██   ██      ██ ██ ██  ██  ██ 
         ███ ███  ██   ██ ██   ██ ███████ ██ ██      ██ 
                                                                         
                """);
        System.out.println("                2   0   2   4                 \n  ");
    }

    public void printWelcomeMessage() {    
        System.out.println("What is your name: ");
    }

    public void printWarriorMenu() {
        System.out.println("\nPick your Warrior: \nHuman(1)\nElf(2)\nOrc(3)");
    }

    public void printWeaponMenu() {
        System.out.println("\nPick your Weapon: \nAxe(1)\nSword(2)\nDagger(3)");
    }

    public void printArmorMenu() {
        System.out.println("\nPick your Armor: \nLeather(1)\nChainmail(2)\nPlatemail(3)");
    }

    public void printStatsArt() {
        System.out.println("\n");
        System.out.printf("""
            +-+-+-+-+-+-+-+ +-+-+-+-+-+
            |W|a|r|r|i|o|r| |S|t|a|t|s|
            +-+-+-+-+-+-+-+ +-+-+-+-+-+
                """);
    }
    public void printStats(Warrior player, Warrior enemy) {
        System.out.printf("%-42s%-42s\n",
            "Player: " + player.getWarriorType(), "Enemy: " + enemy.getWarriorType());
        System.out.printf("%-42s%-42s\n",
            "Player Health: " + player.getHealth(), "Enemy Health: " + enemy.getHealth());
        System.out.printf("%-42s%-42s\n",
            "Player Strength: " + player.getStrength(), "Enemy Strength: " + enemy.getStrength());
        System.out.printf("%-42s%-42s\n",
            "Player Dexterity: " + player.getDexterity(), "Enemy Dexterity: " + enemy.getDexterity());
        System.out.printf("%-42s%-42s\n",
            "Player Weapon: " + player.getWeaponType(), "Enemy Weapon: " + enemy.getWeaponType());
        System.out.printf("%-42s%-42s\n",
            "Player Armor: " + player.getArmorType(), "Enemy Armor: " + enemy.getArmorType());
        System.out.println("****************************************************************");
    }

    public void printHealth(Warrior player, Warrior enemy) {
        System.out.printf("%-30s%-30s\n",
            "Player Health: " + player.getHealth(), "Enemy Health: " + enemy.getHealth());
    }
}