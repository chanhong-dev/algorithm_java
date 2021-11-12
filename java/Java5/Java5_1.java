package Java5;

import java.util.Scanner;
import java.util.Stack;

public class Java5_1 {
    public String solution(String str){
        Stack <Character> stack = new Stack<>();
        for (char c :
                str.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty())
                    return "NO";
                else
                    stack.pop();
            }
        }
        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) {
        Java5_1 java5_1 = new Java5_1();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(java5_1.solution(str));
    }
}
