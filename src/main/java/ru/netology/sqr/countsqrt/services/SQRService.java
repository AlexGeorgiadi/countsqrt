package ru.netology.sqr.countsqrt.services;

public class SQRService {

    public int calcSqrt(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= a) & (i * i <= b))
                count = count + 1;
        }
        return count;
    }
}

