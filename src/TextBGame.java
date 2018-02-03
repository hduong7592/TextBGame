import java.util.*;
import things.*;
public class TextBGame{
 
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		String command = "BEGIN";
		Player p = new Player();
		RoomObject[] robjs = new RoomObject[4];
		robjs[0] = new Table();
		robjs[1] = new Chair();
		robjs[2] = new Apple();
		
		//TODO: Set your custom object HERE!
		robjs[3] = new Laptop();

		p.parseCommand("HELP", robjs);
		p.parseCommand("LOOK", robjs);
		
		while(!command.equals("EXIT") && !command.equals("QUIT")){
			System.out.println("\n\n\n");
			System.out.println("Action [Object [with Item]]");
			System.out.println("What do you want to do? ");
			
			command = scn.nextLine().toUpperCase();
			System.out.println("\n");
			p.parseCommand(command, robjs);
		}
	}//end main method

}//end class
