package Codility;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Matrix {

    private int rows;

    private int columns;

    private int[][] values;



    public Matrix(int rows, int columns, int[][] values) {
        this.rows = rows;
        this.columns = columns;
        this.values = values;

    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public Matrix flip(int column){
        for(int i=0; i<rows;i++){
            values[i][column] = values[i][column] == 0? 1 : 0;
        }
        return this;
    }

    public int noOfrows(){
        int count = 0;
        for(int i=0 ; i<rows;i++){
            int firstValue = values[i][0];
            count++;
            for(int j=1; j<columns ; j++){
                if( firstValue != values[i][j]) {
                    count--;
                    break;
                }

            }
        }

        return  count;
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< columns; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
