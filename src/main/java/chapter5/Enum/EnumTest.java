package chapter5.Enum;

import java.util.Scanner;

/**
 * @author 李志豪
 * @date 2019/7/12 10:10:08
 * @description
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if (size == Size.EXTRA_LARGE){
            System.out.println("good job--you paid attention to the__.");
        }

    }
}

enum Size{
    /**
     *
     *
     */

    SMALL("S"), MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private  String abbreviation;

    private Size(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
