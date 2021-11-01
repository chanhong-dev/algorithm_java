package Java3;

import java.util.Scanner;

public class Java3_3 {
    public int solution(int N, int K, int[] arr){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        max = sum;
        for (int i = K; i < N; i++) {
            sum = sum + arr[i] - arr[i-K];
            max = Math.max(sum, max);
        }
        return max;
    }
    public static void main(String[] args) {
        Java3_3 java3_3 = new Java3_3();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(java3_3.solution(N, K, arr));
    }
}
