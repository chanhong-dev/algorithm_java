package Java4;

import java.util.HashMap;
import java.util.Scanner;

public class Java4_2 {
    public String solution(String x, String y){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c: x.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : y.toCharArray()) {
            if(!hashMap.containsKey(c))
                return "NO";
            else if(hashMap.get(c) == 0)
                return "NO";
            else
                hashMap.replace(c,hashMap.get(c) - 1);
        }
        return "YES";
    }
    public static void main(String[] args) {
        Java4_2 java4_2 = new Java4_2();

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();

        System.out.println(java4_2.solution(x, y));
    }
}
