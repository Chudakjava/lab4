package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите  координаты начала отрезка: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Введите  координаты конца отрезка: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        Lenght lenght = new Lenght(x1, y1, x2, y2);
        System.out.print("Длина отрезка = ");
        System.out.println(lenght.Length());
    }
}

