package Java5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java5_6 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(true){
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size() == 1) {
                answer = queue.poll();
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Java5_6 java5_6 = new Java5_6();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(java5_6.solution(n, k));
    }
}
