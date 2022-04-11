package stefi;


import java.util.*;

public class searchstring {
	public static void main(String args[])
	{
		int s,flag=0;
		String a;
		Scanner sc=new Scanner(System.in);
		 String e[]= new String[10];
		 System.out.println("Enter the number of elements:");
		 s=sc.nextInt();
		 System.out.println("Enter the elements:");
		 for(int i=0;i<=s;i++)
		 {
			 e[i]=sc.nextLine();
		 }
		 System.out.println("Enter the element to be searched:");
		 a=sc.nextLine();
		 for(int i=0;i<=s;i++)
		 {
			 if(e[i].compareTo(a)==0)
			 {
				 flag=1;
				 System.out.println("Element is found in the array");
			 }
		 }
			if(flag==0)
			{
				System.out.println("Element not found");
			}
		 }
	}