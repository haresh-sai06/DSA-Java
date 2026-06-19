import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,11,14,15,20,22,25,2,3,5,7};
        System.out.println("Enter Target Value: ");
        int target =sc.nextInt();
        int minIndex = findMin(arr);
        int ans = Search(arr, 0, minIndex-1 , target);
        if(ans==-1){
            ans=Search(arr, minIndex,arr.length-1,target);
        }
        System.out.println(ans);
    }


    public static int findMin(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]<arr[right]){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }


    public static int Search(int[] arr, int left, int right, int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
