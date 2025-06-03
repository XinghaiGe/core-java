package ch03;

import java.util.Scanner;

/**
 * 该程序展示 while 循环
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少退休金？");
        double goal = in.nextDouble();

        System.out.print("你每年净收入？");
        double payment = in.nextDouble();

        System.out.print("年利率：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.printf("你可以在%d年后退休。\n", years);
    }
}
