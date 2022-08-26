//Problem: CImplement strStr()

class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        if(haystack.contains(needle)){
            index=haystack.indexOf(needle);
        }
        return index;
    }
}

/*
Input: haystack = "hello", needle = "ll"
Output: 2
*/
