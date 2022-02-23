package Section4_递归和动态规划.A1_斐波那契数列问题的递归和动态规划;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mine_Advanced {
    public static long[][] matrixcheng(long[][] m1, long[][] m2) {
        long[][] res = new long[m1.length][m2[0].length];
        long tmp = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                tmp = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    tmp += m1[i][k] * m2[k][j];
                }
                res[i][j] = tmp;
            }
        }
        return res;
    }

    public static long[][] matrixpower(long[][] m, long p) {
        long[][] res = new long[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        long[][] tmp = m;
        while (p != 0) {
            if ((p & 1) != 0) {
                res = matrixcheng(res, tmp);
            }
            tmp = matrixcheng(tmp, tmp);
            p >>= 1;
        }
        return res;
    }

    public static long f3(long n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        long[][] m = new long[][]{{1,1},{1,0}};
        long[][] ans = matrixpower(m, n - 1);
        return ans[0][0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        String[] inputLine = str.split(" ");
        long m =  Long.parseLong(inputLine[0]);
        long ans = f3(m) % 1000000007;
        System.out.println(ans);
    }
}
