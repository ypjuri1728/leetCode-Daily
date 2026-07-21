class Solution {
    public String countAndSay(int n) {
        String ans = "1";  
        for(int i =1;i<n;i++){
     StringBuilder sb = new StringBuilder(); // for the fresh stringbuilder we need in every iteratetion
        int count=1; //for not negitive value
            for(int j =1;j<ans.length();j++){
                
                if(ans.charAt(j) == ans.charAt(j-1)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(ans.charAt(j-1));
                    count =1;
                }
            }
            //for last value in group
            sb.append(count);
            sb.append(ans.charAt(ans.length()-1));
            ans =sb.toString(); // change save in ans (modify)
        }
        return ans;   
    }
}    