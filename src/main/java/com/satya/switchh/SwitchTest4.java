package com.satya.switchh;

public class SwitchTest4 {

  public static void main(String[] args) {
    int year = 2020;
    Month month = Month.FEB;
    int days = getNumberOfDaysInMonth(month, year);
    System.out.printf("Number of days in year %s and month %s = %d", year, month, days);
  }

  private static int getNumberOfDaysInMonth(Month month, int year) {
    int days =
        switch (month) {
          case JAN, MAR, MAY, JUL, AUG, OCT, DEC -> 31;
          case APR, JUN, SEP, NOV -> 30;
          case FEB -> Util.isLeapYear(year) ? 29 : 28;
        };
    return days;
  }
}
