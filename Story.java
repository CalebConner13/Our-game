import java.util.Scanner;
public class Story {
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Old Tom: Well hello! Welcome to the wonderful world of SOMEPLACE. You're here "
        		+ "for a reason, so spill it."); //first character introduction
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        Player player1 = new Player();//created the player
        player1.setName(name);//sets the players name via setter method in Player.java
        
        System.out.println("This is your initial skill composition: \nstr: 0\nper: 0\nend: 0\ncha: 0\nint: 0\n"
        		+ "agl: 0\nlck: 0\nyou have 10 points to spend\ntype 'str+' or 'end+' to add a skill point to the skill you select");
        
        String stat;
        for( int i=10; i>0; i-- ) {//breaks when incorrect input is entered, i.e. typo
        		System.out.println(i + " more points!"); 
	        stat = scan.nextLine();
	        player1.updateStats(stat);//updates the specified skill
        }
        
        System.out.println("str: " + player1.str + "\nper: " + player1.per + "\nend: " + player1.end 
        		+ "\nchg: " + player1.cha + "\nint: " + player1.intel + "\nagl: " + player1.agl + "\nlck: " + player1.lck);//print all of the skills 
        
        scan.close();
        
	}
  
}
