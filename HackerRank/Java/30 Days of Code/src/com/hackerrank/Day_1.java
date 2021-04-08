package com.hackerrank;

import java.util.Scanner;

public class Day_1 {

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";


        Scanner scanner = new Scanner(System.in);

        int eded1 = scanner.nextInt();

        double eded2 = scanner.nextDouble();
        scanner.nextLine();

        String msg = scanner.nextLine();


        System.out.println(eded1 + i);
        System.out.println(eded2 - d);
        System.out.println(s + msg);

        scanner.close();


    }
}
