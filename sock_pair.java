	import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Sales By Match Problem*/
public class sock_pair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //No of Element
		int arr[]=new int[n];
		int a_arr[]=new int[100];
		int count=0,sum=0,val=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr); //Here i sorted a Array to find duplicate
		int k=0;
		System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-1;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			count++; //Here i have taken a Duplicates in Array of Individual element
        			i++; //To avoid Same Element repeat
        		}
        	}
        	a_arr[k++]=count+1; //count+1 is to add one more element for each individual 
        	count=0;
        }
        for(int i=0;i<k;i++)
    	{	
        	 val=a_arr[i]; 
        	  val=val/2; //Here i got pair of element value using /2
        	  sum=sum+val; //adding into sum
    	}
        System.out.println(sum);// Here is 
	}
	

}
