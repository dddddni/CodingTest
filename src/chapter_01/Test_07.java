package chapter_01;

import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        // 첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println(id + "??!");
    }
}