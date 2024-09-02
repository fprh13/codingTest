import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        // N은 100이므로 시간 복잡도는 신경을 안써도 됨
        
        /**
        * 배열에서 두수를 선택하는 모든 경우의 수를 구한다.
        * 과정 1에서 구한 수를 새로운 배열에 저장하고 중복값을 제거한다.
        * 배열을 오름차순으로 정렬하고 반환
        */
        HashSet<Integer> set = new HashSet<>(); // 중복 값을 제외 -> 2+5, 0+7 은 중복이기 때문이다

        // 두개의 수를 모두 선택하는 이중 포문 생성
        for (int i =0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(x -> x.intValue()).toArray(); //레퍼런스 타입 int로 변환
    }
}