package things;
public class Fork extends Item implements Utensil, Weaponizable, SitType{
	public Fork(){
		super("FORK");
	}
	
	public void weaponUse(){
		System.out.println("You stab it with the fork");
	}
	public void forSitting(){
		System.out.println("OWWW, I shouldn't used that for sitting");
	}
	public void utensilUse(){
		System.out.println("Why use your hands?");
	}


}//end class
