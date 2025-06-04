package ch04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;

public class Test {
    Date data = new Date();
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(new Date());

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }
}