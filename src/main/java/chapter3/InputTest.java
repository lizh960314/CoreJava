package chapter3;

import java.util.Scanner;

/**
 * @author 李志豪
 * @date 2019/7/10 15:23:11
 * @description
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //    get first input
        System.out.println("what's your name？");
        String name = in.nextLine();

        //get second input
        System.out.println("how old are you");
        int age = in.nextInt();

        //display output on console
        System.out.println("hello,"+name+",next year,you'll be"+(age+1));
    }


}
