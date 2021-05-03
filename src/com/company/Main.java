package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final double Sulfid = 1;

	double N, A, B;
	double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа считает сколько нанограмм сульфида тория требуется на обработку панелей");

        System.out.print("Введите количество панелей");
        N = input.nextDouble();

        System.out.print("Введите высоту панели");
        A = input.nextDouble();

        System.out.print("Введите ширину панелей");
        B = input.nextDouble();

        result = Sulfid * N * A * B * 2;

        System.out.println("Требуется "+result+" грамм сульфида");
    }
}
