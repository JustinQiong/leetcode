package j.y2024.jan.q1466;

import java.util.ArrayList;
import java.util.List;

/**
 * 1466. Reorder Routes to Make All Paths Lead to the City Zero
 * Depth first search solution:
 * Build tree base on the connections. Depth first search
 * the tree from root node 0.
 * If the edge is reversed from parent to child, accumulated
 * and return.
 */
public class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] tree = new List[n];
        for (int i=0; i<n; i++) {
            tree[i] = new ArrayList<int[]>();
        }

        for (int[] con : connections) {
            tree[con[0]].add(new int[]{con[1], 1});
            tree[con[1]].add(new int[]{con[0], 0});
        }
        return dfs(0, -1, tree);
    }

    private int dfs(int x, int parent, List<int[]>[] tree) {
        int res = 0;

        for (int[] edge : tree[x]) {
            if (edge[0] == parent) {
                continue;
            }
            res += edge[1] + dfs(edge[0], x, tree);
        }

        return res;
    }
}
