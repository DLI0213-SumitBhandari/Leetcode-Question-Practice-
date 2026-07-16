class Solution {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % temp;
            a = temp;
        }
        return Math.abs(a);
    }

    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        List<Integer> gcdList =new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
            int gcdElement=gcd(nums[i],max);
            gcdList.add(gcdElement);
        }
        Collections.sort(gcdList);
        int size=gcdList.size();
        long sum=0;
            int i=0;
            int j=size-1;
            while(i<j)
            {
                if(i==j)
                {
                    sum=sum+gcdList.get(i);
                }
                else{
                sum=sum+gcd(gcdList.get(i),gcdList.get(j));
                }
                i++;
                j--;
            }

            return sum;
    }
}