package chapter4;

import java.time.LocalDate;

/**
 * @author 李志豪
 * @date 2019/7/10 20:27:48
 * @description
 */
public class EmployeeTest {
     static class Employee{
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String name, double salary, int year, int month, int day) {
            this.name = name;
            this.salary = salary;
            this.hireDay = LocalDate.of(year,month,day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void raiseSalary(double byPercent) {
            double raise = salary*byPercent/100;
            this.salary +=raise;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", hireDay=" + hireDay +
                    '}';
        }
    }
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("小明", 75000, 1986, 12, 12);
        staff[1] = new Employee("小红", 5000, 1992, 2, 22);
        staff[2] = new Employee("小浩", 25000, 1985, 8, 5);

        for (Employee e:staff) {
            e.raiseSalary(5);
            System.out.println(e.toString());
        }


    }
}
