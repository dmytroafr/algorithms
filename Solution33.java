import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Solution100.TreeNode;


public class Solution33 {
    public List<Double> averageOfLevels(Solution100.TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root==null) return result;

        Queue<Solution100.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                Solution100.TreeNode node = queue.poll();
                sum += node.val;

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(sum / size);
        }

        return result;
    }
}
