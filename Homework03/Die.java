/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Die.java
 *  Purpose       :  Provides a class describing a single die that can be rolled
 *  @author       :  Elizabeth Hui
 *  Date          :  2018-02-21
 *  Description   :  This class provides the data fields and methods to describe a single game die.  A
 *                   die can have "N" sides.  Sides are randomly assigned sequential pip values, from 1
 *                   to N, with no repeating numbers.  A "normal" die would thus has six sides, with the
 *                   pip values [spots] ranging in value from one to six.  Includes the following:
 *                   public Die( int nSides );                  // Constructor for a single die with "N" sides
 *                   public int roll();                         // Roll the die and return the result
 *                   public int getValue()                      // get the value of this die
 *                   public void setSides()                     // change the configuration and return the new number of sides
 *                   public String toString()                   // Instance method that returns a String representation
 *                   public static String toString()            // Class-wide method that returns a String representation
 *                   public static void main( String args[] );  // main for testing porpoises
 *
 *  Notes         :  Restrictions: no such thing as a "two-sided die" which would be a coin, actually.
 *                   Also, no such thing as a "three-sided die" which is a physical impossibility without
 *                   having it be a hollow triangular prism shape, presenting an argument as to whether
 *                   the inner faces are faces which then should be numbered.  Just start at four for
 *                   minimum number of faces.  However, be aware that a four-sided die dosn't have a top
 *                   face to provide a value, since it's a tetrahedron [pyramid] so you'll have to figure
 *                   out a way to get the value, since it won't end up on its point.
 *
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the number of sides or pips is out of range
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-02-06  B.J. Johnson  Initial writing and release
 *  @version 1.1.0  2017-02-17  B.J. Johnson  Filled in method code
 *  @version 1.2.0  2018-02-21  Elizabeth Hui Added code
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class Die {
    private int sides;
    private int pips;
    private final int minimumSides = 4;
    
    //makes sure all the die are at least 4 sides
    public Die(int nSides) {
        if (nSides < 4) {
            sides = minimumSides;
        } else {
            sides = nSides;
        }
    }
    
    //rolls the die and returns a random pip
    public int roll() {
        pips = ((int)(Math.random()*sides) + 1);
        return pips;
    }
    
    //returns the pip
    public int getValue() {
        return pips;
    }
    
    //changes the number of sides on the die
    public int setSides(int newSide) {
        newSide = sides;
        pips = ((int)(Math.random()*sides) + 1);
        return sides; 
    }
    
    //changes the pip to a string like [x]
    public String toString() {
        String dieString = Integer.toString(pips);
        return "[" + dieString + "]";
    }
    
    //gets the value of the pip then changes it to a string
    public static String toString(Die d) {
        String dieString = Integer.toString(d.getValue());
        return "[" + dieString + "]";
    }
    
    //tests the previous methods
    public static void main (String[] args) {
        System.out.println("Hello world from the dice class!");
        try {Die myDie = new Die(9);
        System.out.println(myDie.roll());
        System.out.println(myDie.getValue());}
        catch(Exception e) {System.out.println(false); }
        
        try {Die myDie = new Die(6);
        System.out.println(myDie.roll());
        System.out.println(myDie.toString());}
        catch(Exception e) {System.out.println(false); }
        
        try {Die myDie = new Die(3);
        System.out.println(myDie.roll());
        System.out.println(myDie.toString()); }
        catch(Exception e) {System.out.println(false); }
        
        try {Die myDie = new Die(13);
        System.out.println(myDie.roll());
        System.out.println(myDie.setSides(10));}
        catch(Exception e) {System.out.println(false); }
        
        try {Die myDie = new Die (420);
        System.out.println(myDie.roll());
        System.out.println(myDie.toString());}
        catch(Exception e) {System.out.println(false); }
    }
}
