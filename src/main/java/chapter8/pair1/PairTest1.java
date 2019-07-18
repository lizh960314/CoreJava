package chapter8.pair1;

/**
 * @Author admin
 * @Date 2019/7/18 15:40
 * @Descroption
 */

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = { "1", "2", "3", "4", "5" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
class Pair<T>{
    private T first;
    private T second;

    public Pair() {
        first = null;
        second=null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<T>(min, max);
    }

    public static <T> T getMiddle(T[] a) {
        return a[a.length / 2];
    }
}