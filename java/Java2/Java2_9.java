package Java2;

import java.util.Scanner;

public class Java2_9 {
    public int solution(int num, int[][] n){
        int line_sum = 0;
        int row_sum = 0;
        int diagonal_sum1 = 0;
        int diagonal_sum2 = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            line_sum = row_sum = 0;
            diagonal_sum1 += n[i][i];
            diagonal_sum2 += n[i][num-i-1];
            max = Math.max(max, Math.max(diagonal_sum1, diagonal_sum2));
            for (int j = 0; j < num; j++) {
                line_sum += n[i][j];
                row_sum += n[j][i];
            }
            max = Math.max(max, line_sum);
            max = Math.max(max, row_sum);
        }

        return max;
    }
    public static void main(String[] args) {
        Java2_9 java2_9 = new Java2_9();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(java2_9.solution(num, arr));
    }
}
