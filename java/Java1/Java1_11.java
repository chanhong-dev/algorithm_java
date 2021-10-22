package Java1;

import java.util.Scanner;

public class Java1_11 {
    public String solution(String str){
        String  answer = "";
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if( str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                answer += str.charAt(i);
                if(count > 1 ) {
                    answer += Integer.toString(count);
                    count = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Java1_11 java1_11 = new Java1_11();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str + "a";
        System.out.println(java1_11.solution(str));
    }
}

// i 번째 인덱스의 값과 i+1인덱스 값 비교를 위해 str 뒤에 임의의 문자 추가 (대문자만 입력 받는다 하여 소문자 a 넣었음)
