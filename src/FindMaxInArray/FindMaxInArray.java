package FindMaxInArray;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int [] maxArr;
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        size=sc.nextInt();
        maxArr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Element in array"+(i+1));
            maxArr[i]=sc.nextInt();
        }
        System.out.println("array list");
        for(int j=0; j<maxArr.length;j++){
            System.out.println(maxArr[j]+"\t");
        }
        int max=maxArr[0];
       //int index=1;
        int k;
        for(k =0;k<maxArr.length;k++){
            if(maxArr[k]>max){
                max=maxArr[k];


            }
        }
        System.out.println("Element max is"+" "+max+" "+k);
    }
}
