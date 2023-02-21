package chapter_1;

import java.util.Scanner;

public class Test_08 {
    public static void main(String[] args) {
        // 불기 연도를 서기 연도로 변환한 결과를 출력한다.
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println(id - 543);
    }
}