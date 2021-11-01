package Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java3_2 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(p1 < n && p2 <m){
            if(a[p1] == b[p2]){
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            else if(a[p1] > b[p2])
                p2++;
            else
                p1++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Java3_2 java3_2 = new Java3_2();

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] a = new int[num1];
        for (int i = 0; i < num1; i++) {
            a[i] = sc.nextInt();
        }
        int num2 = sc.nextInt();
        int[] b = new int[num2];
        for (int i = 0; i < num2; i++) {
            b[i] = sc.nextInt();
        }

        for (int c :
                java3_2.solution(num1, num2, a, b)) {
            System.out.print(c + " ");
        }
    }
}
