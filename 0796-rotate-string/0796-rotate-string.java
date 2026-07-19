class Solution {
    public boolean rotateString(String s, String goal) {
        //Concatenate
        if (s.length() != goal.length())
    return false;

return (s + s).contains(goal);
    }
}