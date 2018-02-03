package things;
public class Apple extends RoomObject implements Eatable{
	public Apple(){
		super("APPLE");
	}
	public void eat(Item itm){
		if(itm==null){
			System.out.println("You eat the apple. Delicious!");
		} else if(itm instanceof Utensil){
			System.out.println("You use the "+itm+" to eat");
			((Utensil)itm).utensilUse();
		} else {
			System.out.println(itm+" is not very effective");
		}
	}
	
}//end class
