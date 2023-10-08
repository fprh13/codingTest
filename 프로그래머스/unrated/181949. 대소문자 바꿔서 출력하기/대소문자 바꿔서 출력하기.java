import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char charachterNumber = str.charAt(i); 
            if(Character.isLowerCase(charachterNumber)){
                result += Character.toUpperCase(charachterNumber);
            } else {
                result += Character.toLowerCase(charachterNumber);
            }
        }
        System.out.print(result);
    }
}