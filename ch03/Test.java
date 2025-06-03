package ch03;

import static java.lang.Math.*;

public class Test {
    public static void basicType() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5.0F;
        double f = 6.0;
        boolean g = false;
        char h = 'a';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    public static void binOctDecHex() {
        System.out.println(0B00011101);
        System.out.println(0X5F3759DF);
        System.out.println(1_000_000_000);
        System.out.println(010);
        System.out.println(0x1.0p-3);
    }

    public static void special() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
    }

    public static void unicode() {
        System.out.println('\u2122');
    }

    public static void math() {
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y); // 2.0

        y = Math.pow(x, 3);
        System.out.println(y); // 64

        System.out.println(Math.floorMod(5, 12)); // 5

        System.out.println(Math.sin(3.0));
        System.out.println(PI);

        System.out.println(exp(10));
        System.out.println(log(2));

        System.out.println((int) Math.round(9.997));
    }

    public enum Size {
        S, M, L, XL, XXL, XXXL;
    }

    public static void enumType() {
        Size size = Size.S;
        System.out.println(size);
    }

    public static void stringType() {
        String s = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(s);
        System.out.println("Hello".equals("Hello"));
        System.out.println("hello".equalsIgnoreCase("HELLO"));

        String greeting = "Hello";
        int n = greeting.length(); // 5
        System.out.println(n);

        int cpCount = greeting.codePointCount(0, n);
        System.out.println(cpCount);

        char first = greeting.charAt(0);
        char last  = greeting.charAt(4);
        System.out.println(first);
        System.out.println(last);

        int index = greeting.offsetByCodePoints(0, 1);
        System.out.println(index);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);
    }

    // StringBuilder 适用于单线程，StringBuffer 适用于多线程。
    public static void stringOther() {
        StringBuilder builder = new StringBuilder();
        builder.append('A');
        builder.append('B');
        System.out.println(builder.toString());
    }

    // strictfp, strict float point calculate(Under Java 17).
    public static strictfp void main(String[] args) {
        // Test.math();
        // Test.enumType();
        // Test.stringType();
        Test.stringOther();
    }
}
