package JoinTwoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class JoinTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size arr1");
        int size1=sc.nextInt();
        int []arr1=new int[size1];
        for(int i =0;i<arr1.length;i++){
            System.out.println("enter element:"+i);
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter size arr2");
        int size2=sc.nextInt();
        int[]arr2=new int[size2];
        for (int i =0;i<arr2.length;i++){
            System.out.println("enter element :"+i);
            arr2[i]=sc.nextInt();
        }
        int[]arr3=new int[arr1.length+ arr2.length];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            count++;
        }
        for(int j=0;j<arr2.length;j++){
            arr3[count++]=arr2[j];
        }
        for(int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]+" ");
        }
    }
}
