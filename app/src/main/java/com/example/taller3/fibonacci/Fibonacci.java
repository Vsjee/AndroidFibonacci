package com.example.taller3.fibonacci;

public class Fibonacci {
    public int calculateFibonacci(int num) {
        if (num<=1) return num;
        return calculateFibonacci(num-1)+calculateFibonacci(num-2);
    }
}
