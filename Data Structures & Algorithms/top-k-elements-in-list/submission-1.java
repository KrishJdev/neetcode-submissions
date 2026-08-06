class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i: nums)
        {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet())
        {
            int freq= entry.getValue();
            if(bucket[freq]==null)
            {
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
        int[] result=new int[k];
        int c=0;
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]==null)
            continue;
            else
            {
                for(int j:bucket[i])
                {
                    result[c]=j;
                    c++;
                    if(c==k)
                    return result;
                }
            }
        }
        return result;
    }
}
