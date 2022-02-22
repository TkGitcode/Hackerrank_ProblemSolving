import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class sock_pair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int a_arr[]=new int[100];
		int count=0,pair=2,sum=0,round=0,val=0;
		float f;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int k=0;
		System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-1;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			count++;
        			i++;
        		}
        	}
        	a_arr[k++]=count+1;
        	System.out.println(count+1);
        	count=0;
        }
        for(int i=0;i<k;i++)
    	{	
        	 val=a_arr[i];
        	  val=val/2;
        	  sum=sum+val;
    	}
        //round=round/2;
        System.out.println(sum);
	}
	

}
