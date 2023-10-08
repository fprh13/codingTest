import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();
        if (1 <= str1.length() && 10 >= str2.length()) {
            System.out.print(str1 + str2);
        } else {
            System.out.print("제한 사항에 위반 됩니다.");
        }
    }
}