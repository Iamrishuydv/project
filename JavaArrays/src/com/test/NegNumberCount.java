package com.test;
public class NegNumberCount {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 5, -2, 0, -4, 6, -1};

        int negativeCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("The count of negative numbers : " + negativeCount);
    }
}
