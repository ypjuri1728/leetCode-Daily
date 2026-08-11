class Solution {
    boolean ispossible(int[] weights, int mid, int days){
        int totalDays=1; //last days may be not add in totaldays like not add that so we need to add that bcz capacity > days value so that's why we do 
        int sum= weights[0];
        for(int i =1;i<weights.length;i++){
            if(sum + weights[i] > mid){
                sum = weights[i];
                totalDays++;
            }
            else{
                sum += weights[i];
            }
        }
        return totalDays <= days;
    }
    public int shipWithinDays(int[] weights, int days){
        int left =0;
       int right =0;
       int n = weights.length;
       int ans =0;
        
       for(int i=0; i<n; i++){
           left = Math.max(left,weights[i]);//max
       }
       for(int i=0; i<n; i++){
        right += weights[i];//sum
       }
        while(left <= right){
            int mid = left+(right-left)/2;
            if(ispossible(weights,mid,days)){
            right = mid-1;
             ans = mid; //this can be my ans 
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}