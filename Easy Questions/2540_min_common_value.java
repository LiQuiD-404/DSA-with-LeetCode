import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int res = -1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n1;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                res = nums2[i];
                break;
            }
        }
        return res;
    }
}