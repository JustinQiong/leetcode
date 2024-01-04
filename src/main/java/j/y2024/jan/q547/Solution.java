package j.y2024.jan.q547;

/**
 * 547. Number of Provinces
 * Recursively depth first search by paths.
 * Mark the city visited and do not visit it again.
 * Every new starting point is a new provinces.
 *
 */
public class Solution {
    private int[] visited;
    private int res = 0;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        visited = new int[n];
        for (int i=0; i<n; i++) {
            start(isConnected, i);
        }

        return res;
    }

    private void start(int[][] isConnected, int i) {
        if (visited[i] == 1) {
            return;
        }

        res++;
        dfs(isConnected, i);
    }

    private void dfs(int[][] isConnected, int index) {
        if (visited[index] == 1) {
            return;
        }

        visited[index] = 1;
        int[] connected = isConnected[index];
        int n = connected.length;
        for (int i=0; i<n; i++) {
            if (connected[i] == 1) {
                dfs(isConnected, i);
            }
        }
    }
}
