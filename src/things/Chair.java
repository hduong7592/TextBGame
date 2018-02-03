package things;
public class Chair extends RoomObject implements Sitable, Eatable{
	public Chair(){
		super("CHAIR");
	}
	public void eat(Item itm){
		if(itm==null){
			System.out.println("You gnaw on a chair leg...very fiberous");
		} else if(itm instanceof Utensil){
			System.out.println("You use the "+itm+"to eat");
			((Utensil)itm).utensilUse();
		} else {
			System.out.println(itm+" is not very effective");
		}
	}
	public void sit(Item itm){
		if(itm==null){
			System.out.println("You sit on the chair, so comfy");
		} else if(itm instanceof SitType){
			System.out.println("You sit on the chair with "+itm);
			((SitType)itm).forSitting();
		} else {
			System.out.println(itm+" is not helpful for sitting");
		}
	}
}//end class
