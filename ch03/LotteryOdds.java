package ch03;

import java.util.Scanner;

/**
 * 该程序展示 for 循环
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你想抽取多少个数字？");
        int k = in.nextInt();

        System.out.print("你能抽取的最大数字？");
        int n = in.nextInt();

        /*
         * 组合公式：n*(n-1)*...*(n-k+1)/(1*2*...*k)
         */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n-i+1)/i;
        }

        System.out.println("你的概率是 1/" + lotteryOdds + " ，祝你好运！");
    }
}
