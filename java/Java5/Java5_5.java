package Java5;

import java.util.Scanner;
import java.util.Stack;

public class Java5_5 {
    public int solution(String str){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        char tmp = ' ';
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else{
                stack.pop();
                if( tmp == '(')
                    count += stack.size();
                else
                    count++;
            }
            tmp = c;
        }

        return count;
    }
    public static void main(String[] args){
        Java5_5 java5_5 = new Java5_5();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(java5_5.solution(str));
    }
}
