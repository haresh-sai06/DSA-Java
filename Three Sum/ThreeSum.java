import java.util.*;

public class ThreeSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Enter Target Value:");
        int target = sc.nextInt();
        Arrays.sort(input);
        for(int i=0 ; i<n ; i++){
            if(i==0 || (input[i] != input[i-1])){
                int j=i+1, k=n-1;
                int tar=target-input[i];
                while(j<k){
                    if(input[j]+input[k]==tar){
                        System.out.println(input[i] + " " + input[j] + " " + input[k]);
                        //avoids duplicates
                        while(j<k && input[j] == input[j+1]) j++;
                        while(j<k && input[k] == input[k-1]) k--; 
                        j++;
                        k--;
                    }else if(input[j] + input[k] < tar){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
    }
}