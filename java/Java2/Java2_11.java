package Java2;

import java.util.Scanner;

public class Java2_11 {
    public int solution(int num, int[][] n){
        int answer = 0;
        int max = 0;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(n[i][k] == n[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count > max){
                max = count;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Java2_11 java2_11 = new Java2_11();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+1][6];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(java2_11.solution(num, arr));
    }
}
