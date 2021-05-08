package FindElementInArray;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        // tìm phần tử trong mảng
       String[] students={"tan","vân","hằng","thế"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name's student");
        String name=sc.nextLine();
        // check
        boolean check= false;
        for(int  i=0; i<students.length;i++){
            if(students[i].equals(name)){
                System.out.println("Vị trí :"+" "+name+" "+"is"+" "+(i+1));
                check=true;
                break;
            }
        }
if(!check){
    System.out.println("không tìm thấy :"+name+" "+"trong danh sách");
}
    }
}
