package Java3;

import java.util.Scanner;

public class Java3_6 {
    public int solution(int N, int k, int[] arr){
        int count = 0;
        int max = 0, sum = 0;
        int lt = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i] == 0){
                count++;
                while(count > k){
                    if(arr[lt] == 0)
                        count--;
                    lt++;
                }
            }
            max = Math.max(max, i-lt+1);
//            System.out.print(max + " ");
        }
        return max;
    }

    public static void main(String[] args) {
        Java3_6 java3_6 = new Java3_6();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(java3_6.solution(N, k, arr));
    }
}
