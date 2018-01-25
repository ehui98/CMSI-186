/**
 *  File name     :  CalendarStuff.java
 *  Purpose       :  Provides a class with supporting methods for CountTheDays.java program
 *  Author        :  Elizabeth Hui
 *  Date          :  2017-01-24
 *  Description   :  This file provides the supporting methods for the CountTheDays program   * which will calculate the number of days between two dates.  It shows the use of            * modularization when writing Java code, and how the Java compiler can "figure things out" on * its own at "compile time".  It also provides examples of proper documentation, and uses
 * the source file header template as specified in the "Greeter.java" template program
 * file for use in CMSI 186, Spring 2018.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -------------------------------
 *  @version 1.0.0  2017-01-24  Elizabeth Hui  Initial writing and release
 */

public class CalendarStuff {
     //I did not inlcude serveral of the optional methods

     /**
     * A listing of the days of the week, assigning numbers; Note that the week arbitrarily starts on Sunday
     */
     private static final int SUNDAY    = 0;
     private static final int MONDAY    = SUNDAY + 1;
     private static final int TUESDAY   = MONDAY + 1;
     private static final int WEDNESDAY = TUESDAY + 1;
     private static final int THURSDAY  = WEDNESDAY + 1;
     private static final int FRIDAY    = THURSDAY + 1;
     private static final int SATURDAY  = FRIDAY + 1; 
  
     /**
     * A listing of the months of the year, assigning numbers; I suppose these could be ENUMs instead, but whatever
     */
     private static final int JANUARY    = 1;
     private static final int FEBRUARY   = JANUARY + 1;
     private static final int MARCH      = FEBRUARY + 1;
     private static final int APRIL      = MARCH + 1;
     private static final int MAY        = APRIL + 1;
     private static final int JUNE       = MAY + 1;
     private static final int JULY       = JUNE + 1;
     private static final int AUGUST     = JULY + 1;
     private static final int SEPTEMBER  = AUGUST + 1;
     private static final int OCTOBER    = SEPTEMBER + 1;
     private static final int NOVEMBER   = OCTOBER + 1;
     private static final int DECEMBER   = NOVEMBER +1;
  
     //An array containing the number of days in each month
     private static int[]    days        = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

     //boolean that returns if a year is a leap year
     public static boolean isLeapYear( long year ) {
          if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) //leap year stuff
          { return true; //if it's a leap year
          } else {
               return false; //not a leap year
          }
     }

     //A method to calculate the days in a month, including leap years
     public static long daysInMonth( long month, long year ) {
          if ((month == 2) && !isLeapYear(year)) { //month with 28 days w/o leap
               return 28;
          } else if ((month == 2) && isLeapYear(year)) { //leap year and 28 day month
               return 29;
          } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
               return 30; // months with 30 days
          } 
          return 31; // months that don't apply to the ones above must be 31 
     }

     //A method to calculate the days in a month, without leap years
     public static long daysMonth( long month ) {
         if (month == 2) {
             return 28;
         } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
               return 30;
         }
         return 31;
     }

     //A method to determine if two dates are exactly equal
     public static boolean dateEquals( long month1, long day1, long year1, long month2, long day2, long year2 ) {
          if ((isValidDate(month1, day1, year1)) && (isValidDate(month2, day2, year2))) {
               if ((month1 == month2) && (year1 == year2) && (day1 == day2)) {
                    return true; //if all the inputs are the same
               } else {
                    return false; //if the inputs aren't the same
               }
          } 
          else return false; //if the inputs aren't valid
   }

     //A method to return whether a date is a valid date
     public static boolean isValidDate( long month, long day, long year ) {
          boolean valid = true; // new boolean 
          if (year > 0) { //the year needs to be greater than 0
               if ((month >= 1) && (month <= 12)) { //the month needs to be between 1 & 12
                    if ((day > 0) && (day <= (daysInMonth(month, year)))) {
                         valid = true; //valid only if met the bits above
                    } 
               }
          } else valid = false; // not a valid date 
          return valid; 
     }

     /*A method to return a count of the total number of days between two valid dates. What *this does is calculate the total days from 0 to the dates specified then subtracts the *two.
     */
     public static long daysBetween( long month1, long day1, long year1, long month2, long day2, long year2 ) {
          long y1 = 0; //initializing all my variables
          long m1 = 0;
          long date1 = 0;
          long y2 = 0;
          long m2 = 0;
          long date2 = 0;
          long days = 0;
          if (y1 <= year1) { 
              y1++;
              date1 = date1 + 365;
              if (isLeapYear(year1)) {
                  date1++;
              }
          }
          if (m1 <= month1) {
              m1++;
              date1 = date1 + (daysMonth(m1));
              if (m1 == month1) {
                  date1 = date1 + day1;
              }
          }
          if (y2 <= year2) {
              y2++;
              date2 = date2 + 365;
              if (isLeapYear(year2)) {
                  date2++;
              }
          }
          if (m2 <= month2) {
              m2++;
              date2 = date2 + (daysMonth(m2));
              if (m2 == month2) {
                  date2 = date2 + day2;
              }
          }
          if (date1 > date2) {
              days = date1 - date2;
              return days;
          } else {
              days = date2 - date1;
              return days;
          }         
     }
          
}


