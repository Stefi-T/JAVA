package stefi;
import java.util.Scanner;
class symmetric {
  public static void main(String args[]){
	  int i,j;
	  int row,column;
	  
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the number of rows in matrix:");
	  row=scanner.nextInt();
	  System.out.println("Enter the number of columns in matrix:");
	  column=scanner.nextInt();
	  if(row==column)
	  {
		  int[][] matrix=new int[row][column];
		  System.out.println("Enter the square matrix:");
		  for(i=0;i<row;i++)
		  {
			  for(j=0;j<column;j++)
			  {
				  matrix[i][j]=scanner.nextInt();
			  }
		  }
		  int[][] transpose=new int [row][column];
		  for(i=0;i<row;i++)
		  {
			  for(j=0;j<column;j++)
			  {
				  transpose[i][j]=matrix[j][i];
			  }
		  }
		  int count=1;
		  for(i=0;i<row;i++)
		  {
		  for(j=0;j<column;j++)
		  {
			  if(transpose[i][j]!=matrix[i][j])
			  {
				  count=0;
				  break;
			  }
		  }
		  }
		  if(count==1)
		  {
			  System.out.println("The matrix is symmetric");
		  }
		  else
		  {
			  System.out.println("The matrix is not symmetric");
		  }
		  
	  }
	  else
	  {
		  System.out.println("The matrix is not square matrix");
	  }
	 
  }
}

  