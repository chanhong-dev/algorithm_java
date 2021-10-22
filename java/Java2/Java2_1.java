package Java2;

import java.util.Scanner;

public class Java2_1 {
    public int[] solution(int[] n){
        System.out.print(n[0]+" ");
        for (int i = 1; i < n.length; i++) {
            if(n[i] > n[i-1]){
                System.out.print(n[i]+" ");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Java2_1 java2_1 = new Java2_1();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        java2_1.solution(n);
    }
}
