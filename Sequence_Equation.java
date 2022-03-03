import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Sequence Equation Problem*/
class Retpos
{
	int a[];
	int n=0;
	Retpos(int[] b,int n) 
	{
		this.a=b;  //Here I setting a value of array to a
		this.n=n; //Here I setting a length of array to n
	}
	int Tofin(int k) //Sending a Single position to find position of array value
	{
	int i=0;
	for( i=0;i<n;i++)
	{
		if(a[i]==k)
		{
			break; //if value is equal to position it break the statement
		}
	}
	return i; //and return the position
	}
}
public class Sequence_Equation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //no of Array value
		int a[]=new int[n];
		int val=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Retpos r=new Retpos(a,n); //object to call the class
		for(int i=1;i<=n;i++)
		{
			int pos=r.Tofin(i); //Calling class to find a position
			val=pos+1; //Adding with 1 because position starting with 0
			for(int j=0;j<n;j++)
			{
				if(val==a[j]) { //finding a value with variable(val)
					System.out.println(j+1);  // It prints the position(j+1)
					break;
				}
			}
		}
sc.close();
	}

}
