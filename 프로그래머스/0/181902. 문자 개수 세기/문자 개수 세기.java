
class Solution {
    public int[] solution(String my_string) {
        
        int[] answer = new int[52];
        
        my_string.chars().forEach(c -> {
            if (c >= 'A' && c <= 'Z') {
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++;
            }
        });
        
        return answer;
    }
}