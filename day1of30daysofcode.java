//Problem: Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res= new ArrayList<>();
        
        for (int i=0;i<nums.length; i++)
        {
            int index = Math.abs(nums[i])-1;
            int value = nums[index];
            
            if(value<0)
            {
                res.add(index+1);
            }
            else
            {
                nums[index]*=-1;
            }
        }
                return res;
        }
    }
	/*
	Input: nums = [4,3,2,7,8,2,3,1]
	Output: [2,3] 
    */
