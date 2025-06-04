package ch04;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Harry", 40000);
        staff[1] = new Employee2(60000);
        staff[2] = new Employee2();

        for (Employee2 e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee2 {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    // 只执行一次
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // 构造对象时执行
    {
        id = nextId;
        nextId++;
    }

    public Employee2(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee2(double s) {
        this("Employee #" + nextId, s);

    }

    public Employee2() {
        // "" 0
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
}