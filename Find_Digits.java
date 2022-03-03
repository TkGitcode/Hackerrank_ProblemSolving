import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Find Digits Problem*/
public class Find_Digits {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No of test case
		int count=0;
		for(int i=0;i<n;i++)
		{
			int re=0; //Remainder
			int val=sc.nextInt(); //Individual test case	
			int newval=val; //coping the value
			while(val!=0)
			{
				re=val%10; //taking last value of Integer
				if( re!=0 && newval%re==0 ) //if Value of Remainder is 0 then the count will not increase
				{
					count++; //Increase a count when Whole value divisible by Remainder
				}
				val=val/10; //Reducing a Integer(whole integer)
			}
			System.out.println(count); //Printing a count
			count=0; //resetting a count
		}
		sc.close();

	}

}
