package com.java.days;
public class DateDifference {
    private int year;
    private int month;
    private int day;

    public DateDifference(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int daysSinceJan1() {
        int[] daysPerMonth = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int daysSinceJan1 = daysPerMonth[month - 1] + day;
        if (isLeapYear() && month > 2) {
            daysSinceJan1++;
        }
        return daysSinceJan1;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int daysDifference(DateDifference other) {
        int daysInYear = 365;
        int yearDiff = Math.abs(year - other.getYear());
        int leapYears = 0;
        for (int i = Math.min(year, other.getYear()); i < Math.max(year, other.getYear()); i++) {
            if (new DateDifference(i, 1, 1).isLeapYear()) {
                leapYears++;
            }
        }
        int daysDiff = yearDiff * daysInYear + leapYears;
        daysDiff += Math.abs(daysSinceJan1() - other.daysSinceJan1());
        return daysDiff;
    }

    public static void main(String[] args) {
        DateDifference date1 = new DateDifference(2000, 1, 1);
        DateDifference date2 = new DateDifference(2025, 1, 1);
        int daysDiff = date1.daysDifference(date2);
        System.out.println("The difference between " + date1.getYear() + "/" + date1.getMonth() + "/" + date1.getDay() + " and " +
                date2.getYear() + "/" + date2.getMonth() + "/" + date2.getDay() + " is " + daysDiff + " days.");
    }
}
