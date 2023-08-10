class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                pos++;
            }
            else{
                neg++;
            }
        }
        int pos_arr[] = new int[pos];
        int neg_arr[] = new int[neg];
        int x = 0;
        int y = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                pos_arr[x++] = nums[i];
            }
            else{
                neg_arr[y++] = nums[i];
            }
        }
        x = 0;
        y = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = pos_arr[x++];
            }
            else{
                nums[i] = neg_arr[y++];
            }
        }
        return nums;
    }
}