package Java2;

import java.util.Scanner;

public class Java2_3 {
    public void solution(int num, int[] a, int[] b){
        for (int i = 0; i < num; i++) {
            if(a[i] == b[i])
                System.out.println("D");
            else if(a[i] == 1 && b[i] == 3)
                System.out.println("A");
            else if(a[i] == 2 && b[i] == 1)
                System.out.println("A");
            else if(a[i] == 3 && b[i] == 2)
                System.out.println("A");
            else
                System.out.println("B");
        }
    }
    public static void main(String[] args) {
        Java2_3 java2_3 = new Java2_3();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a[] = new int[num];
        int b[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
        }
        java2_3.solution(num, a, b);
    }
}
