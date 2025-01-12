package com.satya.switchh;

import java.util.GregorianCalendar;

public class Util {
  public static boolean isLeapYear(int year) {
    GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
    return cal.isLeapYear(year);
  }
}
