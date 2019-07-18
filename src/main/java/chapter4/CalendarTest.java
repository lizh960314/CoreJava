package chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author 李志豪
 * @date 2019/7/10 20:08:28
 * @description
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        System.out.println(month);
        System.out.println(today);

        date = date.minusDays(today-1);
        System.out.println(date);

        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);

        int value = weekday.getValue();
        System.out.println(value);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value ; i++) {
            System.out.print(" ");
        }
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }

    }
}
