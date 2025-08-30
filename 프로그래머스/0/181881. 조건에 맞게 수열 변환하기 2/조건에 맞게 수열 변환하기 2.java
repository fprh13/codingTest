class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length; i++) {
                int index = arr[i];
                if (index >= 50 && index % 2 == 0) {
                    arr[i] = index / 2;
                    changed = true;
                } else if (index < 50 && index % 2 == 1) {
                    arr[i] = index * 2 + 1;
                    changed = true;
                }
            }
            if (changed) {
                answer++;
            }
        }
        return answer;
    }
}