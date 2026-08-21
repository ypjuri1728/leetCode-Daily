class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums); //skip duplicates and to do two pointer apporach

        for(int i =0;i<n-3;i++){//take 3 element after i 
        //in case of i =2 -> j =3,L=4R=5 sp over loop is close when i =2 so need to end <3 n-2 is to olong for this

            if(i >0 && nums[i]== nums[i-1]){
                 continue;
            }

            for(int j =i+1;j<n-2;j++){
                 if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

               long newTarget = (long) target - nums[i] - nums[j];

                int left = j+1;
                int right =n-1;

                while(left<right){
               
                       long sum = (long) nums[left] + nums[right];
                        if(sum == newTarget){
                             //store value in list 
                             result.add(Arrays.asList(nums[i],nums[j], nums[left],nums[right]));
                        

                            while(left <right && nums[left] == nums[left+1]){
                                left++;
                            }
                            while(left <right && nums[right] == nums[right-1]){
                                right--;
                            }
                            left++;
                            right--;  
                    }
                
                        //other condition for is sum is big or small
                else if(sum >newTarget){ //sum = nums[left]+nums[right]
                    right--; // sum is bigger so right value is big so, --
                }
                else{ // sum is small so left value ++
                // sum < newTarget
                    left++;
                }

                }
            }
        }
        
    return result;
    }
}