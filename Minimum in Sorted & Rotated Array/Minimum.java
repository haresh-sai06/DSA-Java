import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={14,15,20,22,3,5,7,9,11};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int middle=(left+right)/2;
            if(arr[middle]<right){
                right=middle;
            }else{
                left=middle+1;
            }
        }
        System.out.println(arr[left]);
        System.out.println(left);
    }
}
