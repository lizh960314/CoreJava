package chapter5.abstractClasses;

/**
 * @author 李志豪
 * @date 2019/7/11 13:49:48
 * @description
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
