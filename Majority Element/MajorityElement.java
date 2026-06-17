import java.util.*;

public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0 ; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        int candidate=arr[0];
        int count=1;
        for(int i=0 ; i<len ; i++){
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }

            if(count==0){
                candidate=arr[i];
            }
        }
        count=0;
        for(int val : arr){
            if(val==candidate){
                count++;
            }
        }

        if(count>len/2){
            System.out.println(candidate + " is the Majority Element");
        }else{
            System.out.println("There is no Majority Element");
        } 
    }
}
