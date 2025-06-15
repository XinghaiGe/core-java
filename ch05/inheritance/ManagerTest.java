package ch05.inheritance;

import ch05.pojo.Employee;
import ch05.pojo.Manager;

/**
 * 该程序展示继承
 * @version 1.0
 * @author Svenio
 */
public class ManagerTest {
    public static void main(String[] args) {
        // 构造一个 Manager 对象
        Manager boss = new Manager("Svenio", 10000, 2003, 02, 15);
        boss.setBonus(100);
        // System.out.println(boss.getSalary());S

        Employee[] staff = new Employee[3];

        // 使用 Manager 和  Employee 对象初始化 staff 数组
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // 输出所有 Employee 对象的信息
        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}
