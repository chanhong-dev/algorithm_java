package Java2;

import java.util.Scanner;

public class Java2_2 {
    public int solution(int[] height){
        int count = 1;
        int max = height[0];
        for (int i = 1; i < height.length; i++) {
            if(max < height[i]){
               max = height[i];
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Java2_2 java2_2 = new Java2_2();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(java2_2.solution(height));
    }
}
