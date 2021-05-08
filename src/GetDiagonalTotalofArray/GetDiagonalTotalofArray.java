package GetDiagonalTotalofArray;

import java.util.Scanner;

public class GetDiagonalTotalofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of size");
        int size= sc.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter value for element at index :[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
       // System.out.println("Diagonal sum of array is :"+" "+ getDiagnoalTotal(arr));
        System.out.println("Diagonal sum of array is :"+" "+ getDiagnoalTotal2(arr));

    }
//    public static  int getDiagnoalTotal(int[][]arr){
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i][i];
//        }
//        return sum;
//    }
    public static  int getDiagnoalTotal2(int[][]arr){
        int total=0;
        for(int j=0;j<arr.length;j++){
            total+=arr[j][arr.length-1-j];
        }
        return total;
    }
}