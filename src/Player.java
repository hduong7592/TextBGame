import things.*;
public class Player{
	private Item[] inventory;
	public Player(){
		inventory = new Item[10]; //My Pack can hold 10 items
		inventory[0]=new Fork();
		addCustomItem();
	}

	//TODO: Complete the code
	private void addCustomItem(){
		inventory[1]= new Hammer();
	}

	public void parseCommand(String command, RoomObject[] robjs ){
		if(command.equals("EXIT") || command.equals("QUIT")) return;
		if(command.equals("LOOK")){
			System.out.println("You see a: ");
			for(RoomObject ro : robjs)
				if(ro!=null) System.out.println("\t"+ro);
			return;
		}
		if(command.equals("INV")){
			System.out.println("You check your inventory: ");
			for(Item itm : inventory)
				if(itm!=null) System.out.println("\t"+itm);
			return;
		}
		
		
		String[] parts = command.split(" ");
		if(parts.length==1) {
			executeCommand(parts[0], null,null);	
			return;
		}		
		if(parts.length!=2 && parts.length!=4){
			System.out.println("Invalid command structure");
			return;
		}
		
		RoomObject obj=null;
		for(RoomObject ro : robjs)
			if(ro!=null && ro.equals(parts[1]))
				obj=ro;

		if(parts.length==2) {
			executeCommand(parts[0], obj,null);	
			return;
		}
		if(!parts[2].equals("WITH")){
			System.out.println("Invalid command structure: Third word can only be 'with'");
			return;
		}
		Item itm=null;
		for(Item i : inventory){
			if(i!=null && i.equals(parts[3]))
				itm=i;
		}

		executeCommand(parts[0], obj, itm);		
	}


	protected void executeCommand(String command, RoomObject obj, Item itm){
		switch(command){
			case "ATTACKS":
			case "ATTACK":
			case "FIGHT":
			case "PUNCH":
				attack(obj,itm); break;
			case "EAT":
				eat(obj,itm); break;			
			case "SIT":
				sit(obj,itm); break;
			case "HELP":
				System.out.println("You can attack, sit, eat, look, inv, break <OTHER>");
				break;
				
				
			//TODO Add a new case for a given interface			
			case "BREAK" :
				breakit(obj, itm);
				break;
			default:
				System.out.println("That is not an available action");
		}
	}


	private void attack(RoomObject ro, Item itm){
		if(ro==null){
			System.out.println("You punch at an invisible person");
		} else if(ro instanceof Attackable){
			((Attackable)ro).attack(itm);
		} else {
			System.out.println("You can't attack "+ro);
		}
	}


	private void eat(RoomObject ro, Item itm){
		if(ro==null){
			System.out.println("You wish you had something to eat...so hungry");
		} else if(ro instanceof Eatable){
			((Eatable)ro).eat(itm);
		} else {
			System.out.println("You can't eat "+ro+", gross");
		}
	}

	private void sit(RoomObject ro, Item itm){
		if(ro==null){
			System.out.println("You sit on the ground");
		} else if(ro instanceof Sitable){
			((Sitable)ro).sit(itm);
		} else {
			System.out.println("You can't sit on "+ro);
		}
	}

	//TODO: Complete the custom method
	private void breakit(RoomObject ro, Item itm){
		if(ro==null){
			System.out.println("You break nothing.");
		} else if(ro instanceof Breakable){
			((Breakable)ro).breakit(itm);
		} else if(ro instanceof Eatable){
			((Eatable)ro).eat(itm);
		} else {
			System.out.println("You should not break the "+ro);
		}
	}

}//end class
