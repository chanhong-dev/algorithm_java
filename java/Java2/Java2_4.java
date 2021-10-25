package Java2;

import java.util.Scanner;

public class Java2_4 {
    public int[] solution(int num){
        int[] answer = new int[num];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < num; i++) {
            answer[i]  = answer[i-1] + answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args) {
        Java2_4 java2_4 = new Java2_4();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int n : java2_4.solution(num)){
            System.out.print(n + " ");
        }
    }
}
