class Solution {
    public int solution(String number) {
        
        int sum = 0;
        
        char[] charArray = number.toCharArray();
        for (char ch : charArray) {
            sum +=  Character.getNumericValue(ch);
        }
        
        return sum % 9;
    }
}