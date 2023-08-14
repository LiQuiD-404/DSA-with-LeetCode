class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String temp = details[i];
            String age1 = temp.substring(11,13);
            int age = Integer.parseInt(age1);
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}