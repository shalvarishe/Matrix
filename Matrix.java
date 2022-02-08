//Shalva Rishe
//December 23, 2021

import java.util.Arrays;

public class Matrix {
	public static final int SIZE = 3;
	//assigns each index of the finished matrix with a number in ascending (matrixA) or descending (matrixB) order
	public static void createMatrices(int [][] matrixA, int [][] matrixB)
	{
		int matrixAfirst = 1;
		int matrixBfirst = 9;
		for (int i = 0 ; i<SIZE; i++)
		{
			for (int j = 0; j<SIZE; j++)
			{
				matrixA[i][j] = matrixAfirst;
				matrixB[i][j] = matrixBfirst;
				matrixAfirst++;
				matrixBfirst--;
			}
		}
	}
	public static void printMatrix(int myMatrix [][] )
	{
		for (int i = 0; i < SIZE; i++)
		{
			for (int j = 0; j<SIZE; j++)
			{
				System.out.print(myMatrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void addMatrix(int [][] matrixSum, int [][] matrixA, int [][] matrixB)
	{
		for (int i=0; i<SIZE; i++)
		{
			for (int j=0; j<SIZE; j++)
			{
				matrixSum[i][j]= matrixA[i][j] + matrixB[i][j]; //adds each parallel index and assigns to that index in matrixSum
			}
		}
	}
	public static void subMatrix(int [][] matrixDifference, int [][] matrixA, int [][] matrixB)
	{
		for (int i=0; i<SIZE; i++)
		{
			for (int j=0; j<SIZE; j++)
			{
				matrixDifference[i][j]= matrixA[i][j] - matrixB[i][j]; //subtracts matrixB's index from its parallel index in matrixB
																	//and assigns to that index in matrixDifference
			}
		}
	}
	public static void mulMatrix(int [][] matrixProduct, int [][] matrixA, int [][] matrixB)
	{
		for (int i=0; i<SIZE; i++)
		{
			for (int j=0; j<SIZE; j++)
			{
				for (int l=0; l<SIZE; l++)
				{
					int product = 0;
					for (int m=0; m<SIZE; m++)
					{
						product += matrixA[j][m]*matrixB[m][l]; 
					}
					matrixProduct[j][l] = product;
				}
			}
		}
	}
	public static void main(String[] args) 
	{ 	
		// variables for inputs
		int matrixA[][] = new int[SIZE][SIZE];
		int matrixB[][] = new int[SIZE][SIZE];
		// variables to store the results
		int matrixSum[][] = new int[SIZE][SIZE];
		int matrixDifference[][] = new int[SIZE][SIZE];
		int matrixProduct[][] = new int[SIZE][SIZE];
		System.out.println("Initializing matrices...");
		createMatrices(matrixA, matrixB);
		System.out.println("\nMatrix A:");
		printMatrix(matrixA);
		System.out.println("\nMatrix B:");
		printMatrix(matrixB);
		addMatrix(matrixSum, matrixA, matrixB);
		System.out.println("\n\nMatrix Sum:");
		printMatrix(matrixSum);
		subMatrix(matrixDifference, matrixA, matrixB);
		System.out.println("\nMatrix Difference:");
		printMatrix(matrixDifference);
		mulMatrix(matrixProduct, matrixA, matrixB);
		System.out.println("\nMatrix Product:");
		printMatrix(matrixProduct);
	}


}
