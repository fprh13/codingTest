import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if (1 <= n && 1000 >= n) {
            if (n % 2 == 0) {
                System.out.print(n + " is even");
            } else {
                System.out.print(n + " is odd");
            }
        } else {
            System.out.print("제한 사항에 위반됩니다.");
        }
    }
}