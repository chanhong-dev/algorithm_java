package Java5;

import java.util.Scanner;
import java.util.Stack;

public class Java5_4 {
    public int solution(String str){
        Stack<Integer> stack = new Stack<>();
        for (char c :
                str.toCharArray()) {
            if(Character.isDigit(c)){
//                System.out.println(Character.getNumericValue(c));
                stack.push(Character.getNumericValue(c));
            }
            else{
                int op2 = stack.pop();
                int op1 = stack.pop();

                if(c == '+')
                    stack.push(op1 + op2);
                else if(c == '-')
                    stack.push(op1 - op2);
                else if(c == '*')
                    stack.push(op1 * op2);
                else
                    stack.push(op1 / op2);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args){
        Java5_4 java5_4 = new Java5_4();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(java5_4.solution(str));
    }
}
