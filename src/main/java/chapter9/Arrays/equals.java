package chapter9.Arrays;

import java.util.Arrays;

/**
 * @Author admin
 * @Date 2019/7/19 13:50
 * @Descroption
 */

public class equals {
    public static void main(String[] args) {
        char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        char[] f = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };

        /*
         * 元素数量相同，并且相同位置的元素相同。 另外，如果两个数组引用都是null，则它们被认为是相等的 。
         */
        // 输出true
        System.out.println(Arrays.equals(e,f));
    }
}
