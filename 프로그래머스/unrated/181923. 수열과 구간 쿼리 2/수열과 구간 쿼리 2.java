import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            List<Integer> answer = new ArrayList<>();
            for (int i = s; i < e + 1; i++) {
                if (arr[i] > k) {
                    answer.add(arr[i]);
                }
            }

            if (answer.size() != 0) {
                answer.stream()
                    .mapToInt(i -> i)
                    .min()
                    .ifPresent(min -> result.add(min));
            } else {
                result.add(-1);
            }

        }

        return result.stream().mapToInt(i->i).toArray();
    }
}