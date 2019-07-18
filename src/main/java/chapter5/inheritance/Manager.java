package chapter5.inheritance;

/**
 * @author 李志豪
 * @date 2019/7/10 22:25:59
 * @description
 */
public class Manager extends Employee {
    private  double bonus;

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     * */

    public Manager(String name, double salary, int year, int month, int day){
        super(name,salary,year,month,day);//调用父类构造器
        bonus=0;
    }

    @Override
    public double getSalary() {
        double basesalary = super.getSalary();
        return basesalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
