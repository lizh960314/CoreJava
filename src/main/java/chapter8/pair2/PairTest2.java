package chapter8.pair2;


import java.time.LocalDate;

/**
 * @Author admin
 * @Date 2019/7/18 19:39
 * @Descroption
 */

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthday = new LocalDate[]{
                LocalDate.of(1906, 11, 9),
                LocalDate.of(1897, 4, 23),
                LocalDate.of(1897, 1, 15),
                LocalDate.of(1897, 1, 7),
                LocalDate.of(1997, 5, 26)};
        Pair<LocalDate> mm = ArrayAlg.minmax(birthday);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());
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
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min,max);
    }
}