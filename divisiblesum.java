import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class divisiblesum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
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
        		 if(sum%k==0)
        		 {
        			 count++;
        		 }
        		 
        	 }
         }
         System.out.println(count);
	}

}
