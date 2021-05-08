package AddElement;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        //    Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//
//    Bước 2: Nhập X là số cần chèn
//
//    Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
//
//    Bước 4: Nếu index <= 1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
//
//    Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
//
//    Bước 6: In ra mảng
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int size= sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("element "+" "+i);
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter new value to add to array");
        int newValue=sc.nextInt();
        System.out.println("Enter index to add new value");
        int newValueIndex=sc.nextInt();
        addElementtoArray(newValue,newValueIndex,arr);
    }
    public static void addElementtoArray(int newValue,int newValueIndex,int []arr){
        if(newValueIndex<0||newValueIndex>arr.length){
            System.out.println("Invalid Index");
        }else {
            int[]result=new int[arr.length+1];
            for(int i =0;i<result.length;i++){
                if(i<newValueIndex){
                    result[i]=arr[i];
                }else if(i==newValueIndex){
                    result[i]=newValue;
                }else {
                    result[i]=arr[i-1];
                }
            }
            System.out.println(Arrays.toString(result));
        }
    }
}
