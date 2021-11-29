package Java5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java5_7 {
    public String solution(String str1, String str2){
        Queue<Character> queue = new LinkedList<>();
        for (char c :str1.toCharArray()) {
            queue.offer(c);
        }
        for (char c : str2.toCharArray()) {
            if(queue.contains(c)){
                if(c != queue.poll()){
                    return "NO";
                }
            }
        }
        if(!queue.isEmpty()){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Java5_7 java5_7 = new Java5_7();

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(java5_7.solution(str1, str2));
    }
}
