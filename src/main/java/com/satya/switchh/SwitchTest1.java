package com.satya.switchh;

public class SwitchTest1 {

  public static void main(String[] args) {
    int year = 2020;
    Month month = Month.FEB;
    int days = getNumberOfDaysInMonth(month, year);
    System.out.printf("Number of days in year %s and month %s = %d", year, month, days);
  }

  private static int getNumberOfDaysInMonth(Month month, int year) {
    int days = 0;
    switch (month) {
      case JAN:
      case MAR:
      case MAY:
      case JUL:
      case AUG:
      case OCT:
      case DEC:
        days = 31;
        break;
      case APR:
      case JUN:
      case SEP:
      case NOV:
        days = 30;
        break;
      case FEB:
        days = Util.isLeapYear(year) ? 29 : 28;
    }
    return days;
  }
}
