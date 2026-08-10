class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String s: strs)
        {
            int[] freq = new int[26];
            for(char ch : s.toCharArray())
            {
                freq[ch-'a']++;
            }
            StringBuilder sb= new StringBuilder();
            for(int i : freq)
            {
                sb.append('#');
                sb.append(i);
            }
            String key= sb.toString();
            if(!mpp.containsKey(key))
            {
                mpp.put(key,new ArrayList<String>());
            }
            mpp.get(key).add(s);
        }
        return new ArrayList(mpp.values());
    }
}
