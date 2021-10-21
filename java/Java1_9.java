import java.util.Scanner;

public class Java1_9 {
    public int solution(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
        Java1_9 java1_9 = new Java1_9();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(java1_9.solution(str));
    }
}

//java String to int   / isDigit