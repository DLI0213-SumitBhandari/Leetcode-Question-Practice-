class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>posarr=new ArrayList<>();
        ArrayList<Integer>negarr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                negarr.add(nums[i]);
            }else 
            {
                posarr.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=posarr.get(i/2);
            }else
            {
                nums[i]=negarr.get(i/2);
            }
        }

            return nums;
    }
}