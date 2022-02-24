import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Counting Valleys Problem*/
public class countting_valley {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Number of string
		String c=sc.next(); //String 
		char c_arr[]=c.toCharArray(); //convert into string into char
		int k=0,count=0;
		for(int i=0;i<n;i++)
		{
			
			if(c_arr[i]=='D')
			{
				k--;
				
			}
			 if(c_arr[i]=='U')
			 {
				k++;
				if(k==0)   /*Here we use condition which mean we only needs downside valley from start point to again start point
				its counts how many zero occurs during the U(\)*/
					count++;
			 }
		}
		System.out.println(count);

	}

}
