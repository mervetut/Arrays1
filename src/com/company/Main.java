package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] values = new int []{-6, 11, 4, 5};
        System.out.println("The elements of the array are: " + Arrays.toString(values));
    int sum = 0;
        for (int value : values) sum = sum + value;
        System.out.println("The sum of the elements in the array: " + sum);
    }
}
