package com.company;

import java.util.Random;

public class Matrix {
    Random rnd = new Random();
    //  int max, min;
    int temp = 0;

    public void print(int[][]matrix){
        for (int i=0;i < matrix.length;i++,System.out.println()) {
            for (int j=0;j < matrix[i].length;j++) {
                //    str += a[i][j] + "\t";
                System.out.format("%5d", matrix[i][j]);
            }
        }
    }
    public void init(int [][] matrix){
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                matrix[i][j]=rnd.nextInt(10)-5;
            }
        }
    }
    public void transform(int[][]matrix){
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length/2; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }

    }

}
