class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        int n = num1.length;
        int m = num2.length;
         int k =0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(num1[i]);
        }
        int[] temp = new int[num2.length];
       

        for(int i =0;i<m;i++){
        if(set.contains(num2[i])){
           temp[k]=num2[i];
           k++;
           set.remove(num2[i]);
        }
    }
    int[] ans = new int[k];
    for(int i =0;i<k;i++){
        ans[i] = temp[i];
    }
        return ans;
    }
}