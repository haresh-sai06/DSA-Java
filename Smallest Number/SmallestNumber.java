import java.util.*;

public class SmallestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        String ans = "";
        for(int div=9 ; div>=2 ; div--){
            while(n%div==0){
                n=n/div;
                ans=div+ans;
            }
        }
        if(n!=1){
            System.out.println(-1);
        }else{
            System.out.println(Integer.parseInt(ans));
        }
        sc.close();
    }
}