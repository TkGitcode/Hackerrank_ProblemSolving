import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class mark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
		int n=sc.nextInt();
        int b[]=new int[n];
        int c[]=new int[n];
        int a1=0,a2=3,k=0;
        for(int i=0;i<n;i++)
        {
        	b[i]=sc.nextInt();
        	if(b[i]>37)
        	{
        	for(int j=0;j<a.length;j++)
        	{
        		if(b[i]<a[j])
            	{
            		System.out.println(a[j]);
            		a1=a[j]-b[i];
            		if(a1<a2)
            		{
            			System.out.println(a[j]);
            			c[k++]=a[j];
            		}
            		else
            		{
            			System.out.println(b[i]);
            			c[k++]=b[i];
            		}
            		    break;
            	}
        	}
        	}
        	else
        	{
        		System.out.println(b[i]);
        	c[k++]=b[i];
        	}
        	
        }
        for(int i=0;i<k;i++)
        {
        	System.out.println(c[i]);
        }
        	
        
	}

}
