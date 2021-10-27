package Java2;

import java.util.Scanner;

public class Java2_7 {
    public int solution(int[] n){
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] == 1){
                temp++;
                answer += temp;
            }
            else
                temp = 0;
        }
        return answer;
    }
    public static void main(String[] args) {
        Java2_7 sample = new Java2_7();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(sample.solution(n));
    }
}
