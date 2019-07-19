package chapter9.Arrays;

import java.util.Arrays;

/**
 * @Author admin
 * @Date 2019/7/19 13:52
 * @Descroption
 */

public class fill {
    public static void main(String[] args) {
        // *************填充fill(批量初始化)****************
        int[] g = { 1, 2, 3, 3, 3, 3, 6, 6, 6 };
        // 数组中所有元素重新分配值
        Arrays.fill(g, 3);
        System.out.println("Arrays.fill(g, 3)：");
        // 输出结果：333333333
        for (int i : g) {
            System.out.print(i);
        }
        // 换行
        System.out.println();

        int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
        // 数组中指定范围元素重新分配值
        Arrays.fill(h, 0, 2, 9);
        System.out.println("Arrays.fill(h, 0, 2, 9);：");
        // 输出结果：993333666
        for (int i : h) {
            System.out.print(i);
        }
    }
}
