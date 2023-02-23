package chapter_02;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        // 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
        // 시작시간 작동 시간 입력 후 계산
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min  = sc.nextInt();
        int time = sc.nextInt();
        min = min + time;

        while(min >= 60) {
            min = min - 60;
            hour++;
        }

        if(hour >= 24) hour = hour % 24;

        System.out.print(hour + " ");
        System.out.printf("%d",min);


    }
}
