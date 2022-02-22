

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class apple_orange {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//System.out.println("Enter a Start point of House ");
		int s=sc.nextInt();
		//System.out.println("Enter a End point of House ");
		int t=sc.nextInt();
		//System.out.println("Enter Where is Apple tree is located ");
		int a=sc.nextInt();
		//System.out.println("Enter Where is Orange tree is located ");
		int b=sc.nextInt();
		//System.out.println("Enter the No of Apple ");
		int m=sc.nextInt();
		//System.out.println("Enter the No of Orange ");
		int n=sc.nextInt(); 
		//System.out.println("Enter the Distance of Apple where Fall ");
		int apples[]=new int[m];
		for(int i=0;i<m;i++)
		{
			 apples[i]=sc.nextInt();
		}
		//System.out.println("Enter the Distance of Orange where Fall ");
		int orange[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 orange[i]=sc.nextInt();
		}
		int apple_landedval[]=new int[m];
		int orange_landedval[]=new int[n];
         int j=0,applecount=0,orangecount=0;
		for(int i=0;i<m;i++)
		{
			apple_landedval[j++]=a+apples[i];
			//System.out.print(a+apples[i]+" ");
		}
		//System.out.println();
		j=0;
		for(int i=0;i<n;i++)
		{
			orange_landedval[j++]=b+orange[i];
			//System.out.print(b+orange[i]+" ");
		}
		//System.out.println();
		for(int i=0;i<m;i++)
		{
			if(apple_landedval[i]>=s)
			{
				if(apple_landedval[i]<=t)
			{
				applecount++;
				//System.out.print(apple_landedval[i]+"o");
			}
			}
		}
		//System.out.println();
		for(int i=0;i<n;i++)
		{
			if(orange_landedval[i]>=s)
			{
				if(orange_landedval[i]<=t)
			{
					orangecount++;
				//System.out.println(orange_landedval[i]+" ");
			}
			}
		}
		System.out.println(applecount);
		System.out.println(orangecount);
	}

}
