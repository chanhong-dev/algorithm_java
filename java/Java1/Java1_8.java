package Java1;

import java.util.Scanner;

public class Java1_8 {
    public String solution(String str){
        /*
         str = str.replaceAll("[,: ;]","");
         System.out.println(str);
        */
        str = str.replaceAll("[^a-z]","");
        int mid = str.length()/2;

        for (int i = 0; i < mid; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Java1_8 java1_8 = new Java1_8();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(java1_8.solution(str));
    }
}

// 검색 키워드 : 자바 정규표현식   / replaceALl(대상, 바꿀 문자열)