package Java6;

import java.util.Scanner;

public class Java6_1 {
    public int[] solution(int n, int[] arr){
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Java6_1 java6_1 = new Java6_1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : java6_1.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
