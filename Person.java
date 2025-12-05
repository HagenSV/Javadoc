
/**
* Example documentation for Javadoc
* @author Mr. Weiland
* @version 1.0
* @since 11/22/24
*/

public class Person{
  /**
  * Instance variables
  */
  private String name;
  private int happinessLevel;
  private String currentOutfit;
  
  /**
  *  3-argument constructor
  *  @param n String for the person's name
  *  @param h int for the person's happiness level
  *  @param o String for the person's currentOutfit
  */
  public Person(String n, int h, String o){
    name = n;
    happinessLevel = h;
    currentOutfit = o;
  }
  /**
  *  2-argument constructor that assigns happiness to 5.
  *  @param n String for the person's name
  *  @param o String for the person's currentOutfit
  */ 
  public Person(String n, String o){
    name = n;
    happinessLevel = 5;
    currentOutfit = o;
  }

  /**
  * Method that prints out what the person is eating.
  * @param s String for the food. 
  */
  public void eating(String s){
    System.out.println(name + " is eating " + s + ".");
  }
  
  /**
  * Method that gives timeout to a selected person.
  * Prints out a statement, decreases happiness level of the person 
  * receving timeout by 4 and giving timeout by 1.  
  * @param p Person receiving the timeout
  */
  public void giveTimeOut(Person p){
    System.out.println(name + " just sent " + p.getName() + " to time out!");
    p.changeHappiness(-4);
    changeHappiness(-1);
  }

  /**
  * Method that prints out that the person is listening to a specific piece of music
  * and increases the happiness level by 3.  
  * @param s String of the piece pf music
  */
  public void playMusic(String s){
    System.out.println(name + " is listening to \"" + s + "\".");
    changeHappiness(3);
  }
  
  /**
  * Method that returns the happiness level.
  * @return double The current happiness level  
  */
  public double getHappinessLevel(){
    return happinessLevel;
  }
  
  /**
  * Method to increase/decrease the happiness level by a specified amount
  * @param h int for how much to change the happiness level.
  */  
  public void changeHappiness(int h){
    happinessLevel += h;
    System.out.println(name + "'s happiness changed by "  + h + " points to " + happinessLevel + ".");
  }
  
  /**
  * Method that returns the name of the person.
  * @return String The name of the person.  
  */ 
  public String getName(){
    return name;
  }
  
  /**
  * Method that prints out a goodnight message, changes the happiness level to 6,
  * and the current outfit to Pajamas.
  */
  public void sleep(){
    currentOutfit = "Pajamas";
    changeHappiness(6);
    System.out.println("Goodnight " + name + "!");
  }
  
  /**
  * Method to shuffle the name of the person by splitting at a random spot. 
  */  
  public void shuffleName(){
    int randIndex = (int)(Math.random()*name.length());
    System.out.println(name + "’s name shuffled is " + name.substring(randIndex) + name.substring(0,randIndex));
  }
  
  /**
  * Static method that uses 3 random numbers from 1 to 100 and prints out the following:
  * the 3 numbers, the max, the average, the ceiling of the average, 
  * the square root of the ceiling of the average, 
  * and the floor of the square root of the ceiling of the average.  
  */
  public static void funMathMethod(){
    int a = (int)(Math.random()*100 + 1);
    int b = (int)(Math.random()*100 + 1);
    int c = (int)(Math.random()*100 + 1);
    int sum = a+b+c;
    System.out.println("\nFUN MATH METHOD:\n The three numbers are " + a + ", " + b + ", and " + c + ".");
    System.out.println("The max is " + Math.max(Math.max(a,b),c));
    double avg = sum/3.0;
    System.out.println("The average is " + avg);
    double ceilAvg = Math.ceil(avg);
    System.out.println("The ceiling of the average is " + ceilAvg);
    double sqrtCeilAvg = Math.sqrt(ceilAvg);
    System.out.println("The square root of the ceiling of the average is " + sqrtCeilAvg);
    double floorSqrtCeilAvg = Math.floor(sqrtCeilAvg);
    System.out.println("The floor of the square root of the ceiling of the average is " + floorSqrtCeilAvg);
  }
  
  /**
  * Method that prints out information of the person including the name,
  * happiness level, and what they are currently wearing.
  * @return String Information about the person.  
  */ 
  public String toString(){
    return name + "’s current happiness level is " + happinessLevel + " and is currently wearing " + currentOutfit + ".\n";
  }
}