/**
* @author Logan Lutzic
* @version 1
* @since 2025-12-04
*/

public class Farm {

    /**
    * These are the variables for the farm's name, owner, wheter or
    * not they have a pig, and that pig they might have.
    */

    private String name;
    private String owner;
    private boolean hasPig;
    private Pig piggy;

    /**
    * This assigns the Farm's name, owner, and pig to their variables.
    * It also makes the hasPig variable true.
    * @param n This is the farm's name.
    * @param o This is the owner of the farm's name.
    * @param p This is a pig from the Pig class.
    */

    public Farm (String n, String o, Pig p) {

        name = n;
        owner = o;
        hasPig = true;
        piggy = p;

    }

    /**
    * This assigns the Farm's name and owner to their variables.
    * @param n This is the farm's name.
    * @param o This is the owner of the farm's name.
    */

    public Farm (String n, String o) {

        name = n;
        owner = o;
        hasPig = false;

    }

    /**
    * This prints out the farm's name.
    */

    public void getFarmName() {
        System.out.println(name);
    }

    /**
    * This prints out the farm owner's name
    */

    public void getFarmOwner() {
        System.out.println(owner);
    }

    /**
    * This prints out true if the farm has a pig from the Pig Class
    */

    public void getPigStatus() {
        System.out.println(hasPig);
    }

    /**
    * This changes the farm's name.
    * @param nm This is the new name for the farm.
    */

    public void setFarmName(String nm) {
        name = nm;
    }

    /**
    * This changes the owner's name.
    * @param ow This is the new name for the owner.
    */

    public void setFarmOwner(String ow) {
        owner = ow;
    }

    /**
    * This assigns a pig from the Pig class to the farm.
    * @param pg This is the pig from the Pig class that will be
    *  assigned to the farm.
    */

    public void getPig(Pig pg) {
        hasPig = true;
        piggy = pg;
    }

    /**
    * This method changes a farm to not have a pig.
    */

    public void removePig() {
        hasPig = false;
    }

    /**
    * This method prints out all of the information about a farm.
    * @return String This returns a statement returning the farm's
    * name, owner, and whether or not they have a pig. If they do
    * have a pig, it will also return the pig's name, age, and
    * weight.
    */

    public String toString () {
        if (hasPig == true) {
            return (owner + " has a farm called " + name + ". It is " + hasPig + " that they have a pig called " + piggy);
        }
        return (owner + " has a farm called " + name + ". It is " + hasPig + " that they have a pig.");
    }

}