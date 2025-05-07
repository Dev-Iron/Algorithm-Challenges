package programmers.lv00;

public class ShortageOfWater {
    public int solution(int storage, int usage, int[] change) {
        // total_usage는 지금까지 사용한 물의 총합
        int total_usage = usage; // 지난 달의 물 사용량부터 시작
        for (int i = 0; i < change.length; i++) {

            // 이번 달 사용량은 이전 달 사용량에 변화율(백분율)을 적용해서 계산
            usage += usage * change[i] / 100;

            // 이번 달 사용량을 총합에 더한다.
            total_usage += usage;

            // 만약 total_usage가 storage보다 크다면 물이 부족해지므로 해당 달(i) 반환
            if (total_usage > storage) {
                return i + 1;  // 0부터 시작하는 인덱스를 1부터 시작하는 달로 변환
            }
        }
        // 물이 부족하지 않다면 -1 반환
        return -1;
    }


    public static void main(String[] args) {
        // 테스트 값 설정
        int storage = 1000;
        int usage = 100;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};

        // 클래스 인스턴스 생성
        ShortageOfWater wos = new ShortageOfWater();

        // solution 메서드 호출
        int result = wos.solution(storage, usage, change);

        // 결과 출력
        System.out.println("물이 부족해지는 달: " + result);
    }

}
