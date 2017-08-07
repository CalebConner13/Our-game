//This is the main file for our story

import java.util.Scanner;
public class Story {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Old Tom: Well hello! Welcome to the wonderful world of SOMEPLACE. \nYou're new here... what's your name? "); //first character introduction
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        Player player1 = new Player(); //created the player
        
        System.out.println("This is your initial skill composition: \nstr: 0\nper: 0\nend: 0\ncha: 0\nint: 0\n"
        		+ "agl: 0\nlck: 0\nyou have 10 points to spend");
        
        System.out.println("Strength: ");
        int str = scan.nextInt();
        System.out.println("\nPerception: ");
        int per = scan.nextInt();
        System.out.println("\nEndurance: ");
        int end = scan.nextInt();
        System.out.println("\nCharisma: ");
        int cha = scan.nextInt();
        System.out.println("\nIntelligence: ");
        int intel = scan.nextInt();
        System.out.println("\nAgility: ");
        int agl = scan.nextInt();
        System.out.println("\nLuck: ");
        int lck = scan.nextInt();
        
        System.out.println("These are your skills: \nStrength: " + str);
        System.out.println("Perception: " + per);
        System.out.println("Endurance: " + end);
        System.out.println("Charisma: " + cha);
        System.out.println("Intelligence: " + intel);
        System.out.println("Agility: " + agl);
        System.out.println("Luck: " + lck);
 
        System.out.println("str: " + player1.str + "\nper: " + player1.per + "\nend: " + player1.end 
        		+ "\nchg: " + player1.cha + "\nint: " + player1.intel + "\nagl: " + player1.agl + "\nlck: " + player1.lck);//print all of the skills 
        System.out.println("Old Tom: Do you know why you're here, " + name + "?");
        
        scan.close();
        
    }
}