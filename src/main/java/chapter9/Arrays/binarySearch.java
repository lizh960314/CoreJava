package chapter9.Arrays;

import java.util.Arrays;

/**
 * @Author admin
 * @Date 2019/7/19 13:45
 * @Descroption
 */

public class binarySearch {
    public static void main(String[] args) {
        char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));

        int s = Arrays.binarySearch(e, 'c');
        System.out.println(s);
    }
}
