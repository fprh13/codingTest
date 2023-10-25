import java.util.*;

class Solution {
    
    
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        
        while (n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                answer.add(n);
            } else {
                n = 3 * n + 1;
                answer.add(n);
            }
        }
        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
        
        // 스트림 람다 스트링 형 변환 궁금해서 남겨 둔 것
        // return answer.stream()
        //      .map(i -> String.valueOf(i))  // 정수를 문자열로 변환
        //      .toArray(String[]::new);  // 문자열 배열로 변환

    }
}