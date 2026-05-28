class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int s : stones){
            pq.offer(-s);
        }

        while(pq.size()>1){
            int h = pq.poll();
            int l = pq.poll();
            if(l>h){
                pq.offer(h-l);
            }
        }

        pq.offer(0);
        return Math.abs(pq.peek());
    }
}