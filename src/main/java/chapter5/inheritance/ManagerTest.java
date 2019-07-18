package chapter5.inheritance;

/**
 * @author 李志豪
 * @date 2019/7/10 22:24:32
 * @description
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss ;
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tom", 40000, 1987, 4, 3);

        for (Employee e: staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
