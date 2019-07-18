package chapter5.arrayList;



import java.time.LocalDate;

/**
 * @author 李志豪
 * @date 2019/7/10 22:25:36
 * @description
 */
public class Employee  {
    private  String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * @return
     */
    public String getDescription() {
        return String.format("an emplpyee with a salary of $%.2f",salary );
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent/100;
        this.salary +=raise;
    }
}
