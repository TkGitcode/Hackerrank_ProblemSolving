import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank breaking best and worst records Problem*/
public class Recordbeak {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long n=sc.nextInt(); //Number of Match
		long a[]=new long[1000];
		int mincount=0,maxcount=0; 
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		long min=a[0],max=a[0]; //i have set a default(Array's 1st element) value for maximum and minimum
       for(int i=0;i<n;i++)
       {
    	   if(a[i]<min)
    	   {
    		   min=a[i];
    		   mincount++; //Here i find the how many time he break his own record of high scoring
    	   }
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    		   maxcount++; //Here i find the how many time he break his own record of low scoring
    	   }
       }
       System.out.println(maxcount+" "+mincount); //Finally i printed both min and max
	}

}
