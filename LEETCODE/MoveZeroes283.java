package GFGSELFPACED.LEETCODE;

public class MoveZeroes283 {
    public static void main(String[] args) {
        /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.

        Example 1:

        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        */

//        two pointer


    }
    class Solution {
        public void moveZeroes(int[] nums) {

            int j=0;

            for(int i=0;i<nums.length;i++){ // assign all the numbers except zero to the starting of the array
                if(nums[i]==0){
                    continue;
                }
                nums[j]=nums[i];
                j++;

            }
            while(j<nums.length){ // assigning zero to the end of the array after the numbers
                nums[j]=0;
                j++;
            }

        }
    }
}
