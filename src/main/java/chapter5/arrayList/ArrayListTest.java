package chapter5.arrayList;



import java.util.ArrayList;

/**
 * @author 李志豪
 * @date 2019/7/11 15:54:35
 * @description
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("tom", 1000, 1975, 2, 2));
        staff.add(new Employee("jerry", 7000, 1978, 6, 8));
        staff.add(new Employee("anna", 4000, 1975, 5, 6));

        for (Employee e:staff) {
            e.raiseSalary(5);
        }

        for (Employee e:staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireDay());
        }
    }
}
