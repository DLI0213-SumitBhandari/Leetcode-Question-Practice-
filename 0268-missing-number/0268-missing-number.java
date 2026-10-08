class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        System.out.print(size);
        for(int i=0;i<size;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
            else if(nums[size-1]!=size)
            {
                return size;
            }
        }
        return -1;
    }
}