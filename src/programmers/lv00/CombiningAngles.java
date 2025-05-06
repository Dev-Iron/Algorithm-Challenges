package programmers.lv00;

import java.util.Scanner;

public class CombiningAngles {
    public static void main(String[] args) {

    // 프로그래머스 Lv00 - PCCE 기출문제 2번: 각도 합치기
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        // 이 문제에서 봐야할 점은 360을 더하든 빼든 같은 각도로 취급된다는 점이다.
        // 그래서 항상 0 이상 360 미만의 범위로 정규화해야 정확히 계산할 수 있다.
        int sum_angle = (angle1 + angle2) % 360;

        // 음수일 경우 360을 더해 0~359 범위로 보정한다.
        if(sum_angle < 0) sum_angle += 360;

        System.out.println(sum_angle);

    }
}
