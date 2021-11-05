package Java4;

import java.util.HashMap;
import java.util.Scanner;

public class Java4_1 {
    public char solution(int num, String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        char answer = ' ';
        for (char c :
                str.toCharArray()) {
            hashMap.put(c, 0);
        }
        for (char c :
                str.toCharArray()) {
            hashMap.replace(c, hashMap.get(c)+1);
            if(max < hashMap.get(c)){
                max = hashMap.get(c);
                answer = c;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Java4_1 java4_1 = new Java4_1();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(java4_1.solution(num, str));
    }
}
