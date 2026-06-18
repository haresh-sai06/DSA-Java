import java.util.*;

public class SpiralMatrix {
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
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;
        int rmin=0, rmax =matrix.length-1, cmin=0 , cmax=matrix[0].length-1;
        while(count < n*m){
            for(int column = cmin ; column<=cmax && count < m*n; column++){
            System.out.print(matrix[rmin][column] + " ");
            count++;
            }
            rmin++;
            for(int rows=rmin ; rows<=rmax && count<m*n ; rows++){
               System.out.print(matrix[rows][cmax] + " ");
               count++;
            }
            cmax--;
            for(int column=cmax ; column>=cmin && count<m*n ; column--){
                System.out.print(matrix[rmax][column] + " ");
                count++;
            }
            rmax--;
            for(int rows=rmax ; rows>=rmin && count<m*n ; rows--){
                System.out.print(matrix[rows][cmin]+" ");
                count++;
            }
            cmin++;
        }
    }
}
