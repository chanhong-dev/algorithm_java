import java.util.Scanner;

public class Java1_10 {
    public int[] solution(String str, char c){
        int[] result = new int[str.length()];
        int temp=1000;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                temp = 0;
            }
            else {
                temp++;
            }
            result[i] = temp;
        }
        temp=1000;
        for (int i = str.length()-1; i >= 0 ; i--) {
            if(str.charAt(i) == c) {
                temp = 0;
            }
            else {
                temp++;
            }
            result[i] = Math.min(result[i], temp);
        }

        return result;
    }
    public static void main(String[] args) {
        Java1_10 java1_10 = new Java1_10();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for( int num : java1_10.solution(str, c)){
            System.out.print(num+" ");
        }
    }
}
