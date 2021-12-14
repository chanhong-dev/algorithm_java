package Java5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java5_8 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Patient patient = new Patient(i, arr[i]);
            queue.offer(patient);
        }

        while(!queue.isEmpty()){
            Patient temp = queue.poll();
            for (Patient p : queue) {
                if(temp.priority < p.priority){
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null){
                answer++;
                if(temp.id == m)
                    return answer;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Java5_8 java5_8 = new Java5_8();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(java5_8.solution(n, m, arr));
    }
}

class Patient{
    int id;
    int priority;

    public Patient(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}