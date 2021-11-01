package Java3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java3_1 {
    public ArrayList<Integer> solution(int n, int m, ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.addAll(a);
        answer.addAll(b);
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Java3_1 java3_1 = new Java3_1();

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < num1; i++) {
            a.add(sc.nextInt());
        }
        int num2 = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < num2; i++) {
            b.add(sc.nextInt());
        }

        for (int c :
                java3_1.solution(num1, num2, a, b)) {
            System.out.print(c + " ");
        }
    }
}
