package Java1;

import java.util.Scanner;

public class Java1_6 {
    public String solution(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i){
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Java1_6 java1_6 = new Java1_6();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(java1_6.solution(str));
    }
}

//indexOf()는 특정 문자열에서 "처음 발견"되는 인덱스 반환