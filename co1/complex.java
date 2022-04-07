package stefi;
import java.util.Scanner;

class complex
{
   int a;
   int b;
   complex()
   {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the real and Imaginary part of the complex number:");
	 a=scanner.nextInt();
	 b=scanner.nextInt();
   }
   int aa()
   {
	   return a;
   }
   int bb()
   {
	   return b;
   }
 
  public static void main(String args[])
  {
	  complex c1=new complex();
	  int real1=c1.aa();
	  int img1=c1.bb();
	  
	  complex c2=new complex();
	  int real2=c2.aa();
	  int img2=c2.bb();
	  
      int realsum=real1+real2;
      int imgsum=img1+img2;
      
      System.out.println("The Sum of complex Number is:" +realsum+"+"+imgsum+"i" );
  }
	
}