import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank The Hurdle Race Problem*/
public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No of Jumps
		int jump=sc.nextInt(); //Maximum height of jump
		int max=Integer.MIN_VALUE; //setting minimum value of Integer
		for(int i=0;i<n;i++)
		{
			int arr=sc.nextInt();
			if(max<arr)
			{
				max=arr; //Finding a Minimum of array
			}
		}
		if(jump>max)
			System.out.println(0); //If Maximum jump is greater than Maximum  value in No of jump it prints 0
		else
		{
		jump=max-jump;
		System.out.println(jump); // Otherwise it print the max-Jump 
		}
		sc.close();
	}

}
