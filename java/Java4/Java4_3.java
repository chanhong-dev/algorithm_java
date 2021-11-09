package Java4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java4_3 {
    /*
    Time limit exceeded
    public ArrayList<Integer> solution(int N, int K, int[] num){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N-K+1; i++) {
            for (int j = 0; j < K; j++) {
                hashMap.put(num[i+j], hashMap.getOrDefault(num[i+j], 1) + 1);
            }
            answer.add(hashMap.size());
            hashMap.clear();
        }

        return answer;
    }
    */
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Java4_3 java4_3 = new Java4_3();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        for (int n :
                java4_3.solution(N, K, num)) {
            System.out.print(n + " ");
        }
    }
}
