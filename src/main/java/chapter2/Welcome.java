package chapter2;

/**
 * @author 李志豪
 * @date 2019/7/10 15:16:01
 * @description This displays a greeting for the reader
 */
public class Welcome {
    public static void main(String[] args) {
        String greeting = "chapter2.Welcome to java";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
        }
        System.out.println();
    }
}
