class Solution {
    public String solution(String code) {
        String ret = "";
        char[] charCode = code.toCharArray();
        int mode = 0;
        // 코드를 읽으면 문자가 1이라면 모드 변경
        // 모드가 코드를 읽으면 ret생성
        // 모드는 0 1이다
        // 인덱스가 1이 아니면 짝수 일때만 ret의 맨뒤에 인덱스 추가
        for (int i = 0 ; i < charCode.length; i++) {
            if (mode == 0) { // 모드가 현재 0이라면
                if (charCode[i] != '1') { // 인덱스가 1이 아니면
                    if (i % 2 == 0) { // 짝수일대만
                        ret += charCode[i]; // ret의 맨뒤에 인댁스 추가
                    }
                } else {
                    mode = 1; //인덱스가 1이면 모드 바꾸기
                }
            } else { // 모드가 1이였다면
                if (charCode[i] != '1') { // 인덱스가 1이 아니면
                    if (i % 2 == 1) { // 홀수일때만
                        ret += charCode[i]; // ret의 맨뒤에 인데스 추가
                    }
                } else { // 인덱스가 1이면 모드 바꾸기
                    mode = 0;
                }
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret; // 빈문자열과 아닐때
    }
}