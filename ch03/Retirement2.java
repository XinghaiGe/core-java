package ch03;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("你每年净收入？");
        double payment = in.nextDouble();

        System.out.print("年利率：");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        String input;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;

            System.out.printf("%d年后，你的余额是￥%,.2f\n", years,balance);

            System.out.println("准备退休吗（Y/N）");
            input = in.next();
        }while (input.equals("N"));

        System.out.printf("你可以在%d年后退休。\n", years);
        in.close();
    }
}
