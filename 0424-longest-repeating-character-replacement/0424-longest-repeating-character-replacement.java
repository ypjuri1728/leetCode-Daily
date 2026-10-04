class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int ans =0;
        int maxfreq =0;

        for(int right =0;right <s.length();right++){
            char ch =s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq =Math.max(maxfreq,map.get(ch));
            int length = right-left+1;

            while(length -maxfreq >k){//charcter of left -lc
                char lc =s.charAt(left);
                map.put(lc,map.get(lc)-1);
                left++;
                length = right-left+1;
            }
            ans = Math.max(ans,length);
        }
        return ans;
    }
}