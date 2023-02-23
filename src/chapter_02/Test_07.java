package chapter_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test_07 {
    public static void main(String[] args) {
        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        // 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
        // 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
        // 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int reward = 0, mostBig = 0;

        boolean ab = false, bc = false, ac = false;

        // 비교
        if(a==b) ab = true;
        if(a==c) ac = true;
        if(b==c) bc = true;

        if(a >= b){
            if(a >= c) mostBig = a;
            else mostBig = c;
        }else if(b >= c){
            if(b >= a) mostBig = b;
            else mostBig = a;
        } else if(c >= a){
            if(c >= b) mostBig = c;
            else mostBig = b;
        }

        // 3개다 똑같으면
        if(ab && ac && bc) reward = 10000 + (a * 1000);
        // 2개만 똑같으면
        else if(ab || ac) {
            reward =  1000 + a * 100;
        }
        else if(bc) reward = 1000 + (b * 100);
        // 모두 다르면
        else if(!(ab || bc || ac)) reward = mostBig * 100;

        System.out.println(reward);


    }
}
