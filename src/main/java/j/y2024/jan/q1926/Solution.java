package j.y2024.jan.q1926;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1926. Nearest Exit from Entrance in Maze
 * Breadth first search solution:
 * Visit cells from the entrance to four directions until the exit is found.
 * The visited cell should be marked as '+' to skip from visiting again.
 */
public class Solution {
    private int[][] directs = new int [][] {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        int steps = -1;
        maze[entrance[0]][entrance[1]] = '+';
        int rows = maze.length - 1;
        int cols = maze[0].length - 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                // Find one exit then return, the steps is the minimum step.
                // If the exit is also the entrance, it shouldn't be an answer.
                if ((row == 0 || col == 0 || row == rows || col == cols)
                        && !(entrance[0] == row && entrance[1] == col)) {
                    return steps;
                }
                // Check the next path to go.
                for (int[] direct : directs) {
                    int r = row + direct[0];
                    int c = col + direct[1];
                    if (r < 0 || c < 0 || r > rows || c > cols || maze[r][c] == '+') {
                        continue;
                    }
                    queue.offer(new int[] {r, c});
                    maze[r][c] = '+';
                }

            }
        }
        return -1;
    }
}
