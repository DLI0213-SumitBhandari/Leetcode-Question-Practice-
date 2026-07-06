class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
      int size=gain.length;
      int max=0;
      for(int i=0;i<size;i++)
      {
            sum+=gain[i];
            max=Math.max(sum,max);
        
      }
        return max;
    }
}