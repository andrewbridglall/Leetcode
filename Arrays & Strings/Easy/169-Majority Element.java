class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i]) && hash.get(nums[i]) + 1 > nums.length / 2)
                return nums[i];
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }
        return -1;
    }
}
// time: O(n)
// space: O(n)