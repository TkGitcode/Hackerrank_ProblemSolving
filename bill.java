import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int position=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int charge=sc.nextInt();
		int actual=0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(i!=position)
			{
			  sum+=arr[i];
			}
		}
		sum=sum/2;
		int val=charge-sum;
		
		if(val==0)
		{
			System.out.println("Bon Appetit");
		}
		else
			System.out.println(val);

	}

}
