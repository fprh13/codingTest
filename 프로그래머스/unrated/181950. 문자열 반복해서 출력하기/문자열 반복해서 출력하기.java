import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        sc.close();
        if (1 <= n && n <= 5) {
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        } else {
            System.out.print("제한 사항에 위반 됩니다.");
        }
    }
}