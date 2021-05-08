package GetColumnTotal;

import java.util.Scanner;

public class GetColumnTotal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns");
        int columns=sc.nextInt();
        int [][]arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for (int j=0 ;j<columns;j++){
                System.out.println("Enter value for element at index :["+i+"]["+j+"]");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter column index");
        int sumCol= sc.nextInt();
        double result=0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i][sumCol];
        }
        System.out.println("Total of columns index"+" "+sumCol+"is"+" "+result);
    }

}
