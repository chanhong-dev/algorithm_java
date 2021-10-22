package Java1;

import java.util.Scanner;

public class Java1_12 {
    public String solution(int num, String str){
        String answer = "";
        for (int i = 0; i < num; i++) {
            String temp = str.substring(0,7).replace('#','1').replace('*','0');
//            System.out.println(temp);
            int decimal = Integer.parseInt(temp, 2);
//            System.out.println(decimal);
            answer += (char)decimal;
            str = str.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Java1_12 java1_12 = new Java1_12();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        System.out.println(java1_12.solution(num, str));
    }
}

//.substring(0, 7)  0-6 인덱스의 값을 가져온다.  두 번째 인자 값 -1 인덱스!
//.substring(7) 7~ 인덱스의 값
// https://mine-it-record.tistory.com/131
// int to ascii  : (char)num