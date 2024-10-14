
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄에서 N,M 입력, N: 입력 받은 포켓몬 숫자, M: 입력받을 문제 숫자
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        // 포켓몬 이름을 key, 번호를 값으로 하는 map
        Map<String, Integer> nameToNumber = new HashMap<>();

        // 포켓몬 번호를 key, 이름을 값으로 하는 map
        Map<Integer, String> numberToName = new HashMap<>();

        // N 개의 포켓몬 이름입력 받음
        for (int i = 1; i <= N; i++) {
            String pName = br.readLine();
            nameToNumber.put(pName, i);
            numberToName.put(i, pName);
        }

        // M 개의 문제를 입력받아 답을 출력
        for (int i = 0; i < M; i++) {
            String question = br.readLine();

            // 문제가 숫자인 경우, 해당 번호의 포켓몬 이름 출력
            if(isNumeric(question)) {
                bw.write(numberToName.get(Integer.parseInt(question)));
//                bw.newLine();
                bw.write("\n");
            } else { // 문제가 문자인 경우, 해당 포켓몬의 번호를 출력
                bw.write(Integer.toString(nameToNumber.get(question)));
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
