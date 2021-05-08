package FindMaxInArray;

import java.util.Scanner;

public class FindMaxByMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập size mảng");
        int size = sc.nextInt();
        System.out.println("Array");
        int [] arr=new int[size];
        for (int i=0 ;i<arr.length;i++){
            System.out.println("nhập giá trị của mảng:" +i);
            arr[i]=sc.nextInt();
        }
        System.out.println("giá trị lớn nhất là :"+findMax(arr));
    }
    public static int findMax(int[] arr){

        int max=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
       }
        }
        return max;
    }
}
