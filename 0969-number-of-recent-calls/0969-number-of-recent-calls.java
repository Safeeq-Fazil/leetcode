class RecentCounter {

    public RecentCounter() {
        
    }
    Deque<Integer> myqueue = new ArrayDeque<>();
    public int ping(int t)
     {
        myqueue.offer(t);
        while(!myqueue.isEmpty() && myqueue.peekFirst()<t-3000)
        {
            myqueue.pollFirst();
        }
        return myqueue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */