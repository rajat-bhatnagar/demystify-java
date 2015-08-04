package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * We can pass enum value as a switch argument
 */
public class SwitchAndEnumDemo {
    public static void main(String[] args) {
        Months monthOfYear = Months.NOV;
        switch (monthOfYear) {
            case JAN:
                System.out.println("Mom's Birthday");
                break;
            case FEB:
                break;
            case MAR:
                break;
            case APRIL:
                break;
            case MAY:
                break;
            case JUNE:
                System.out.println("Dad's Birthday");
                break;
            case JULY:
                break;
            case AUG:
                break;
            case SEPT:
                break;
            case OCT:
                System.out.println("Rajat's Birthday");
                break;
            case NOV:
                System.out.println("Chhavi's Birthday");
                break;
            case DEC:
                break;
            default:
                System.out.println("Default Value");
        }
    }
}
