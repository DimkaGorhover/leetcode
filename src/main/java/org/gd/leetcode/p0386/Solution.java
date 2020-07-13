package org.gd.leetcode.p0386;

import org.gd.leetcode.common.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/lexicographical-numbers/
 */
@LeetCode(
        name = "Lexicographical Numbers",
        difficulty = LeetCode.Level.MEDIUM,
        state = LeetCode.State.TODO
)
class Solution {

    private List<Integer> list;
    private int n;

    private void dfs(int start, int end) {
        for (int i = start; i <= end && i <= n; i++) {
            list.add(i);
            dfs(i * 10, i * 10 + 10 - 1);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        list = new ArrayList<>(this.n = n);
        for (int i = 1; i <= Math.min(9, n); i++) {
            list.add(i);
            dfs(i * 10, i * 10 + 10 - 1);
        }
        return list;
    }
}
