class Solution {
    boolean ispossible(int[] arr,int mid,int m){
        int lastposition =arr[0];
        int totalballsplaced =1;

        for(int i =0;i<arr.length;i++){
            if(arr[i]-lastposition  >= mid){
                lastposition = arr[i];
                totalballsplaced++;
            }
        }
        return totalballsplaced >= m;

    }
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
       int left = 1;
        int right = arr[arr.length - 1] - arr[0]; //max-min
        
        while(left <= right){
            int mid  = left+(right-left)/2;
            int ans =0;
            if(ispossible(arr,mid,m)){
                left = mid+1;  //check next element for max distance
                ans = mid; 
            }
            else{
                right = mid -1;
            }
        }
        return right;
    }
}
//ans=mid ::=>what if condition is true like placed 3 balls in 4 so condtion is true and maybe the ans 