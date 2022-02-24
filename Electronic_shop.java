import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Electronic_shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long b=sc.nextLong(); // b is budget is to buy the product within b or equal to b
		int k=sc.nextInt(); // k is No of keyboard 
		int d=sc.nextInt(); // d is No of USB 
		long karr[]=new long[k]; // Keyboard Array
		long darr[]=new long[d]; // USB Array
		long total=0,max=0;
		for(int i=0;i<k;i++)
		{
			karr[i]=sc.nextLong();
		}
		for(int i=0;i<d;i++)
		{
			darr[i]=sc.nextLong();
		}
     for(int i=0;i<k;i++)
     {
    	 for(int j=0;j<d;j++)
    	 {
    		 total=karr[i]+darr[j]; //Adding both Keyboard and USB value
    		 
    		 if(max<total) //We should buy a product as expensive 
    		 { 
    			 if(total<=b)  //but within budget
    			 {
    			 max=total; //if both condition is true max value will updated
    			 }
    			 else
    				 continue;
    		 }    		 
    	 }
     }
     if(max==0)
     {
    	System.out.println(-1); //if Any above condition is true then the product is Not in budget so we return -1
     }
     else 
     System.out.println(max); // else we prints final expensive amount within product 
     sc.close();
	}
	

}
