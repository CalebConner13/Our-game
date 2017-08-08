//This is the main file for our story

import java.util.Scanner;
public class Story {
	
	public static void main(String[] args) {
		
		Player player1 = new Player(); //created the player
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*Your eyes slowly open to find an old, crazy looking man staring straight at you. You look down and your hands are tied to the armrests of a wooden chair"
        		+ ". You look to the right to see a shabby workbench with various torturous-looking tools on it. You look to the left and see a door. You notice the lack of windows in the room as well "
        		+ "as the strong smell of gasoline");
        System.out.println("Old Tom: Well hello! Welcome to the wonderful world of SOMEPLACE. \nYou're new here... what's your name? "); //first character introduction
        System.out.println("Enter your name: ");
        player1.playerName = scan.nextLine(); //set player name
        
        System.out.println("This is your initial skill composition: \nstr: 0\nper: 0\nend: 0\ncha: 0\nint: 0\n"
        		+ "agl: 0\nlck: 0\nyou have 10 points to spend");
        
        //this works better than what I had but it breaks easier. it doesnt keep track of the amount of skill points which allows the player to enter any amount 
        System.out.println("Strength: ");
        player1.str = scan.nextInt();
        System.out.println("\nPerception: ");
        player1.per = scan.nextInt();
        System.out.println("\nEndurance: ");
        player1.end = scan.nextInt();
        System.out.println("\nCharisma: ");
        player1.cha = scan.nextInt();
        System.out.println("\nIntelligence: ");
        player1.intel = scan.nextInt();
        System.out.println("\nAgility: ");
        player1.agl = scan.nextInt();
        System.out.println("\nLuck: ");
        player1.lck = scan.nextInt();
        
        System.out.println("\nThese are your skills: \nStrength: " + player1.str);
        System.out.println("Perception: " + player1.per);
        System.out.println("Endurance: " + player1.end);
        System.out.println("Charisma: " + player1.cha);
        System.out.println("Intelligence: " + player1.intel);
        System.out.println("Agility: " + player1.agl);
        System.out.println("Luck: " + player1.lck);
 
        System.out.println("\nOld Tom: Do you know why you're here, " + player1.playerName + "?");
        
        scan.close();
        
    }
}