class Solution {
    public int characterReplacement(String s, int k) {
        // int ans =0;
        // int n = s.length();
        // for(int i =0;i<n;i++){
        //     int[] freq = new int[26];
        //     for(int j =i;j<n;j++){
        //         freq[s.charAt(j)- 'A']++;
        //         int maxFreq =0;

        //         for(int x =0;x<26;x++){
        //             maxFreq = Math.max(maxFreq,freq[x]);
        //         }
        //         int length = j-i+1;
        //         if(length-maxFreq <=k){
        //             ans = Math.max(ans,length);
        //         }
        //     }
        // }
        // return ans;
        int[] freq = new int[26];
        int left =0;
        int ans =0;
        int maxfreq =0;

        for(int right =0;right <s.length();right++){
            int cn =++freq[s.charAt(right)-'A']; //current count char
            maxfreq =Math.max(maxfreq,cn); //update maxfreq in string

            int length = right-left+1;
            //window is valid <=k is not invalid
            while(length - maxfreq >k){
                freq[s.charAt(left)-'A']--;
                left++;
                length = right-left +1;
            }
            ans = Math.max(ans,length);
        }
        return ans;
    }
}