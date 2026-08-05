class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> mpp = new HashMap<>();
        for(String s : strs)
        {
            int count[]= new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i: count)
            {
                sb.append("#");
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
