package FindMaxInTwoDimensionalArray;

import java.util.Scanner;

public class FindMaxInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns");
        int columns=sc.nextInt();
        int [][]array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter value at index ["+i+"]["+j+"]");
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Max value in array is :"+ finMaxValue(array));
    }
    public static int finMaxValue(int[][]array){
        int maxValue=array[0][0];
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if (array[i][j]>maxValue){
                    maxValue=array[i][j];
                }
            }
        }
        return maxValue;
    }
}
