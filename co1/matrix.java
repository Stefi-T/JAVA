package stefi;
import java.util.Scanner;
class matrix {
public static void main(String args[])
{
	int i,j;
	int row,column;
	Scanner scanner=new Scanner(System.in);
	//matrix1
	System.out.println("Enter the number of rows in Matrix:");
	row=scanner.nextInt();
	
	System.out.println("Enter the number of Columns in Matrix:");
	column=scanner.nextInt();
	
	int[][]	matrix1=new int[row][column];
	System.out.println("Enter the Matrix1:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
		   matrix1[i][j]=scanner.nextInt();
		}
	}
	//matrix2
	int[][] matrix2=new int[row][column];
	System.out.println("Enter the Matrix2:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++) 
		{
			matrix2[i][j]=scanner.nextInt();
		}
	}
	 
	int[][] result=new int[row][column];
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			result[i][j]=matrix1[i][j]+matrix2[i][j];
		}
	}
	System.out.println("The resultant Matrix is");
	for(i=0;i<row;i++)
	{   
		for(j=0;j<column;j++)
		{
			System.out.print(result[i][j]+"\t");
			
		}
		System.out.println();
	}	
}
}