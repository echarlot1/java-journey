package javaFundamental.printCalendar;
//method Abstraction: hiding implementation of certains feature from user

import java.util.Scanner;

public class PlayCalendar {
    public static void main(String[] args){
        //    1) read input from the user:
//                a) get full year from user
//                   b) get the month from the user
//        2) print month (
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full year: ");
        int fullYear = sc.nextInt();
        System.out.println("Enter the month: Eg. 4 for April");
        int month = sc.nextInt();

        printMonth(fullYear, month);
    }

    public static void printMonth(int year, int month){
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

//    print the month title:
    public static void printMonthTitle(int year, int month){
        System.out.println("          "+ getMonthName(month));
    }

    public static String getMonthName(int month){
        String monthName ="";
        switch (month){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month){
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        int i=0;
        for (i=1; i<numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);

            if((i + startDay) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getStartDay(int year, int month){
        final int start_day_for_jan_1_1800 = 3;
        int totalNumberOfDays = getTotalnumberOfDays(year, month);
        return (totalNumberOfDays + + start_day_for_jan_1_1800 ) %7;
    }

    public static int getTotalnumberOfDays(int year, int month){
        int total = 0;
        for(int i=1800; i<year; i++){
            if(isLeapYear(i)){
                total = total + 366;
            }else {
                total = total + 365;
            }
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        if(month ==1 || month == 3 || month==5 || month ==7 || month==8 || month ==10 || month==12){
            return 31;
        }
        if(month ==4 || month == 6 || month==9 || month ==11){
            return 30;
        }
        if(month==2){
            return isLeapYear(year) ? 29: 28;

        }
        return 0;
    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year %4 == 0 && year % 100 !=0);
    }

}
