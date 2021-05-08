package CountNumberOfStudentsThatPassedExam;

import java.util.Scanner;

public class CountNumberOfStudentsThatPassedExam {
    public static void main(String[] args) {
        // khai báo kích thước mảng
        Scanner sc=new Scanner(System.in);
        int size;
        int []arr;
        do{
            System.out.println("Enter a size");
            size=sc.nextInt();
            if(size>30){
                System.out.println("size should not exceed 30");
            }
        }while (size>30);// điều kiện dừng.
        arr=new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter a mark for student"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("list of mark:");
        for (int j=0;j<arr.length;j++){
            System.out.println(arr[j]+"\t");
            if(arr[j]<5&& arr[j]<=10){
                count ++;
            }
        }
        System.out.println("the number of students passing the exam is"+" "+count);
    }
}
