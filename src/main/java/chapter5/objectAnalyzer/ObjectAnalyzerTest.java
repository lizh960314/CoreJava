package chapter5.objectAnalyzer;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            squares.add(i * i);
        }
        System.out.println();
    }
}