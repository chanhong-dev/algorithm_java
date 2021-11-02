package Java3;

import java.util.Scanner;

public class Java3_4 {
    public int solution(int N, int K, int[] arr) {
        int sum = 0;
        int count = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum == K)
                count++;
            while (sum >= K) {
                sum -= arr[idx++];
                if (sum == K)
                    count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Java3_4 java3_4 = new Java3_4();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(java3_4.solution(N, K, arr));
    }
}
