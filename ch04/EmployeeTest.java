// package ch04;

// import java.time.LocalDate;

// public class EmployeeTest {
//     public static void main(String[] args) {
//         Employee[] staff = new Employee[3];

//         // 初始化
//         staff[0] = new Employee("Svenio", 75000, 2003, 02, 15);
//         staff[1] = new Employee("CAN", 70000, 2003, 05, 12);
//         staff[2] = new Employee("Waterman", 75000, 2002, 10, 03);

//         // 涨5%工资
//         for (Employee e : staff) {
//             e.raiseSalary(5);
//         }

//         // 输出
//         for (Employee e : staff) {
//             System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
//         }
//     }
// }

// class Employee {
//     private String name;
//     private double salary;
//     private LocalDate hireDay;

//     public Employee(String n, double s, int year, int month, int day) {
//         name = n;
//         salary = s;
//         hireDay = LocalDate.of(year, month, day);
//     }

//     public String getName() {
//         return name;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public LocalDate getHireDay() {
//         return hireDay;
//     }

//     public void raiseSalary(double byPercent) {
//         double raise = salary * byPercent / 100;
//         salary += raise;
//     }

//     public static void main(String[] args) {
//         Employee e  =new Employee("Romeo", 50000, 2003, 3, 31);
//         e.raiseSalary(10);
//         System.out.println(e.getName() + " " + e.getSalary());
//     }
// }
