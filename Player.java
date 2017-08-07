//This file includes important method data for story.java

public class Player {

	String playerName;
	int str, per, end, cha, intel, agl, lck;
	
	Player() {
		playerName = "";
		str = 0;
		per = 0;
		end = 0;
		cha = 0;
		intel = 0;
		agl = 0;
		lck = 0;
	}

	void setName(String name){ 
		playerName = name;
	}
	
	void updateStats(String stat) { //Breaks if typos?
		switch(stat) {
			case "str+":
				str++;
				break;
			case "per+":
				per++;
				break;
			case "end+":
				end++;
				break;
			case "cha+":
				cha++;
				break;
			case "int+":
				intel++;
				break;
			case "agl+":
				agl++;
				break;
			case "lck+":
				lck++;
				break;
			case "stop":
				break;
			default: 
				System.out.println("Enter correct input!");
		
		}
	}

}