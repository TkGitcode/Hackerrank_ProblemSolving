

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Apple and Orange Problem*/

public class apple_orange {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int s=sc.nextInt(); //start point
		
		int t=sc.nextInt(); //End point
	
		int a=sc.nextInt(); //Apple tree is located
		
		int b=sc.nextInt(); //Orange tree is located
		
		int m=sc.nextInt(); //No of Apple
		
		int n=sc.nextInt(); //No of Orange
	
		int apples[]=new int[m];
		for(int i=0;i<m;i++)
		{
			 apples[i]=sc.nextInt(); //Distance of Apple where Fall 
		}
		
		int orange[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 orange[i]=sc.nextInt(); //Distance of Orange where Fall 
		}
		int apple_landedval[]=new int[m];  
		int orange_landedval[]=new int[n];
         int j=0,applecount=0,orangecount=0;
		for(int i=0;i<m;i++)
		{
			apple_landedval[j++]=a+apples[i]; //apple tree located + Distance of Apple where Fall
		}
		j=0;
		for(int i=0;i<n;i++)
		{
			orange_landedval[j++]=b+orange[i]; //Orange tree located + Distance of Orange where Fall
		}
		for(int i=0;i<m;i++)
		{
			if(apple_landedval[i]>=s)  //s is Sam's House start point
			{
				if(apple_landedval[i]<=t) //t is Sam's House End point
			{
				applecount++;    //How many apples are inside the Sam's house
			}
			}
		}
		//System.out.println();
		for(int i=0;i<n;i++)
		{
			if(orange_landedval[i]>=s) //s is Sam's House start point
			{
				if(orange_landedval[i]<=t) //t is Sam's House End point
			{
					orangecount++; //How many Orange are inside the Sam's house
			}
			}
		}
		System.out.println(applecount); //Total apple Inside Sam's land
		System.out.println(orangecount); //Total Orange Inside Sam's land
	}

}
