package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a, b, c, d, e, f, g;
        System.out.println("Obliczanie raty kredytu Zakres kwoty od 100 do 10000pln, " +
                "oprocentowanie zmienne 6-12rat=2.5%, 13-24rat=5%, 25-48rat=10%");
        do {
            System.out.println("Prosze podac kwote");
            Scanner Kw = new Scanner(System.in);
            b = Kw.nextInt();
            System.out.println("Prosze podac liczbe rat");
            Scanner LR = new Scanner(System.in);
            a = LR.nextInt();
            if (a < 6 || a > 48 || b < 100 || b > 10000) {
                System.out.println("Dane z poza oferty, proszę skorygować dane");
            }
        }
        while (a < 6 || a > 49 || b < 100 || b > 10000);
        if (a >= 6 && a <= 12) {
            c = (b * 1.025) / a;
            System.out.println(c + "PLN");
        } else if (a >= 13 && a <= 24) {
            d = (b * 1.05) / a;
            System.out.println(d + "PLN");
        } else if (a >= 25 && a <= 48) {
            e = (b * 1.1) / a;
            System.out.println(e + "PLN");
        }
        //cena towaru 100-10tys zł
        //oprocentowanie 6-12rat=2.5%, 13-24rat=5%, 25-48rat=10%
        // write your code here
    }
}
