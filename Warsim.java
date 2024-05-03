import warrior.*;
import weapon.*;
import armor.*;
import utility.*;
import java.util.Scanner;
import java.util.Random;


public class Warsim {

    public static Scanner input = new Scanner(System.in);
    public static Random randNum = new Random();
    public static Ink ink = new Ink();
    public static int maxRounds = 10;
    
    public static Warrior player; //player
    public static Weapon pWeapon; // player weapon
    public static Armor pArmor; // player armor

    public static Warrior enemy; // enemy
    public static Weapon eWeapon; // enemy weapon
    public static Armor eArmor; // enemy armor

    // Game Vars
    public static boolean gameOver = false;
    public static boolean playerTurn = true;
    public static String who = "Player";
    public static String winner = "";
    public static int choice = 0;
    public static int attackType = 0;
    public static int damage = 0;
    public static int roundCount = 0;
    

    // ===============>>
    // main method
    public static void main(String[] args) {

        ink.Warsim2024();

        //================>>
        // Character Setup
        
        ink.printWelcomeMessage();
        String name = input.nextLine();

        System.out.println("\nWelcome " + name);

        //Player Creation
        // Warrior
        ink.printWarriorMenu();
        int choice = input.nextInt();
        createWarrior(who, choice);

        // Weapon
        ink.printWeaponMenu();
        choice = input.nextInt();
        createWeapon(who, choice);

        
        // Armor
        ink.printArmorMenu();
        choice = input.nextInt();
        createArmor(who, choice);
        
        // set who to Enemy
        who = "Enemy";

        // Enemy Creation
        // Warrior
        choice = randNum.nextInt(3) + 1;
        createWarrior(who, choice);

        // Weapon
        choice = randNum.nextInt(3) + 1;
        createWeapon(who, choice);

        // Armor
        choice = randNum.nextInt(3) + 1;
        createArmor(who, choice);

        ink.printStatsArt();
        ink.printStats(player, enemy);

        //================>>
        //Main Game Loop
        while(!gameOver && roundCount <= maxRounds) {
            if(playerTurn) {
                // player code
                System.out.println("\nPlayer Turn! Choose Attack Type: Normal(1) Heavy(2)");

                attackType = input.nextInt();
                damage = pWeapon.strike(attackType,
                    player.getDexterity(),
                    player.getStrength());

                damage = eArmor.getFinalDamage(damage);

                System.out.println("\nDamage to Enemy: " + damage);

                enemy.takeDamage(damage);

                ink.printHealth(player, enemy);
                
                if(enemy.getHealth() <= 0) {
                    winner = "Player";
                    gameOver = !gameOver;
                }
                playerTurn = !playerTurn; // toggles player turn
                
            } // if

                else {
                    // enemy code
                    System.out.println("\nEnemy Turn! Choose Attack Type: Normal(1) Heavy(2)");
                    
                    attackType = input.nextInt();
                    damage = eWeapon.strike(attackType,
                        enemy.getDexterity(),
                        enemy.getStrength());

                    damage = pArmor.getFinalDamage(damage);

                    System.out.println("\nDamage to Player: " + damage);

                    player.takeDamage(damage);

                    ink.printHealth(player, enemy);

                if(player.getHealth() <= 0) {
                    winner = "Enemy";
                    gameOver = !gameOver;
                     // toggles player turn  
                }
                playerTurn = !playerTurn;
            } //else

            roundCount++;

            if (roundCount > maxRounds) {
                System.out.println("\nThis match ends in a Draw!");
            }
            else if (gameOver) {
                System.out.println("\nWinner is " + winner);
            }
        } // while

        System.out.println("GAME OVER");
    } // main
    
    //============>>
    // Helper Methods
    public static void createWarrior(String who, int choice) {
        switch (choice) {
            case 1:
            if(who.equals("Player")) {
                player = new Human();
                player.setWarriorType("Human");
            }
            else {
                enemy = new Human();
                enemy.setWarriorType("Human");
            }
                break;
            case 2:
            if(who.equals("Player")) {
                player = new Elf();
                player.setWarriorType("Elf");
            }
            else{
                enemy = new Elf();
                enemy.setWarriorType("Elf");
            }
                break;
            case 3:
            if(who.equals("Player")) {
                player = new Orc();
                player.setWarriorType("Orc");
            }
            else {
                enemy = new Orc();
                enemy.setWarriorType("Orc");
            }
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid option.");
                break;
        } // switch
    } // createWarrior

    public static void createWeapon(String who, int choice) {
        switch (choice) {
            case 1:
            if(who.equals("Player")) {
                pWeapon = new Axe();
                player.setWeaponType("Axe");
            }
            else {
                eWeapon = new Axe();
                enemy.setWeaponType("Axe");
            }
                break;
            case 2:
            if(who.equals("Player")) {    
                pWeapon = new Dagger();
                player.setWeaponType("Dagger");
            }
            else {
                eWeapon = new Dagger();
                enemy.setWeaponType("Dagger");
            }
                break;
            case 3:
            if(who.equals("Player")) { 
                pWeapon = new Sword();
                player.setWeaponType("Sword");
            }
            else {
                eWeapon = new Sword();
                enemy.setWeaponType("Sword");
            }
                break;
            default:
                System.out.println("Oops!");
                break;
        } // switch
    } // createWeapon

    public static void createArmor(String who, int choice) {
        switch(choice) {
            case 1: // Leather
            if(who.equals("Player")) {
                pArmor = new Leather();
                player.setArmorType("Leather");
            }
            else {
                eArmor = new Leather();
                enemy.setArmorType("Leather");
            }
                break;
            case 2: // Chainmail
            if(who.equals("Player")) {
                pArmor = new Chainmail();
                player.setArmorType("Chainmail");
            }
            else {
                eArmor = new Chainmail();
                enemy.setArmorType("Chainmail");
            }
                break;
            case 3: //Platemail
            if(who.equals("Player")) {
                pArmor = new Platemail();
                player.setArmorType("Platemail");
            }
            else {
                eArmor = new Platemail();
                enemy.setArmorType("Platemail");
            }
                break;
            default:
                System.out.println("Oops!");
                break;
        } // switch
    } // createArmor
    
} // class
