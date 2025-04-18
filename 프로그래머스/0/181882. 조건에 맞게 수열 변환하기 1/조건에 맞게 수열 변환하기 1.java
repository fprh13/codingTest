import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 50 && num % 2 == 0) {
                answer.add(num / 2);
            } else if (num < 50 && num % 2 == 1) {
                answer.add(num * 2);
            } else {
                answer.add(num);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }
}