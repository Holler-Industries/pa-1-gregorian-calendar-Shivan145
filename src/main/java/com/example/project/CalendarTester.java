package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        GregorianCalendar CalenderTester = new GregorianCalendar();

        System.out.println("The current date is: " + CalenderTester.get(Calendar.MONTH) + " / "
                + CalenderTester.get(Calendar.DATE)+" / " + CalenderTester.get(Calendar.YEAR));


        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 5");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.

        System.out.println("CalenderTester Month: " + CalenderTester.get(Calendar.MONTH));
        System.out.println("Expected: 8");

        System.out.println("CalenderTester Year: " + CalenderTester.get(Calendar.YEAR));
        System.out.println("Expected: 2020");

        System.out.println("CalenderTester Day of Month: " + CalenderTester.get(Calendar.DAY_OF_MONTH));
        System.out.println("Expected: 24");


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        CalenderTester.add(Calendar.DAY_OF_YEAR,100);
        System.out.println("The current date is: " + CalenderTester.get(Calendar.MONTH) + " / " +
                CalenderTester.get(Calendar.DATE)+" / "+ CalenderTester.get(Calendar.YEAR));

        System.out.println("The day of the week is: " + Calendar.DAY_OF_WEEK);


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?

        GregorianCalendar ShivanBday = new GregorianCalendar(2020, Calendar.MARCH, 3);
        ShivanBday.add(Calendar.DAY_OF_YEAR,10000);
        System.out.println("The day of the week is: " + ShivanBday.get(Calendar.DAY_OF_WEEK));


    }

}