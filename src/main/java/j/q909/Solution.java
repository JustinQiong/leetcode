package j.q909;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        boolean[] visited = new boolean[n * n];
        visited[0] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int steps = 0;
        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int idx = queue.poll();
                for (int j = 1; j <= 6; j++) {
                    int next = next(board, idx + j);
                    if (next == n * n) {
                        return steps;
                    }

                    if (!visited[next - 1]) {
                        queue.offer(next);
                    }

                    visited[next - 1] = true;
                }
            }
        }

        return -1;

    }

    private int next(int[][] board, int idx) {
        int n = board.length;
        int row = idx - 1 / n;
        int col = idx - 1 % n;
        if (row % 2 == 1) {
            col = n - 1 - col;
        }
        if (board[n - 1 - row][col] == -1) {
            return idx;
        }

        return board[row][col];
    }
}
