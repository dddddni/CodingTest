package chapter_1;

import java.util.Scanner;

public class Test_10 {
    public static void main(String[] args) {
        // 세자리 * 세자리
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String sb = String.valueOf(b);

        System.out.println(a * Integer.parseInt(sb.substring(2)));
        System.out.println(a * Integer.parseInt(sb.substring(1,2)));
        System.out.println(a * Integer.parseInt(sb.substring(0,1)));
        System.out.println(a * b);


    }
}