package Java1;

import java.util.*;

public class Java1_1 {
    public int search(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i))
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        Java1_1 java1_1 = new Java1_1();
        Scanner in=new Scanner(System.in);
        String str = in.next().toLowerCase();
        char c = in.next().charAt(0);
        System.out.println(java1_1.search(str, Character.toLowerCase(c)));
    }
}