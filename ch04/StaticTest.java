package ch04;

/**
 * 该程序展示静态方法和静态域
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        // 初始化
        staff[0] = new Employee("Svenio", 75000);
        staff[1] = new Employee("CAN", 70000);
        staff[2] = new Employee("Waterman", 75000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }

}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public static int getNextId() {
        return nextId;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Romeo", 50000);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
