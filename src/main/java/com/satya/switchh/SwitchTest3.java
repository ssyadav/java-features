package com.satya.switchh;

public class SwitchTest3 {
  public static void main(String[] args) {
    int year = 2020;
    Month month = Month.FEB;
    int days = getNumberOfDaysInMonth(month, year);
    System.out.printf("Number of days in year %s and month %s = %d", year, month, days);
  }

  private static int getNumberOfDaysInMonth(Month month, int year) {
    int days =
        switch (month) {
          case JAN, MAR, MAY, JUL, AUG, OCT, DEC:
            yield 31;
          case APR, JUN, SEP, NOV:
            yield 30;
          case FEB:
            yield Util.isLeapYear(year) ? 29 : 28;
        };
    return days;
  }
}
