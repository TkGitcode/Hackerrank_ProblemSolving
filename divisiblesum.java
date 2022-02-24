import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Divisible Sum Pairs Problem*/
public class divisiblesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No of array values
		int k=sc.nextInt(); //This is the number should check the modulo of array values
		int a[]=new int[100];
		int sum=0,count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
         for(int i=0;i<n-1;i++)
         {
        	 for(int j=i+1;j<n;j++)
        	 {
        		 sum=a[i]+a[j];
        		 if(sum%k==0) //Checking the sum(two element in array) as modulo  
        		 {
        			 count++; //if Remainder zero count will increase once
        		 }
        		 
        	 }
         }
         System.out.println(count); //Final count values is Output
	}

}
