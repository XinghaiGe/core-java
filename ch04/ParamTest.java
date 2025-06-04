package ch04;

/**
 * 此方法展示参数传递
 */
public class ParamTest {
    public static void main(String[] args) {
        // 测试1：方法不能修改数值参数
        System.out.println("测试三倍：");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percnet=" + percent);

        // 测试2：方法可以修改对象参数
        System.out.println("\n测试三倍工资：");
        Employee1 harry = new Employee1("Harry", 50000);
        System.out.println("Before salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        // 测试3：方法不能将新对象赋值给对象参数
        System.out.println("\n交换测试");
        Employee1 a = new Employee1("Alice", 70000);
        Employee1 b = new Employee1("Bob", 60000);

        System.out.println("Before a=" + a.getName());
        System.out.println("Before b=" + b.getName());
        swap(a, b);
        System.out.println("After a=" + a.getName());
        System.out.println("After b=" + b.getName());
    }

    public static void tripleValue(double x) { // doesn't work
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee1 x) { // work
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee1 x, Employee1 y) {
        Employee1 temp = x;
        x = y;
        y = temp;
    }

}

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}