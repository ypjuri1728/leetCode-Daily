class Solution {
    public int repeatedStringMatch(String a, String b) {
    //extra space(O(n^2))::
        // HashMap<String,Integer> new = HashMap<>();
        // for(int i =0;i<a.length();i++){
        //     for(int j =i;j<a.length();j++){
        //         String sub = s.subString(i,j+1);
        //         map.put(sub,getOrDefault(sub,0)+1);
     StringBuilder sb = new StringBuilder(); 
        int count = 0;
    // repeat a until b.length same
        while (sb.length() < b.length()) {
    sb.append(a);
    count++;
        }
    if (sb.toString().contains(b)) {
    return count;
    }
    sb.append(a);
    count++;
    if (sb.toString().contains(b)) {
        return count;
        }
    return -1;
    }
}