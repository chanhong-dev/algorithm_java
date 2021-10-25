package Java2;

import java.util.Scanner;

public class Java2_5 {
    /*
    Time Limit Exceeded
    public int solution(int num){
        int answer = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 1; j <= num; j++) {
                if(i % j == 0)count++;
            }
            if(count == 2) answer ++;
        }

        return answer;
    }
    */
    public int solution(int num){
        int answer = 0;
        int[] temp = new int[num+1];
        for (int i = 2; i <= num; i++) {
//            System.out.println(i +" "+ temp[i]);
            if(temp[i] == 0) {
                answer++;
                for (int j = i; j <= num; j += i) {
                    temp[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Java2_5 java2_5 = new Java2_5();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(java2_5.solution(num));
    }
}
