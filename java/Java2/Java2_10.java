package Java2;

import java.util.Scanner;

public class Java2_10 {
    public int solution(int num, int[][] n){
        int  answer = 0;
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < num+1; j++) {

                int temp = n[i][j];
                if(temp > n[i-1][j] &&
                temp > n[i+1][j] &&
                temp > n[i][j-1] &&
                temp > n[i][j+1])
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Java2_10 java2_10 = new Java2_10();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+2][num+2];
        for (int i = 0; i < num+2; i++) {
            for (int j = 0; j < num+2; j++) {
                if(i == 0 || i == num+1 || j == 0 || j == num+1)
                    arr[i][j] = 0;
                else
                    arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(java2_10.solution(num, arr));
    }
}
