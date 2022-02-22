import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class birthdayproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int m=sc.nextInt();
		int sum=0,m1=m,k=0,flag=0,count=0;
		for(int i=0;i<a.length-m+1;i++)
		{
			for(int j=i;flag<m;j++)
			{
				sum=sum+a[j];
				flag++;
			}
			if(sum==d)
			{
			count++;
			//
			System.out.println(flag);
			}
			flag=0;
			sum=0;
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(a.length>1)
//		{
//			for(int i=0;i<a.length;i++)
//			{
//			    sum=a[i];
//			   for(int j=i+1;j<=m;j++)
//			   {
//			      sum+=a[j];
//			      //System.out.println(sum);
//			   }
//			   System.out.println(sum);
//			    b[k++]=sum;
//			}
//		for(int i=0;i<k;i++)
//		{
//		    if(b[i]==d)
//		    {
//		        flag=1;
//		        count++;
//		        System.out.print(" "+b[i]);
//		    }
//		}
//		//System.out.print(count + "cou");
//		}
//		else
//		{
//		if(a[0]==d)
//		{
//		    System.out.print(1);
//		}
//		else
//		    System.out.print(0+" jdh ");
//		}
//		if(flag==0)
//		{
//		    System.out.print(count + "cou");
//		}
		
		
		
		////Final
		
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<m;j++)
//			{
//				
//			}
//		}
		
		
		
		
		
		
//		for(int i=0;i<n;i++)
//		{
//			k=a[i];
//			for(int j=i+1;j<=m;j++)
//			{
//				 k+=a[j];
//				// System.out.println(j+"k ="+k);
//				 if(k==d)	
//					{
//					// System.out.println("co"+count);
//						count++;
//						k=0;
//						//break;
//					}
//				 else if(k>d)
//				 {
//					// System.out.println("k>d");
//					 k=0;
//					 break;
//				 } 
//				 if(count==m)
//					{
//						System.out.println(count);
//						flag=1;
//						break;
//					}
//			}
//			
//			k=0;
//		}
//		if(flag==0)
//		{
//			//System.out.println(count);
//		}

	}

}
