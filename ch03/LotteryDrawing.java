package ch03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 该程序展示数组操作
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("你想抽取多少个数字？");
        int k = in.nextInt(); // 6

        System.out.print("你能抽取的最大数字？");
        int n = in.nextInt(); // 50


        // 填充数组为 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 结果数组
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // Math.random(): [0, 1)
            // r: [0, n)
            int r = (int)(Math.random() * n); 

            result[i] = numbers[r];

            // 缩小随机数生成空间
            numbers[r] = numbers[n-1];
            n--;
        }

        // 输出
        Arrays.sort(result);
        System.out.println("结果如下：");
        for (int i : result) {
            System.out.println(i);
        }
    }
}
