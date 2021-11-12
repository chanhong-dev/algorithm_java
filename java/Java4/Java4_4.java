package Java4;

import java.util.HashMap;
import java.util.Scanner;

public class Java4_4 {
    public int solution(String S, String T){
        int count = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        int L = T.length()-1;
        int lt = 0;
        for (char c : T.toCharArray()) {
            bm.put(c, bm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < L; i++) {
            am.put(S.charAt(i), am.getOrDefault(S.charAt(i), 0 ) + 1);
        }
        for (int i = L; i < S.length(); i++) {
            am.put(S.charAt(i), am.getOrDefault(S.charAt(i),0) + 1);
            if(am.equals(bm))
                count++;
            am.put(S.charAt(lt), am.get(S.charAt(lt))-1);
            if(am.get(S.charAt(lt)) == 0 )
                am.remove(S.charAt(lt));
            lt++;
        }

        return count;
    }
    public static void main(String[] args) {
        Java4_4 java4_4 = new Java4_4();

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(java4_4.solution(S, T));
    }
}
