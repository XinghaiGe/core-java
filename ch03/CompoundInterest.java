package ch03;

/**
 * 二维数组
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // 设置增长率为  10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE+i) / 100.0;
        }

        double[][] balance = new double[NYEARS][NRATES];
        // 初始化本金
        for (int i = 0; i < balance[0].length; i++) {
            balance[0][i] = 10000;
        }
        // 计算收益
        for (int i = 1; i < balance.length; i++) {
            for (int j = 0; j < balance[i].length; j++) {
                double oldBalance = balance[i-1][j];

                double interest = oldBalance * interestRate[j];

                balance[i][j] = oldBalance + interest;
            }
        }

        // 输出
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100*interestRate[i]);
        }

        System.out.println();

        for (double[] ds : balance) {
            for (double ds2 : ds) {
                System.out.printf("%10.2f", ds2);
            }
            System.out.println();
        }
    }
}
