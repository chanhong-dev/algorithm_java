package Java3;

import java.util.Scanner;

public class Java3_5 {
    public int solution(int num){
        int temp = num / 2 + 1;
        int sum = 0, count = 0;
        int lt = 0, rt = 0;
        int[] arr = new int[temp];

        for (int i = 0; i < temp; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < temp; i++) {
            sum += arr[rt];
            if(sum == num){
                count++;
            }
            while(sum >= num){
                sum -= arr[lt];
                lt++;
                if(sum == num)
                    count++;
            }
            rt++;
        }

        return count;
    }
    public static void main(String[] args) {
        Java3_5 java3_5 = new Java3_5();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(java3_5.solution(num));
    }
}
