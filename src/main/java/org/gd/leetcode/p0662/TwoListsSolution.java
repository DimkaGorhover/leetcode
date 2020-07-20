package org.gd.leetcode.p0662;

import org.gd.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.gd.common.CollectionUtils.last;

/**
 * @author Horkhover Dmytro
 * @see CustomSolution
 * @since 2020-07-20
 */
class TwoListsSolution implements Solution {

    private List<Integer> start;
    private List<Integer> end;

    public int widthOfBinaryTree(TreeNode root) {

        start = new ArrayList<>();
        end = new ArrayList<>();

        int result = dfs(root, 0, 1);

        System.out.printf("%d == %d%n", last(start), last(end));

        return result;
    }

    private int dfs(TreeNode root, final int level, final int pos) {

        if (root == null)
            return 0;

        if (start.size() == level) {
            start.add(pos);
            end.add(pos);
        } else {
            end.set(level, pos);
        }

        final int current = end.get(level) - start.get(level) + 1;

        final int left = dfs(root.left, level + 1, 2 * pos);
        final int right = dfs(root.right, level + 1, 2 * pos + 1);

        return Math.max(current, Math.max(left, right));
    }
}
