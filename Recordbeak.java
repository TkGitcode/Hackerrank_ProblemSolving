import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Recordbeak {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number of Match");
		long n=sc.nextInt();
		long a[]=new long[1000];
		int mincount=0,maxcount=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long min=a[0],max=a[0];
       for(int i=0;i<n;i++)
       {
    	   if(a[i]<min)
    	   {
    		   min=a[i];
    		   mincount++;
    	   }
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    		   maxcount++;
    	   }
       }
       System.out.println(maxcount+" "+mincount);
	}

}
