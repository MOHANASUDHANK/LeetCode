class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->{
            return
             Integer.compare(
                b[0]*b[0]+b[1]*b[1],
                a[0]*a[0]+a[1]*a[1]
            );
        });
        for(int[] a : points){
            pq.add(a);
            if(pq.size()>k)pq.poll();
        }
        int[][] ans = new int [pq.size()][2];
        int i=0;
        
        while(!pq.isEmpty()){
            
            ans[i++]=pq.poll();
        }
        return ans;
    }
}