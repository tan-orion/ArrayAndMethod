package FindMinByMethod;

import java.util.Scanner;

public class FindMinByMethod {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();;
        int [] arr =new int[size];
        for (int i =0; i<arr.length;i++){
            System.out.println("Enter value at index :"+ i);
            arr[i]=sc.nextInt();
        }
        System.out.println("value min is:"+ findMin(arr));

    }
    public static  int findMin(int[] arr){
        int min=arr[0];
        for( int j=0;j<arr.length;j++){
            if(min<arr[j]){
                arr[j]=min;
            }
        }
        return min;
    }
}
