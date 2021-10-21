import java.util.Scanner;

public class Java1_7 {
    public String solution(String str){
        int mid = str.length()/2;

        for (int i = 0; i < mid; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Java1_7 java1_7 = new Java1_7();

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(java1_7.solution(str));
    }
}
