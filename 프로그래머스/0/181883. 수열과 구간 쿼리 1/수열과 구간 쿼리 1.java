class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int index = 0; index < queries.length; index++) {
            int start = queries[index][0];
            int end = queries[index][1];
            
            for (int i = start; i <= end; i++) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}