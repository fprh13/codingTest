import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        
        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        // Arrays.sort() 사용
        Arrays.sort(arr);

        // 출력하기
        for (int num : arr) {
            writer.write(num + "\n");
        }
        
        writer.flush(); // 모든 출력 내용을 한 번에 보냄
        writer.close();
        reader.close();
    }
}
