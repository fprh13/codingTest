import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= -100000 && b <= 100000) {
            System.out.println("a = " + a);
            System.out.print("b = " + b);
            sc.close();
        } else {
            System.out.println("제한 사항에 위반 됩니다.");
        }
        
    }
}