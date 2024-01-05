package j.y2024.jan.q399;

import java.util.*;

/**
 * 399. Evaluate Division
 * Breadth first search solution:
 * Build tree from equations list and values array.
 * Record the paths of the tree by Pair of index and value of each
 * variable.
 * Search query result by breadth first search.
 */
public class Solution {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        List<List<String>> eq = equations;
        Map<String, Integer> vars = new HashMap<>();
        int index = 0;
        // Map variables with index
        for (int i=0; i<eq.size(); i++) {
            String a = eq.get(i).get(0);
            String b = eq.get(i).get(1);
            if (!vars.containsKey(a)) {
                vars.put(a, index++);
            }
            if (!vars.containsKey(b)) {
                vars.put(b, index++);
            }
        }

        // Build tree
        List<Pair>[] tree = new List[vars.size()];
        for (int i=0; i<tree.length; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i=0; i<eq.size(); i++) {
            int ia = vars.get(eq.get(i).get(0));
            int ib = vars.get(eq.get(i).get(1));
            tree[ia].add(new Pair(ib, values[i]));
            tree[ib].add(new Pair(ia, 1.0D/values[i]));
        }

        double[] res = new double[queries.size()];
        for (int i=0; i<queries.size(); i++) {
            List<String> query = queries.get(i);
            String a = query.get(0);
            String b = query.get(1);
            double result = -1.0D;
            if (vars.containsKey(a) && vars.containsKey(b)) {
                int ia = vars.get(a);
                int ib = vars.get(b);
                if (ia == ib) {
                    result = 1.0D;
                } else {
                    // Breadth first search for result
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(ia);
                    double[] re = new double[vars.size()];
                    Arrays.fill(re, -1);
                    re[ia] = 1.0D;
                    while(!queue.isEmpty() && re[ib] < 0) {
                        int x = queue.poll();
                        for (Pair pair : tree[x]) {
                            int y = pair.index;
                            double val = pair.value;
                            if (re[y]<0) {
                                re[y] = re[x] * val;
                                queue.offer(y);
                            }
                        }
                    }
                    result = re[ib];
                }
            }
            res[i] = result;
        }
        return res;
    }

    private static class Pair {
        double value;
        int index;
        Pair(int index, double value) {
            this.value= value;
            this.index = index;
        }
    }
}
