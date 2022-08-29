//Problem: Print all the duplicates in the input string

class Solution {
    public static void main(String[] args) {
        String str = "sinstriiintng";

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (counts[i] > 1)
                System.out.println((char)(i + 'a') + " - " + counts[i]);
    }
}
/* Output:
	i – 4
	n – 3
	s – 2 
	t – 2    
*/


