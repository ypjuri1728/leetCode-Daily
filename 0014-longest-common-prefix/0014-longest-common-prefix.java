class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        // min len words find
        for(int i =0;i<strs.length;i++){
            min = Math.min(min,strs[i].length());
        }
        StringBuilder sb = new StringBuilder();

        //check with 2 loop
        for(int i =0;i<min;i++){
            for(int j =1;j<strs.length;j++){
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}