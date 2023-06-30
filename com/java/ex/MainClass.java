package com.java.ex;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력해 주세요 :");
        String name = scan.next();
        System.out.print("나이를 입력해 주세요 :");
        int age = scan.nextInt();
        System.out.println("-----------------");
        System.out.println("이름은 " + name + " 입니다");
        System.out.println("-----------------");
        System.out.println("나이는 " + age + " 살입니다");
    }
}

