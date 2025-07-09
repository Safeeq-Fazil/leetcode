class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res= new int[nums.length-k+1];
        Deque<Integer> dequeue = new ArrayDeque<>();
        int i=0;
        for(int ind=0;ind<nums.length;ind++)
        {
            if(!dequeue.isEmpty() && ind-k+1 > dequeue.peekFirst())
                dequeue.pollFirst();
            while(!dequeue.isEmpty() && nums[dequeue.peekLast()] <=nums[ind])
                dequeue.pollLast();
            dequeue.offer(ind);
            if(ind >= k-1)
                res[i++]=nums[dequeue.peekFirst()];    
        }
        return res;

    }
}