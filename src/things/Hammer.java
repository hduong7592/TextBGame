/**
 * Class Hammer
 * This class extends from Item and implements Weaponizable and Hitable interface
 * @author <Hieu Duong>
 * @since 2018-01-30
 */


package things;

public class Hammer extends Item implements Weaponizable, Hitable {
    public Hammer() {
        super("HAMMER");
    }
    public void weaponUse(){
        System.out.println("You smashed it with the hammer");
    }
    public void hitit(){
        System.out.println("Now you've done it. Look what you've done.");
    }

}
