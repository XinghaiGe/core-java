package ch04;

import java.time.LocalDate;
import java.util.Date;

public class Test {
    Date data = new Date();
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(new Date());
    }
}