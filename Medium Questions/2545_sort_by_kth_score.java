class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            arr[i] = score[i][k];
        }

        for(int i=0;i<m;i++) {
            int min = i;
            for (int j = i+1; j < m; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            for (int l = 0; l < n; l++) {
                int temp = score[min][l];
                score[min][l] = score[i][l];
                score[i][l] = temp;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return score;

    }
}