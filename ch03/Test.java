package ch03;

public class Test {
    public static void main(String[] args) {
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
        
        System.out.println(0B00011101);
        System.out.println(0X5F3759DF);
        System.out.println(1_000_000_000);
        System.out.println(010);
        System.out.println(0x1.0p-3);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);

        System.out.println('\u2122');
    }
}
