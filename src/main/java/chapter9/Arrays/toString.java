package chapter9.Arrays;

import java.util.Arrays;

/**
 * @Author admin
 * @Date 2019/7/19 13:58
 * @Descroption
 */

public class toString {
    public static void main(String[] args) {
        // *************转字符串 toString()****************
        /*
         * 返回指定数组的内容的字符串表示形式。
         */
        char[] k = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        System.out.println(Arrays.toString(k));// [a, f, b, c, e, A, C, B]
    }
}

