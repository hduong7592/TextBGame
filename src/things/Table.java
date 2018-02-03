package things;
public class Table extends RoomObject implements Attackable, Sitable{
	public Table(){
		super("TABLE");
	}
	public void attack(Item itm){
		if(itm==null){
			System.out.println("You punch the table, its hard and now your hand hurts");
		} else if(itm instanceof Weaponizable){
			System.out.println("You attack the table with "+itm);
			((Weaponizable)itm).weaponUse();
		} else {
			System.out.println(itm+" is not very effective");
		}
	}
	public void sit(Item itm){
		if(itm==null){
			System.out.println("You sit on the table for a better view");
		} else if(itm instanceof SitType){
			System.out.println("You sit on the table with "+itm);
			((SitType)itm).forSitting();
		} else {
			System.out.println(itm+" is not helpful for sitting");
		}
	}
}//end class
