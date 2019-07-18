package chapter5.abstractClasses;



/**
 * @author 李志豪
 * @date 2019/7/11 13:51:20
 * @description 用来描述抽象类
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("harry", 50000, 1989, 10, 1);
        people[1] = new Student("Morris","computer");


//        System.out.println(people[1].getDescription());
        for (Person p:people) {
            System.out.println(p.getName()+ ","+ p.getDescription());
        }


    }
}
