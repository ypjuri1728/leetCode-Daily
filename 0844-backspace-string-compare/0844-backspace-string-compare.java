class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i =s.length()-1;
        int j = t.length()-1;
        //for string s
        int bs=0; //backspace in string s
        int bt=0; //backspace in string t
        while(i>=0 || j >=0){
            while(i>=0){
            if(s.charAt(i)=='#'){
                bs++;//backspace in S
                i--;
            }
            else if(bs > 0){
                bs--;
                i--;
            }
            else{
                break;
            }
        }
//for string t
while(j>=0){
    if(t.charAt(j)=='#'){
        bt++;
        j--;
    }else if(bt>0){
        bt--;
        j--;
    }
    else{
        break;
    }
}

        // Compare characters
         if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)){
                return false;
            }
            if((i>=0)!= (j>=0)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}