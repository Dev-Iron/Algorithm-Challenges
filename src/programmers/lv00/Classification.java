package programmers.lv00;

import java.util.Scanner;

public class Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("_eye")){
            System.out.println("Ophthalmologyc");
        }
        else if(code.endsWith("head")){
            System.out.println("Neurosurgery");
        }
        else if(code.endsWith("infl")){
            System.out.println("Orthopedics");
        }

        else if(code.endsWith("skin")){
            System.out.println("Dermatology");
        }

        else {
            System.out.println("direct recommendation");
        }
    }
}
