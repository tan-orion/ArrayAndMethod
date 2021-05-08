package RemoveElementFromArray;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        // b1 :Khai báo và khởi tạo mảng gồm N phần tử
        // b2 : nhập x là phần tử cần xóa
        //b3 : tìm x xem có trong mảng không . nếu có chỉ ra vị trí
        // b4 : xóa x khỏi mảng
        // duyệt từ vị trí cần xóa đên cuối mảng
        // b5: kết thúc in mảng

        int [] arr={2,55,3,5,6,8,4,88,64,25};
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số cần xóa ");
        int x=sc.nextInt();
        int indexdelete=findEleFromArr(arr,x);
        if(indexdelete==-1){
            System.out.println("không có phần tử trong mảng");
        }else {
            arr=deleteElement(arr,indexdelete);
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        }


  public static int findEleFromArr(int[]arr,int element){
      int index=-1;
      for(int i=0;i< arr.length;i++){
          if(arr[i]==element){
              index=i;
          }
      }
      return index;
  }
  public static int[] deleteElement(int[]arr,int index){
        int []newArray=new int[arr.length-1];
        for(int i=0;i<index;i++){
            newArray[i]=arr[i];
        }
        for(int i= index+1;i<arr.length;i++){
            newArray[i-1]=arr[i];
        }
        return newArray;
  }

}
