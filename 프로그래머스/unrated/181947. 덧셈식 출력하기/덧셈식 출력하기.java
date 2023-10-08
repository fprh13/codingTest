import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (1 <= a && b <=100) {
            System.out.println(a + " + " + b + " = " + (a + b) );
        } else {
            System.out.println("제한 사항에 위반 됩니다.");
        }
        
    }
}