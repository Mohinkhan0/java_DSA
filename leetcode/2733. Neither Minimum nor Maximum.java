class Solution {
    public int findNonMinOrMax(int[] nums) {
      Arrays.sort(nums);
    //   int res=0;
      if(nums.length<=2)
      {
        return -1;
      }
    //   for(int i=0 ; i<nums.length ; i++)
    //   {
    //     if(i==1)
    //     {
    //        res=nums[i];
    //     }
    //   } 
      return nums[1]; 
    }
}