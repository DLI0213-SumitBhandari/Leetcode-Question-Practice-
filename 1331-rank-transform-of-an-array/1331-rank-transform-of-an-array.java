class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int [] sort=arr.clone();

       Arrays.sort(sort);
       int rank=1;
       HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int num:sort)
       {
            if(!map.containsKey(num))
            {
                map.put(num,rank++);
            }
       }

       for(int i=0;i<arr.length;i++)
       {
            arr[i]=map.get(arr[i]);
       }
       return arr;
    }
}