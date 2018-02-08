/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  StringStuff.java
*  Purpose       :  A file full of stuff to do with the Java String class
*  Author        :  Elizabeth Hui
*  Date          :  2017-02-07
*  Description   :  This file presents a bunch of String-style helper methods.  Although     
* pretty much any and every thing you'd want to do with Strings is already made for you in   
* the Jav` String class, this exercise gives you a chance to do it yourself [DIY] for some
* of it and get some experience with designing code that you can then check out using
* the real Java String methods [if you want]
*  Notes         :  None
*  Warnings      :  None
*  Exceptions    :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  Revision History
*  ----------------
*            Rev      Date     Modified by:  Reason for change/modification
*           -----  ----------  ------------  ------------------------------------------------
*  @version 1.0.0  2017-01-19  B.J. Johnson  Initial writing and release
*  @version 1.1.0  2017-01-22  B.J. Johnson  Fill in methods to make the program actually
*  work
*  @version 1.2.0 2017-02-07   Elizabeth Hui Adding the code
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

import java.util.Set;
import java.util.LinkedHashSet;

public class StringStuff {
    
    //checks if a string contains upper or lower case vowels, returns true if it does
    //false if not
    public static boolean containsVowel(String s) { 
        if ((s.contains("a")) || (s.contains("A")) || (s.contains("e")) || (s.contains("E")) || (s.contains("i")) || (s.contains("I")) || (s.contains("o")) || (s.contains("O")) || (s.contains("u")) || (s.contains("U"))) {
            return true;
        } else {
        return false;
        }
    }
    
    //checks if a string is a palindrome, returns true if yes, false if no
    public static boolean isPalindrome(String s) {
        int x = s.length();
        for (int i = 0; i < (x/2); i++) {
            if ((s.charAt(i)) != (s.charAt(x - i - 1))) {
                return false;
            }
        }
        return true;
    }
    
    //replaces lower and upper case odd alphabet letters to nothing
    public static String evensOnly(String s) {
        s = s.replaceAll("a", "");
        s = s.replaceAll("c", "");
        s = s.replaceAll("e", "");
        s = s.replaceAll("g", "");
        s = s.replaceAll("i", "");
        s = s.replaceAll("k", "");
        s = s.replaceAll("m", "");
        s = s.replaceAll("o", "");
        s = s.replaceAll("q", "");
        s = s.replaceAll("s", "");
        s = s.replaceAll("u", "");
        s = s.replaceAll("w", "");
        s = s.replaceAll("y", "");
        s = s.replaceAll("A", "");
        s = s.replaceAll("C", "");
        s = s.replaceAll("E", "");
        s = s.replaceAll("G", "");
        s = s.replaceAll("I", "");
        s = s.replaceAll("K", "");
        s = s.replaceAll("M", "");
        s = s.replaceAll("O", "");
        s = s.replaceAll("Q", "");
        s = s.replaceAll("S", "");
        s = s.replaceAll("U", "");
        s = s.replaceAll("W", "");
        s = s.replaceAll("Y", "");
        return s;
    }
    
    //replaces lower and upper case even alphabet letters to nothing
    public static String oddsOnly(String s) {
        s = s.replaceAll("b", "");
        s = s.replaceAll("d", "");
        s = s.replaceAll("f", "");
        s = s.replaceAll("h", "");
        s = s.replaceAll("j", "");
        s = s.replaceAll("l", "");
        s = s.replaceAll("n", "");
        s = s.replaceAll("p", "");
        s = s.replaceAll("r", "");
        s = s.replaceAll("t", "");
        s = s.replaceAll("v", "");
        s = s.replaceAll("x", "");
        s = s.replaceAll("z", "");
        s = s.replaceAll("B", "");
        s = s.replaceAll("D", "");
        s = s.replaceAll("F", "");
        s = s.replaceAll("H", "");
        s = s.replaceAll("J", "");
        s = s.replaceAll("L", "");
        s = s.replaceAll("N", "");
        s = s.replaceAll("P", "");
        s = s.replaceAll("R", "");
        s = s.replaceAll("T", "");
        s = s.replaceAll("V", "");
        s = s.replaceAll("X", "");
        s = s.replaceAll("Z", "");
        return s; 
    }
    
    //first only has even letters then checks if there are duplicate letters, then removes them if so
    public static String evensOnlyNoDupes(String s) {
        s = evensOnly(s);
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(!newS.contains(String.valueOf(s.charAt(i)))) {
            newS += String.valueOf(s.charAt(i));
            }
        }
        return newS;
    }
    
    //first only has odd letters then checks if there are duplicate letters, then removes them if so
    public static String oddsOnlyNoDupes(String s) {
        s = oddsOnly(s);
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if(!newS.contains(String.valueOf(s.charAt(i)))) {
            newS += String.valueOf(s.charAt(i));
            }
        }
        return newS;
    }
    
    //reverses an input string and returns it 
    public static String reverse(String s) {
        String r = new StringBuilder(s).reverse().toString();
        return r; 
    }
    
    //uses all the methods in the code 
    public static void main(String[] args) {
        String blah = new String( "Blah blah blah" );
        String woof = new String( "BCDBCDBCDBCDBCD" );
        String pal1 = new String( "a" );
        String pal2 = new String( "ab" );
        String pal3 = new String( "aba" );
        String pal4 = new String( "amanaplanacanalpanama" );
        String pal5 = new String( "abba" );
        System.out.println( containsVowel( blah ) );
        System.out.println( containsVowel( woof ) );
        System.out.println( isPalindrome( pal1 ) );
        System.out.println( isPalindrome( pal2 ) );
        System.out.println( isPalindrome( pal3 ) );
        System.out.println( isPalindrome( pal4 ) );
        System.out.println( isPalindrome( pal5 ) );
        System.out.println( "evensOnly()        returns: " + evensOnly( "REHEARSALSZ" ) );
        System.out.println( "evensOnly()        returns: " + evensOnly( "REhearSALsz" ) );
        System.out.println( "evensOnlyNoDupes() returns: " + evensOnlyNoDupes( "REhearSALsz" ) );
        System.out.println( "oddsOnly()         returns: " + oddsOnly( "xylophones" ) );
        System.out.println( "oddsOnly()         returns: " + oddsOnly( "XYloPHonES" ) );
        System.out.println( "oddsOnlyNoDupes()  returns: " + oddsOnlyNoDupes( "XYloPHonES" ) );
        System.out.println( "reverse()          returns: " + reverse( "REHEARSALSZ" ) );
    }
}
