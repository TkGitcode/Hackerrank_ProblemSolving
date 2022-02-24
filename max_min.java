import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Mini Max Sum Problem*/
public class max_min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); // No of Array Value
		int a[]= new int[n]; //Array 
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n]; // To Store a sum Values
		int j=0,k=0,min=0,max=0;
		for(int i=0;i<n;i++)
		{
			for(int j1=0;j1<n;j1++)
			{
			if(i!=j1)
			{
			k=k+a[j1]; //Except i element are been sum
			}
			}
			b[j++]=k;
			k=0;
		}
		min=b[0];
		for(int i=0;i<n;i++)
		{
			if(max<b[i])     /*Finding a Minimum and Maximum of Array*/  
				max=b[i];
			if(min>b[i])
				min=b[i];
		}
		System.out.print(max+" ");
		System.out.print(min);

	}

}
