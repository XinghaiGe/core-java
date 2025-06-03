package ch03;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIoTest {
    public static void main(String[] args) {
        Scanner in = null;
        System.out.println(System.getProperty("user.dir"));
        try {
            in = new Scanner(Paths.get("ch03\\sample.txt"), "UTF-8");
            System.out.println(in.nextLine());
            in.close();

            PrintWriter out = new PrintWriter("ch03\\sample.txt", "UTF-8");
            out.append("new");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
