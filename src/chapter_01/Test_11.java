package chapter_01;

import java.util.Scanner;

public class Test_11 {
    public static void main(String[] args) {
        // A+B+C의 값을 출력한다.
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);
    }
}