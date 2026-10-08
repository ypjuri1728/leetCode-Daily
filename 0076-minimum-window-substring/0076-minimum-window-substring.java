class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        //t string freq
    for(int i =0;i<t.length();i++){
        char ch = t.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
    }

        int left =0;
        int minLen = Integer.MAX_VALUE;
        int start =0;

        for(int right =0;right<s.length();right++){

            //curr char add into window
            char main = s.charAt(right);
            map2.put(main,map2.getOrDefault(main,0)+1);

            //check window is valid
            boolean valid = true;
            for (char c : map1.keySet()) {
                if (map2.getOrDefault(c, 0) < map1.get(c)) {
                    valid = false;
                    break;
                }
            }
            // If valid, shrink from left
            while (valid) {

                // Check current window length
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
        char remove = s.charAt(left);
        map2.put(remove,map2.getOrDefault(remove,0)-1);
        if(map2.get(remove)==0){ //clean frq 0 string char
            map2.remove(remove);
        }
        left++;
        // Check again if window is valid
                for (char c : map1.keySet()) {
                    if (map2.getOrDefault(c, 0) < map1.get(c)) {
                        valid = false;
                        break;
                    }
                }
            }
        }

        if (minLen== Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}