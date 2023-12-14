package j.y2023.q401;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 60; ++j) {
                int cnt1 = Integer.bitCount(i) + Integer.bitCount(j);
                if (cnt1 == turnedOn) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i).append(":");
                    if (j < 10) {
                        sb.append("0");
                    }
                    sb.append(j);
                    ans.add(sb.toString());
                }
            }
        }
        return ans;
    }
}
