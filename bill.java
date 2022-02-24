import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Bill Division Problem*/
public class bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No of bill Item
		int position=sc.nextInt(); //Anna didn't eat item,Position of array
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt(); //Rate of Each Item
		}
		int charge=sc.nextInt(); //Brian charged for a Bill
		int actual=0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(i!=position) //Ignore the Anna didn't eat item
			{
			  sum+=arr[i];  //Except Anna didn't eat item, is sum value
			}
		}
		sum=sum/2; //We can get Actual price
		int val=charge-sum; //The amount Anna was Overcharged
		
		if(val==0)
		{
			System.out.println("Bon Appetit"); //if the is no OverCharged then It prints Bon Appetit
		}
		else
			System.out.println(val); //We print the amount Anna was Overcharged

	}

}
