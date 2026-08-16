// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n = nums.length;
//         List<Integer> ans = new ArrayList<>(); // for output 
//         HashSet<Integer> set = new HashSet<>();// check existing number in range 
//         for(int i =0;i<n;i++){
//             set.add(nums[i]);
//         }
//         for(int j = 1;j<= n;j++){
//             if(!set.contains(j)){
//                 ans.add(j);
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        // Mark numbers as negative
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        // Find missing numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
// current number --> Math.abs(nums[i]) --> number - 1 --> index --> make nums[index] negative