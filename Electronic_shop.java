import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Electronic_shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long b=sc.nextLong();
		int k=sc.nextInt();
		int d=sc.nextInt();
		long karr[]=new long[k];
		long darr[]=new long[d];
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
    		 total=karr[i]+darr[j];
    		 //System.out.println("Total "+total);
    		 if(max<total)
    		 {//8<11
    			 //11<10
    			 if(total<=b)
    			 {
    			//System.out.println("b= "+b);
    			 max=total;
    			 }
    			 else
    				 continue;
    		 }
//    		 else if(total>b)
//    		 {
//    			 max=-1;
//    		 }
    	 }
     }
    // System.out.println();
     //System.out.println(total);
     if(max==0)
     {
    	System.out.println(-1); 
     }
     else 
     System.out.println(max);
     sc.close();
	}
	

}
