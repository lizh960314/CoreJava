package chapter4;

/**
 * @author 李志豪
 * @date 2019/7/10 22:05:14
 * @description
 */
public class StaticTest {

    static class Employee{
        private static int nextId = 1;

        private String name;
        private double salary;
        private int id;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
            this.id = 0;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public int getId() {
            return id;
        }

        public void setId() {
            id = nextId;
            nextId++;
        }

        public static int getNextId(){
            return nextId;
        }

        public static void main(String[] args) {
            Employee e = new Employee("Harry", 50000);
            System.out.println(e.getName()+" "+e.getSalary());
            System.out.println();
        }
    }

}
