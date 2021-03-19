package com.korneysoft;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Lin_1 {
    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        a = in.nextInt();
        System.out.print("Input b: ");
        b = in.nextInt();
        System.out.print("Input c: ");
        c = in.nextInt();

        System.out.println("z= "+ (((float)(a - 3) * b / 2)+c));

    }

}

