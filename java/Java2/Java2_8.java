package Java2;

import java.util.Scanner;

public class Java2_8 {
    public int[] solution(int[] n){
        int[] answer = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int count = 1;
            for (int j = 0; j < n.length; j++) {
                if(n[i] < n[j])
                    count++;
            }
            answer[i] = count;
        }
        return answer;
    }
    public static void main(String[] args) {
        Java2_8 java2_8 = new Java2_8();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        for(int k : java2_8.solution(n)){
            System.out.print(k+" ");
        }
    }
}
