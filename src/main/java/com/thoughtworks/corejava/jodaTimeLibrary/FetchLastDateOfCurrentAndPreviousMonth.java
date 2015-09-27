package com.thoughtworks.corejava.jodaTimeLibrary;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rajatbhatnagar on 9/27/15.
 */
public class FetchLastDateOfCurrentAndPreviousMonth {
    public FetchLastDateOfCurrentAndPreviousMonth() {
    }
    /*
     * This program fetches the last day of the previous month and
     * the last date of the current month based on the input date
     */

    public static void main(String[] args) throws Exception {


        //Create a Date in Java
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String dateString = " 2014/09/11";
        Date fileReceiptDate = sdf.parse(dateString);
        System.out.println("fileReceiptDate :: " + fileReceiptDate);

        //Create a JODA datetime obj

        DateTime dt = new DateTime(fileReceiptDate);

        String lastDteOfCurrentMonth = getLastDayOfCurrentMonth(dt.getMonthOfYear(), dt.getYear());
        System.out.println(" lastDteOfCurrentMonth : " + lastDteOfCurrentMonth);
        //Create java date object using last date of current month
        Date benefitExpirationDate = sdf.parse(lastDteOfCurrentMonth);
        System.out.println("benefitExpirationDate = " + benefitExpirationDate);

        String lastDteOfPreviousMonth = getLastDayOfPreviousMonth(dt.getMonthOfYear(), dt.getYear());
        System.out.println("lastDteOfPreviousMonth :: " + lastDteOfPreviousMonth);
        // //Create java date object using last date of previous month
        Date benefitExpirationDateOne = sdf.parse(lastDteOfPreviousMonth);
        System.out.println("benefitExpirationDateOne = " + benefitExpirationDateOne);

    }

    private static String getLastDayOfCurrentMonth(int month, int year) {
        LocalDate lastDayOfMonth = new LocalDate(year, month, 1).dayOfMonth().withMaximumValue();
        return lastDayOfMonth.toString("yyyy/MM/dd");
    }

    private static String getLastDayOfPreviousMonth(int month, int year) {
        LocalDate lastDayOfPreviousMonth = new LocalDate(year, month - 1, 1).dayOfMonth().withMaximumValue();
        return lastDayOfPreviousMonth.toString("yyyy/MM/dd");
    }
}
