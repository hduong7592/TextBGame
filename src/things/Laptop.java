/**
 * Class Laptop
 * This class extends from RoomObject and implements Eatable, Breakable and Attackable interface
 * @author <Hieu Duong>
 * @since 2018-01-30
 */


package things;

public class Laptop extends RoomObject implements Eatable, Breakable, Attackable {
    public Laptop() {
        super("LAPTOP");
    }

    public void eat(Item itm){
        if(itm==null){
            System.out.println("Eww, why would you try to eat the laptop? It is not eatable.");
        } else if(itm instanceof Utensil){
            System.out.println("You try to use the "+itm+" to eat. Are you mad? The laptop is not eatable.");
        } else {
            System.out.println("Again, laptop is not for eating.");
        }
    }

    public void breakit(Item itm){
        if(itm==null){
            System.out.println("You try to break the laptop, are you sure? You might have to buy a new one.");
        } else if(itm instanceof Hitable){
            System.out.println("You hit the laptop with the "+itm+".");
            ((Hitable)itm).hitit();
        }
        else {
            System.out.println(itm+" is not very effective. Might try to use something else?");
        }
    }

    public void attack(Item itm){
        if(itm==null){
            System.out.println("You punched the laptop, now it is damaged.");
        } else if(itm instanceof Weaponizable){
            System.out.println("You attack the laptop with "+itm);
            ((Weaponizable)itm).weaponUse();
        } else {
            System.out.println(itm+" is not very effective");
        }
    }
}
