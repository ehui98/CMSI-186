import java.util.Scanner;

public class CountTheDays {
    public static void main(String[] args) {
    String inputDates;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two dates in the form MM/DD/YY, MM/DD/YY: ");
    inputDates = in.nextLine();  
    String[] splitInputDates = inputDates.split("/|\\, ");
    long month1 = Long.parseLong(splitInputDates[0]);
    long day1 = Long.parseLong(splitInputDates[1]);
    long year1 = Long.parseLong(splitInputDates[2]);
    long month2 = Long.parseLong(splitInputDates[3]);
    long day2 = Long.parseLong(splitInputDates[4]);
    long year2 = Long.parseLong(splitInputDates[5]);
    System.out.println("There are " + CalendarStuff.daysBetween(month1, day1, year1, month2, day2, year2) + " days between " + month1 + "/" + day1 + "/" + year1 + " and " + month2 + "/" + day2 + "/"+ year2);
    }
}