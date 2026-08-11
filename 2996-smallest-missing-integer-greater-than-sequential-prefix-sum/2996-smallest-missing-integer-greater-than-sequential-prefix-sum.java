class Solution {
    public int missingInteger(int[] nums) {
        //3,4,5,1,12,14,13
        //1,3,4,5,12,13,14
        
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                sum+=nums[i];
            }else
            {
                break;
            }
        }

        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }

        while(set.contains(sum))
        {
            sum++;
        }

        return sum;
        

    }
}