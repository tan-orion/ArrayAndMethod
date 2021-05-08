package FindMinInTwoDimensionalArray;

import java.util.Scanner;

public class FindMinInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row =sc.nextInt();
        System.out.println("Enter number of columns");
        int columns=sc.nextInt();
        int [][]arr=new int[row][columns];
        for(int i=0;i<row;i++){
            for (int j=0;j<columns;j++){
                System.out.println("Enter value of array ["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Min value in array is:"+findMinValue(arr));
    }
    public static int findMinValue(int [][]arr){
        int minValue=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]<minValue){
                    arr[i][j]=minValue;
                }
            }
        }
        return minValue;
    }

}
