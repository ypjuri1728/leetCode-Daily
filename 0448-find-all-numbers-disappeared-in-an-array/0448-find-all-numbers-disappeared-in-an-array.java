class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        for(int j = 1;j<= n;j++){
            if(!set.contains(j)){
                ans.add(j);
            }
        }
        return ans;
    }
}