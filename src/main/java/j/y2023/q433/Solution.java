package j.y2023.q433;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        if (startGene.equals(endGene)) {
            return 0;
        }

        Set<String> cnt = new HashSet<>();
        Set<String> visited = new HashSet<>();
        for (String ge : bank) {
            cnt.add(ge);
        }
        if (!cnt.contains(endGene)) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(startGene);
        visited.add(startGene);
        char[] chs = new char[]{'A', 'G', 'C', 'T'};
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int c = 0; c < size; c++) {
                String gene = queue.poll();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 4; j++) {
                        StringBuilder sb = new StringBuilder(gene);
                        if (chs[j] != gene.charAt(i)) {
                            sb.setCharAt(i, chs[j]);
                            String next = sb.toString();
                            if (!visited.contains(next) && cnt.contains(next)) {
                                if (next.equals(endGene)) {
                                    return step;
                                }

                                queue.offer(next);
                                visited.add(next);
                            }


                        }
                    }
                }
            }
        }

        return -1;
    }
}
