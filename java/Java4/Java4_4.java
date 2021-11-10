package Java4;

import java.util.HashMap;
import java.util.Scanner;

public class Java4_4 {
    public int solution(String S, String T){
        int count = 0;
        HashMap<Character, Integer> HM1 = new HashMap<>();
        HashMap<Character, Integer> HM2 = new HashMap<>();

        for (char c : T.toCharArray()) {
            HM2.put(c, HM2.getOrDefault(c, 0) + 1);
        }

        return 0;
    }
    public static void main(String[] args) {
        Java4_4 java4_4 = new Java4_4();

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(java4_4.solution(S, T));
    }
}
