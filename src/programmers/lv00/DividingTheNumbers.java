package programmers.lv00;

import java.util.Scanner;

public class DividingTheNumbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int answer = 0;

            while(number > 0){
                answer += number % 100; // % 나머지
                number /= 100; // 몫
            }
        System.out.println(answer);
    }
}
