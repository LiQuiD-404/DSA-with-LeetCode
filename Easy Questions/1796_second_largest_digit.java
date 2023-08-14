class Solution {
    public int secondHighest(String s) {
        int n = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '1' || ch == '2' ||ch == '3' ||ch == '4' ||ch == '5' ||ch == '6' ||ch == '7' ||ch == '8' ||ch == '9' || ch == '0'){
                n ++;
            }
        }
        int arr[] = new int[n];
        int k = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '1' || ch == '2' ||ch == '3' ||ch == '4' ||ch == '5' ||ch == '6' ||ch == '7' ||ch == '8' ||ch == '9' || ch == '0'){
                arr[k++] = ch - '0';
            }
        }
        Arrays.sort(arr);
        if(n <= 1){
            return -1;
        }
        System.out.println(Arrays.toString(arr));
        int ans = arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(ans > arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}