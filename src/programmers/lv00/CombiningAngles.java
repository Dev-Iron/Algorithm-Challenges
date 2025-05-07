package programmers.lv00;

import java.util.Scanner;

public class CombiningAngles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360;

        // 음수일 경우 360을 더해 0~359 범위로 보정한다.
        if(sum_angle < 0) sum_angle += 360;

        System.out.println(sum_angle);

    }
}
