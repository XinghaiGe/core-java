package ch03;

import java.util.Scanner;

/**
 * 该程序展示命令行输入
 * @version 1.0 2025-06-03
 * @author XinghaiGe
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 输入姓名
        System.out.println("你叫什么名字？");
        String name = in.nextLine();

        // 输入年龄
        System.out.println("你多大了？");
        int age = in.nextInt();

        // 输出信息
        System.out.println("你好，" + name + "。明年你" + (age + 1) + "岁。");

        in.close();
    }
}
