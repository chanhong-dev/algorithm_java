package Java5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Java5_2 {
    public ArrayList<Character> solution(String str){
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> arr = new ArrayList<>();
        for (char c :
                str.toCharArray()) {
            if(c == '(')
                stack.push(c);
            else if(c == ')')
                stack.pop();
            else if(stack.isEmpty())
                arr.add(c);
        }
        return arr;
    }
    public static void main(String[] args) {
        Java5_2 java5_2 = new Java5_2();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (char c :
                java5_2.solution(str)) {
            System.out.print(c);
        }
    }
}
