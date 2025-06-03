package ch03;

import java.io.Console;

public class MyInputTest {
    // 读取密码，读取后需要立刻覆盖 passwd 数组，以免密码泄露。
    public static void main(String[] args) {
        Console cons = System.console();
        String name = cons.readLine("Username:");
        char[] passwd = cons.readPassword("Password:");
        System.out.println(name);
        for (char passwd2 : passwd) {
            System.out.print(passwd2);
        }
    }
}
