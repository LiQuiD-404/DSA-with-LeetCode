class Solution {
    public int[] buildArray(int[] nums) {
        int nums_ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums_ans[i] = nums[nums[i]];
        }
        return nums_ans;
    }
}