class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String keyString = String.valueOf(charArray);
            if (!map.containsKey(keyString))
                map.put(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
// time: O(n*klogk), n number of words, k is length of word
// space: O(n*k)