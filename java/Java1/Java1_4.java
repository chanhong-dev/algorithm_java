package Java1;

import java.util.Scanner;

public class Java1_4 {
    public void solution(String[] str){
        for (String s : str) {
            StringBuffer stringBuffer = new StringBuffer(s);
            System.out.println(stringBuffer.reverse());
        }
    }
    public static void main(String[] args) {
        Java1_4 java1_4 = new Java1_4();
        Scanner in=new Scanner(System.in);

        int count = in.nextInt();
        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.next();
        }
        java1_4.solution(arr);
    }
}
