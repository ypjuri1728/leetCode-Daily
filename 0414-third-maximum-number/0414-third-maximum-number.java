class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int count =0;
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<n;i++){//remove duplicates
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                count++;
            }
        }
        //SET to array
            int[] arr = new int[count];//set int ke element ko store karne ke liye 
            Integer[] temp = set.toArray(new Integer[0]);
            //set has no index that's why convert into int 

            for(int i = 0; i < count; i++) {
                arr[i] = temp[i];   
            }
        Arrays.sort(arr);

        //3rd max
        if (count >= 3) {
            return arr[count - 3];
        }

    //if less than 3 distinct values
        return arr[count - 1];
        }
    }