import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // commands 길이만큼 실행
        for (int s = 0; s < commands.length; s++) {
            
            int i = commands[s][0];
            int j = commands[s][1];
            int k = commands[s][2];
            
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            
            Arrays.sort(subArray);
            
            answer[s] = subArray[k - 1];
        }
        
        return answer;
    }
}