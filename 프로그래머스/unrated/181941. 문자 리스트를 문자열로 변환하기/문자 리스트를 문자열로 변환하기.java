class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        // answer = String.join("",arr);
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}