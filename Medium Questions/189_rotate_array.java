class Solution {
   void reverse(int arr[],int start,int end){
        int arr_temp[] = new int[end-start];
        for(int i=0;i<end-start;i++){
            arr_temp[i] = arr[start+i];
        }
        for(int i=0;i<arr_temp.length/2;i++){
            int temp = arr_temp[i];
            arr_temp[i] = arr_temp[arr_temp.length-i-1];
            arr_temp[arr_temp.length-i-1] = temp;
        }
        int z = 0;
        for(int i=start;i<end;i++){
            arr[i] = arr_temp[z++];
        }
    }
    public void rotate(int[] nums, int k) {
            k = k % nums.length;
            reverse(nums,0,nums.length);
            reverse(nums,0,k);
            reverse(nums,k,nums.length);
            
        }
    
}