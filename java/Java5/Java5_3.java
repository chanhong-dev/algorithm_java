package Java5;

import java.util.Scanner;
import java.util.Stack;

public class Java5_3 {
    public int solution(int n, int[][] board, int[] moves){
        Stack<Integer> stack = new Stack<>();
        int last;
        int count = 0;
        for (int x : moves) {
            x -=1 ;
            for (int i = 0; i < n; i++) {
                if(board[i][x] != 0){
                    last = board[i][x];
                    board[i][x] = 0;
                    if(!stack.isEmpty() && stack.peek() == last) {
                        count += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(last);
                    }
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Java5_3 java5_3 = new Java5_3();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(java5_3.solution(n, board, moves));
    }
}
