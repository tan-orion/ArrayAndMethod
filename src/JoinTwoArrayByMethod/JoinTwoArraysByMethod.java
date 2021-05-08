package JoinTwoArrayByMethod;

import java.util.Arrays;

public class JoinTwoArraysByMethod {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={7,8,9,10,11,12};
        System.out.println(Arrays.toString(joinArrays(arr1,arr2)));
    }
    public static int[] joinArrays(int[]arr1,int[]arr2){
        int[] arr3=new int[arr1.length+ arr2.length];
        int [][]arrs={arr1,arr2};
        int index=-1;
        for(int i=0;i< arrs.length;i++){
            for(int j=0;j<arrs[i].length;j++){
                index++;
                arr3[index]=arrs[i][j];
            }
        }
        return arr3;
    }
    }

