package chapter_02;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        // 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
        // 바로 "45분 일찍 알람 설정하기"이다.

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        // 1. min
        if(min >= 45){
            min = min - 45;
        }else {
            min = min + 60 - 45;
            hour = hour -1;
            if(hour < 0) hour = 23;
        }

        System.out.print(hour + " ");
        System.out.print(min);
    }
}
