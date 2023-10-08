import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        char[] strToChar = str.toCharArray();
        
        if (1 <= str.length() && 10 >= str.length()) {
            for (char result : strToChar){
                System.out.println(result);
            }
        } else {
            System.out.print("제한 사항에 위반 됩니다.");
        }
    }
}