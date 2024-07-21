class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            str[indices[i]] = "";
        }

        for (String i : str) {
            answer += i;
        }
        return answer;
    }
}