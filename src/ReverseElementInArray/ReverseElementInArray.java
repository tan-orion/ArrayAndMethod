package ReverseElementInArray;

import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        // đảo ngược phần tử trong mảng

        // khai báo biến và nhập kích thước mảng
        int size;
        int [] array;// khai báo mảng
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size=sc.nextInt();
            if(size>20){
                System.out.println("size dose not excees 20:");
            }
        }while (size>20);
        // nhập giá  giá trị cho các phần tử của mảng
        array=new int[size];// tạo mảng
        int i =0;
        while(i<array.length){
            System.out.println("Enter element :" +(i+1)+"!");
            array[i]=sc.nextInt();// nhập từ bàn phím element
                    i++;
        }
        System.out.println("Element in array");
        for (int  j=0;j<array.length;j++){// duyệt in Element mảng
            System.out.println(array[j]+"\t");
        }
        // đảo ngược các phần tử
        for(int j=0;j< array.length/2;j++){
            int temp =array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;

        }
        System.out.println("reverse array");
        for (int j=0;j< array.length;j++){
            System.out.println(array[j]+"\t");
        }

    }

}
