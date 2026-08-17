    class Solution {
        boolean isPossible(int[] quantities, int n, int mid){
            int stores = 0;

for (int i = 0; i < quantities.length; i++) {
    stores += quantities[i] / mid;

    if (quantities[i] % mid != 0) {
        stores++;
    }
}
return stores<=n;
        }
        public int minimizedMaximum(int n, int[] quantities) {
            int l = quantities.length;
            int low = 1;
            int high = 0;
            int ans =0;
            for(int i =0;i<l;i++){
            high = Math.max(quantities[i],high);
            }
            while(low <= high){
                int mid = low +(high-low)/2;
            
                if(isPossible(quantities,n,mid)){
                    ans = mid;
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            return ans;
        }
    }