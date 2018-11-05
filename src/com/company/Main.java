package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[7][7];

        System.out.print("\nIPZ-31. Dron` Dmytro.\n");
        Matrix example_1 = new Matrix();
        example_1.init(matrix);
        System.out.print("\nOLd matrix:\n");
        example_1.print(matrix);
        example_1.transform(matrix);
        System.out.print("\nNew matrix:\n");
        example_1.print(matrix);
    }
}