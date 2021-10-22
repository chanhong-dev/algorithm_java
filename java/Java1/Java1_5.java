package Java1;

import java.util.Scanner;

public class Java1_5 {
    public String solution(String str){
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Java1_5 java1_5 = new Java1_5();

        String str = in.nextLine();
        System.out.println(java1_5.solution(str));
    }
}
