class Solution {
    public int countGoodSubstrings(String s) {
        int k =3;
        int count=0;
        int left =0;
        for(int right =0;right <s.length();right++){
            if(right-left+1 ==k){
                    if(s.charAt(left) != s.charAt(left+1) && 
                    s.charAt(left+1) != s.charAt(left+2) && 
                    s.charAt(left) != s.charAt(left+2)){
                        count++;
                    }
                    left++;//remove left
            }
        }
        return count;
    }
}