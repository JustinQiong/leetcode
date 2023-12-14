package j.y2023.q210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    int[] indegs;
    int[] res;
    List<List<Integer>> edges;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>());
        }
        indegs = new int[numCourses];
        res = new int[numCourses];
        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
            indegs[info[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegs[i] == 0) {
                queue.offer(i);
            }
        }

        int visited = 0;
        int idx = 0;
        while (!queue.isEmpty()) {
            visited++;
            int out = queue.poll();
            res[idx++] = out;
            for (int edge : edges.get(out)) {
                indegs[edge]--;
                if (indegs[edge] == 0) {
                    queue.offer(edge);
                }
            }
        }

        if (visited != numCourses) {
            return new int[0];
        }

        return res;
    }
}
