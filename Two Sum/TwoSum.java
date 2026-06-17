import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0 ; i<n ; i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        int[] answer = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<input.length ; i++){
            int sno=target-input[i];
            if(map.containsKey(sno)){
                answer[0] = map.get(sno);
                answer[1] = i;
                break;
            }
            map.put(input[i] , i);
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}