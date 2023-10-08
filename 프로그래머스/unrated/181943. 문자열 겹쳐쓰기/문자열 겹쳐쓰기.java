class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        int n = overwrite_string.length();
        int m = my_string.length();
        
        try {
            if (!(1 <= n && 1000 >= n)) {
            return "overwrite_string의 문자 길이는 1 이상이며 my_string보다 짧아야합니다.";
        }
        if (!(n <= m && 1000 >= m)) {
            return "my_string의 문자 길이는 1000이하이며 overwrite_string보다 길어야합니다. ";
        }
        String str1 = my_string.substring(0, s);
        String str2 = str1 + overwrite_string;
        String str3 = my_string.substring(str2.length(), my_string.length());

        String result = str2 + str3;
        return result;
            
        } catch (Exception e) {
            return "제한 사항 위반 : " + e;
        }
        
    }
}