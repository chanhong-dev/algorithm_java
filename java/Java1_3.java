import java.util.Scanner;

public class Java1_3 {
    public String solution(String str){
        int max = 0;
        String temp = "";
        String[] arr = str.split(" ");
        for(String s : arr){
            if(s.length() > max) {
                max = s.length();
                temp = s;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Java1_3 java1_3 = new Java1_3();
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(java1_3.solution(str));
    }
}
