package j.y2023.dec.q1154;

/**
 * 1154. Day of the Year
 * Check if year is leap year. If it is leap year, Feb is 29 days. Else
 * Feb is 28 days.
 */
public class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int days = 0;
        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeap(year)) {
            amount[1]++;
        }
        for (int i = 0; i < month - 1; i++) {
            days += amount[i];
        }
        return days + day;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
