class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer>power = new ArrayList<>();
        int b =1;
        while(n>0){
            if((n&1)==1){
                power.add(b);
            }
            b*=2;
            n=n>>1;
        }
        long pre[] = new long[power.size()];
        long prev =1;
        // for(int i=0;i<power.size();i++){
        //     pre[i]=power.get(i)*prev;
        //     pre[i]%=1e9+7;
        //     prev%=1e9+7;
        //     prev = pre[i];
        // }
        
        int ans[] = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            long t=1;
            for(int j = queries[i][0];j<=queries[i][1];j++){
                t*=power.get(j);
                t%=1e9+7;
            }
            
            ans[i]=(int)t;
        }
        return ans;
    }
}