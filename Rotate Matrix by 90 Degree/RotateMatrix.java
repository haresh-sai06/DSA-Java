import java.util.*;

public class RotateMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=i+1 ; j<matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        int left=0, right=matrix.length-1;
        while(left<right){
            for(int i=0 ; i<matrix.length ; i++){
                int temp = matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
            }
            left++;
            right--;
        }

        //print the matrix
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }    
}
