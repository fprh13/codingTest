class Solution {
    public int[] solution(int[] arr) {
       int first = -1;
        int last = -1;
        
        // 첫 번째 2와 마지막 2의 위치를 찾는다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        // 2가 배열에 없다면 [-1] 반환
        if (first == -1) {
            return new int[] {-1};
        }
        
        // first부터 last까지의 부분 배열을 반환
        int[] answer = new int[last - first + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[first + i];
        }
        
        return answer;
    }
}