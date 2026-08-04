class Solution {

    public Boolean binarySearch(int[] nums,int n)
    {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==n)
            {
                return true;
            }
            else if(nums[mid]<n)
            {
                s=mid+1;
            }else
            {
                e=mid-1;
            }
        }
        return false;
    }

    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];

        List<Integer> result=new ArrayList<>();
        for(int n=min;n<=max;n++)
        {
            Boolean ispresent=binarySearch(nums,n);
            if(!ispresent)
            {
                result.add(n);
            }
        }

        return result;
        
    }
}