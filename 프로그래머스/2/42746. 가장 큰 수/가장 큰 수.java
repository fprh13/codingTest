import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
         String[] strs = Arrays.stream(numbers)
             .mapToObj(String::valueOf)
             .toArray(String[]::new);

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            answer.append(strs[i]);
        }
        
        return answer.toString().startsWith("0") ? "0" : answer.toString();
    }
}