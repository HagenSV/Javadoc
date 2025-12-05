/**
* @author Logan Lutzic
* @version 1
* @since 2025-12-04
*/

public class Pig {

    /**
    * These are the variables for the pig's name, age, and weight.
    */

    private String pigName;
    private int age;
    private double weight;

    /**
    * This assigns the pig's name, age, and weight to their variables.
    * @param n This is the pig's inital name.
    * @param a This is the pig's inital age.
    * @param w This is the pig's inital weight.
    */

    public Pig (String n, int a, double w) {

        pigName = n;
        age = a;
        weight = w;

    }

    /**
    * This prints out the pig's name.
    */

    public void getPigName() {
        System.out.println(pigName);
    }

    /**
    * This prints out the pig's age.
    */

    public void getPigAge() {
        System.out.println(age);
    }

    /**
    * This prints out the pig's weight
    */

    public void getPigWeight() {
        System.out.println(weight);
    }

    /**
    * This changes the pig's name.
    * @param pgNm This is the new name of the pig.
    */

    public void setPigName(String pgNm) {
        pigName = pgNm;
    }

    /**
    * This changes the pig's age.
    * @param pgAg This is the new age of the pig.
    */

    public void setPigAge(int pgAg) {
        age = pgAg;
    }

    /**
    * This changes the pig's weight.
    * @param pgWe This is the new weight of the pig.
    */

    public void setPigWeight(double pgWe) {
        weight = pgWe;
    }

    /**
    * This method prints out all of the information about a pig.
    * @return String This returns a statement that includes the
    * pig's name, age, and weight.
    */

    public String toString () {
        return (pigName + " is " + age + " years old. They weigh " + weight + " pounds.");
    }

}