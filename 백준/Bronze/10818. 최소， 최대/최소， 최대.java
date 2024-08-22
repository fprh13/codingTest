import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N개의 정수 입력

        // 입력받은 N개 만큼 정수를 입력 받아 배열에 저장
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 첫번째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
        // 배열의 최소값과 최대값을 찾아서 저장
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println(min + " " + max);
        sc.close();
    }
}
