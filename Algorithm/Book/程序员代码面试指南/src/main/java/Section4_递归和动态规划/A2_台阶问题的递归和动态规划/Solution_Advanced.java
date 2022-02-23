package Section4_递归和动态规划.A2_台阶问题的递归和动态规划;

public class Solution_Advanced {
    public int[][] matrixcheng(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];
        int tmp = 0;
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

    public int[][] matrixpower(int[][] m, int k) {
        int[][] matrix_power = new int[m.length][m.length];
        if (k == 0) {
            for (int i = 0; i < m.length; i++) {
                matrix_power[i][i] = 1;
            }
        }else if (k == 1) {
            matrix_power = m;
        }else {
            matrix_power = m;
            for (int i = 0; i < k - 1; i++) {
                matrix_power = matrixcheng(matrix_power, m);
            }
        }
        return matrix_power;
    }

    public int clibStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[][] helpmatrix = new int[][]{{1, 1}, {1, 0}};
        int[][] ans = matrixpower(helpmatrix, n - 1);
        return ans[0][0] + ans[1][0];
    }

    public static void main(String[] args) {
        Solution_Advanced s = new Solution_Advanced();
        int l = s.clibStairs(3);
        System.out.println(s.clibStairs(3));
        int[][] m1 = new int[][]{{1, 1, 0}, {2, 1, 3}};
        int[][] m2 = new int[][]{{2, 1}, {3, 2}, {0, 1}};
        int[][] res = s.matrixcheng(m1, m2);
        for (int[] i : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

