package programmers.lv00;

public class ScoreVerification {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            // numbers[i]는 확인할 학생 번호
            // score_list는 학생 번호 순서대로 실제 성적이 저장된 배열
            if (our_score[i] == score_list[numbers[i] -1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
