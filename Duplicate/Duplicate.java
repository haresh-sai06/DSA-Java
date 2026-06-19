import java.util.*;

public class Duplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // for(int i=0 ; i<n ; i++){
        //     for(int j=i+1 ; j<n ; j++){
        //         if(arr[i]==arr[j]){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        for(int i=1 ; i<n ; i++){
            if(arr[i-1]==arr[i]){
                System.out.println(arr[i]);
            }
        }
        // HashMap approach:
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i]) + 1);
        //     } else {
        //         map.put(arr[i], 1);
        //     }
        // }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > 1){
        //         System.out.println(entry.getKey());
        //     }
        // }
    }
}
