package Java4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Java4_5 {
    public int solution(int N, int K, int[] num){
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int l = j + 1; l < N; l++) {
                    Tset.add(num[i] + num[j] + num[l]);
                }
            }
        }
        int cnt = 0;
        for (int x :
                Tset) {
            cnt++;
            if(cnt == K)
                return x;
        }
        return -1;
    }
    public static void main(String[] args) {
        Java4_5 java4_5 = new Java4_5();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();;
        int K = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(java4_5.solution(N, K, num));
    }
}
