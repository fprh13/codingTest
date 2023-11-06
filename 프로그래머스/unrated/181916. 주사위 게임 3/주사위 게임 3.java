import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        } else if (a == b && b == c && c != d) {
            answer = (10 * a + d) * (10 * a + d);
        } else if (a == c && c == d && d != b) {
            answer = (10 * a + b) * (10 * a + b);
        } else if (a == b && b == d && d != c) {
            answer = (10 * a + c) * (10 * a + c);
        } else if (b == c && c == d && d != a) {
            answer = (10 * b + a) * (10 * b + a);
        } else if (a == b && b != c && c == d) {
            answer = (a + d) * Math.abs(a - d);
        } else if (a == c && c != b && b == d) {
            answer = (a + b) * Math.abs(a - b);
        } else if (a == d && d != b && b == c) {
            answer = (a + b) * Math.abs(a - b);
        } else if (a == b && b != c && c != d && d != b) {
            answer = c * d;
        } else if (a == c && c != d && c != b && d != b) {
            answer = b * d;
        } else if (a == d && a != b && a != c && b != d) {
            answer = b * c;
        } else if (b == c && b != d && b != a && a != d) {
            answer = a * d;
        } else if (b == d && b != c && b != a && a != c) {
            answer = a * c;
        } else if (c == d && c != a && c != b && a != b) {
            answer = a * b;
        } else {
            int min = 6;
            if(min >= a) min = a;
            if(min >= b) min = b;
            if(min >= c) min = c;
            if(min >= d) min = d;
            answer = min;
        }
        
        return answer;
    }
}