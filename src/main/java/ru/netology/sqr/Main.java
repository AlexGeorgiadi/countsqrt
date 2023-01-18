package ru.netology.sqr;

import ru.netology.sqr.countsqrt.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int d = service.calcSqrt(100, 1000);
        System.out.println(d);
    }
}