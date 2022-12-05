package dsaPractice;

public class RotateMatrix {
	public static void main(String []args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++) {
           for(int j=0; j<i; j++) {
               matrix[i][j] = matrix[i][j]+matrix[j][i];
               matrix[j][i] = matrix[i][j]-matrix[j][i];
               matrix[i][j] = matrix[i][j]-matrix[j][i];
           }
	    }
		print2DArray(matrix);
	}
	public static void print2DArray(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
           for(int j=0; j<arr[i].length; j++) {
                 System.out.print(+arr[i][j]+" ");         
           }
           System.out.println();
	    }
	}
}
