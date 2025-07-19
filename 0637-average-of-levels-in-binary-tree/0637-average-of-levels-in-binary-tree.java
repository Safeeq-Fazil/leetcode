/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        double sum;
        double count;
        double avg;

        while(queue.peek()!=null)
        {
            sum=0;
            count=0;
            while(queue.peek()!=null)
            {
                TreeNode node = queue.poll();
                sum=sum+node.val;
                count++;
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);    
            }

                queue.add(queue.poll());
                avg=sum/count;
                list.add(avg);
        }
        return list;
    }
}