package programmers.lv00;

import java.util.Scanner;

public class FindMissingSideInRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c + a) * (c - a);

        System.out.println(b_square);
    }
}
