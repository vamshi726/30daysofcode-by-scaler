//Problem: Sort Colors


class Solution {
    public void sortColors(int[] nums) {
        int l=0, i=0, r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,l++,i++);
            }
            else if(nums[i]==2){
                swap(nums,i,r--);
            }
            else{
                i++;
            }
        }
    }
    private void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}

/*

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

*/
