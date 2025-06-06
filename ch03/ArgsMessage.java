package ch03;

public class ArgsMessage {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.print("Hello, ");
        } else if (args[0].equals("-g")) {
            System.out.print("Goodbye,");
        }

        // print other args
        for (int i = 1; i < args.length; i++) {
            System.out.printf(" " + args[i]);
        }
        System.out.println();
    }
}
