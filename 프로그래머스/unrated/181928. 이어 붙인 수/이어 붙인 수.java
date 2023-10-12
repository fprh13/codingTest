class Solution {
    public int solution(int[] num_list) {
        int[] nl = num_list;
        String odd = "";
        String even = "";
        
        
        for (int i = 0; i < nl.length; i++) {
            if (nl[i] % 2 == 0) {
                even += nl[i];
            } else {
                odd += nl[i];
            }
        }
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}