import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class max_min {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[n];
		int j=0,k=0,min=0,max=0;
		for(int i=0;i<n;i++)
		{
			for(int j1=0;j1<n;j1++)
			{
			if(i!=j1)
			{
			k=k+a[j1];
			}
			}
			b[j++]=k;
			k=0;
		}
//    	for(int i=0;i<n;i++)
//			System.out.print(b[i]+" ");
//		System.out.println();
		min=b[0];
		for(int i=0;i<n;i++)
		{
			if(max<b[i])
				max=b[i];
			if(min>b[i])
				min=b[i];
		}
		System.out.print(max+" ");
		System.out.print(min);

	}

}
