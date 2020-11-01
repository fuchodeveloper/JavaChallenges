package com.codeisbae;

public class Main {

  public static void main(String[] args) {
    // write your code here
    printEqual(1,2,3);
  }

  // Equality printer
  public static void printEqual(int firstNum, int secondNum, int thirdNum) {
    if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
      System.out.println("Invalid Value");
    } else {
      if (firstNum == secondNum && firstNum == thirdNum) {
        System.out.println("All numbers are equal");
      } else if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum) {
        System.out.println("All numbers are different");
      } else {
        System.out.println("Neither all are equal or different");
      }
    }
  }

  // Minutes to Years and Days calculator
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid value");
    } else {
      /*
       1 hour = 60 minutes
       1 day = 24 hours
       1 year = 365 days
      */
      long h = minutes / 60;
      long d = h / 24;
      long y = d / 365;
      long yRemainder = d % 365;
      System.out.println(minutes + " min = " + y + " y and " + yRemainder + " d");
    }
  }

  // Area Calculator
  private static final double PI = Math.PI;

  public static double area(double radius) {
    if ((radius < 0)) return -1.0;

    return radius * radius * PI;
  }

  public static double area(double x, double y) {
    if ((x < 0 || y < 0)) return -1.0;

    return x * y;
  }
    /*
      System.out.println(area(5.0));
      System.out.println(area(-1));
      System.out.println(area(5.0, 4.0));
      System.out.println(area(-1.0,4.0));
    */
}
