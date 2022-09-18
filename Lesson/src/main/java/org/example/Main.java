package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Программа решает квадратное уранвнение вида: ");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a. b. c: ");
        Scanner in = new Scanner(System.in);

        Double a = in.nextDouble();
        Double b = in.nextDouble();
        Double c = in.nextDouble();
        Double d = b * b - 4 * a * c;
        if (d > 0) {
            Double x1 = (-b - Math.sqrt(d)) / (2 * a);
            Double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            Double x = -b / (2 * a);
            System.out.println("Управление имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
