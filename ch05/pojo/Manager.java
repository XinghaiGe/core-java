package ch05.pojo;

public class Manager extends Employee{

    private double bonus;

    /**
     * 构造函数
     * @param n 姓名
     * @param s 工资
     * @param year 入职年份
     * @param month 入职月份
     * @param day 入职日期
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    /**
     * 设置{@code Manager}的奖金
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 计算{@code Manager}的薪资
     * @return 薪资
     */
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    
    public static void main(String[] args) {
        Manager boss = new Manager("svenio", 10000, 2003, 02, 15);
        boss.setBonus(100);
        System.out.println(boss.getSalary());

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10,1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}
