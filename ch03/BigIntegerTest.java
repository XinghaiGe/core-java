package ch03;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 该程序展示 for 循环
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你想抽取多少个数字？");
        int k = in.nextInt(); // 60

        System.out.print("你能抽取的最大数字？");
        int n = in.nextInt(); // 490

        /*
         * 组合公式：n*(n-1)*...*(n-k+1)/(1*2*...*k)
         */
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("你的概率是 1/" + lotteryOdds + " ，祝你好运！"); // 71639...
    }
}
