class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = 0;
    for(int i = 0; i < piles.length; i++){
        right = Math.max(right, piles[i]);
        }
        while(left<right){
            int ans = right;
            int mid = left+(right-left)/2;
            long totalhour =0;

            for(int i =0;i<piles.length;i++){
                totalhour += piles[i]/mid;
                if(piles[i]%mid != 0){
                    totalhour += 1;
                }
            }
            if(totalhour > h){
                left = mid+1;
            }else{
                right = mid;
            }
            }
  return left;
    }
}