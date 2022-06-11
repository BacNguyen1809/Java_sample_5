/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise;

public class MutiDimensionArrayDemo {
	public static void main(String[] args) {
		int[][] matrix =new int[2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		System.out.println("Element at second row and fist column is: "+matrix[1][0]);
		System.out.println("Number of rows: "+matrix.length);
		System.out.println("Number of column: "+matrix[0].length);
	}

}
