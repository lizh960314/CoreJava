package chapter5.abstractClasses;

/**
 * @author 李志豪
 * @date 2019/7/11 13:54:14
 * @description
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}
