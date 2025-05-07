package programmers.lv00;

import java.util.Arrays;

public class CprTest {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] cpr = {"call", "check", "repeat", "pressure", "respiration"};

        CprTest test = new CprTest();  // 클래스의 인스턴스 생성
        int[] result = test.solution(cpr);  // solution 호출

        System.out.println(Arrays.toString(result));  // 결과 출력

    }
}