package Java4;

import java.util.Scanner;

public class Java4_5 {
    public int solution(int N, int K, int[] num){

        return 0;
    }
    public static void main(String[] args) {
        Java4_5 java4_5 = new Java4_5();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();;
        int K = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(java4_5.solution(N, K, num));
    }
}
