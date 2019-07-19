package chapter9.Arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @Author admin
 * @Date 2019/7/19 13:55
 * @Descroption
 */

public class asList {
    public static void main(String[] args) {
        // *************转列表 asList()****************
        /*
         * 返回由指定数组支持的固定大小的列表。
         * （将返回的列表更改为“写入数组”。）该方法作为基于数组和基于集合的API之间的桥梁，与Collection.toArray()相结合 。
         * 返回的列表是可序列化的，并实现RandomAccess 。
         * 此方法还提供了一种方便的方式来创建一个初始化为包含几个元素的固定大小的列表如下：
         */
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        System.out.println(stooges);
    }
}
