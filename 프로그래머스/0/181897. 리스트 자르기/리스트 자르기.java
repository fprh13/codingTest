class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};

        if (n == 1) {
            answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            for (int i = a; i < num_list.length; i++) {
                answer[i - a] = num_list[i];
            }
        } else if (n == 3) {
            answer = new int[b - a + 1];
            for (int i = a; i <= b; i++) {
                answer[i - a] = num_list[i];
            }
        } else if (n == 4) {
            answer = new int[(b - a) / c + 1];
            for (int i = a, j = 0; i <= b; i += c, j++) {
                answer[j] = num_list[i];
            }
        }

        return answer;
    }
}