class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right = right * nums[i];
        }
        return output;
    }
}
// time: O(n)
// space: O(1) - since new array does not count as extra space
// based on problem description

// brute force -- time: O(n^2)
// int[] output = new int[nums.length];
// for(int i=0; i<nums.length; i++) {
// output[i]=1;
// for(int j=0; j<nums.length; j++) {
// if(j!=i) {
// output[i] *= nums[j];
// }
// }
// }
// return output;