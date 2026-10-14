class Solution {
    public long maxAlternatingSum(int[] nums) {

            long[] arr = new long[nums.length];

for(int k = 0; k < nums.length; k++)
{
    arr[k] = (long) nums[k] * nums[k];
}

Arrays.sort(arr);

long ans = arr[arr.length - 1];
int i = 0;
int j = arr.length - 2;

while(i <= j)
{
    ans -= arr[i++];

    if(i <= j)
    {
        ans += arr[j--];
    }
}

return ans;

    }   
    }

