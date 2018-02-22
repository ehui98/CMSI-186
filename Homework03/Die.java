public class Die {
    private int sides;
    private int pips;
    private final int minimumSides = 4;
    
    public Die(int nSides) {
        if (nSides < 4) {
            sides = minimumSides;
        } else {
            sides = nSides;
        }
    }
    
    public int roll() {
        pips = ((int)(Math.random()*sides) + 1);
        return pips;
    }
    
    public int getValue() {
        return pips;
    }
    
    public int setSides(int newSide) {
        newSide = sides;
        pips = ((int)(Math.random()*sides) + 1);
        return sides; 
    }
    
    public String toString() {
        String dieString = Integer.toString(pips);
        return "[" + dieString + "]";
    }
    
    public static String toString(Die d) {
        String dieString = Integer.toString(d.getValue());
        return "[" + dieString + "]";
    }
    
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
