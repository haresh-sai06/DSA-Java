import java.util.*;

public class FirstnLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,3,5,5,5,5,8};
        System.out.println("Enter Target value: ");
        int target = sc.nextInt();
        int left=0;
        int right=arr.length-1;
        
        int first=-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        int last=-1;
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                last=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("First element of "+target+" is: "+first+" and last index of target element is: "+last);
    }
}
