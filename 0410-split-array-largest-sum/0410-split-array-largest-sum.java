class Solution {
    public int splitArray(int[] arr, int k) {
        int l=0;
        int r=0;
        int n = arr.length;
        if(k>n){
            return -1;
        }
       for(int i=0; i<n; i++){
           l = Math.max(l,arr[i]);
       }
       for(int i=0; i<n; i++){
            r += arr[i];
       }
           int ans =0;      
        while(l<r){
            int mid = l+(r-l)/2;
            if(ispossible(arr,mid,k)){
                r=mid;
                ans=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    
    boolean ispossible(int arr[], int mid, int k){
        int count =1, sum=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(sum+arr[i] > mid){
                sum=arr[i];
                count++;
            }else{
                sum+=arr[i];
            }
        }
        return count<=k;
    }
    }
    
       