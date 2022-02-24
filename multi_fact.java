import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Between Two Set Problem*/
public class multi_fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Multiplication array value
		int m=sc.nextInt(); //Factorial array value
		int multarr[]=new int[n]; //Multiplication Array
		int factarr[]=new int[m]; //Factorial Array
		int multarr_store[]=new int[500];
		int factarr_store[]=new int[500];
		for(int i=0;i<n;i++)
		{
			multarr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			factarr[i]=sc.nextInt();
		}
		int k1=0,k2=0;
		int mult_cout=0;
		int clone_fac[]=factarr.clone(); //Here i have cloned a Factorial array
		int clone_mal[]=multarr.clone(); //Here i have Cloned a Multiplication Array
		Arrays.sort(clone_fac); //And I sorted Both Array to get Max Value of Array
		Arrays.sort(clone_mal);
		int max=clone_mal[n-1]; // Maximum of Multiplication Array
		int max2=clone_fac[0]; //Minimum of Factorial Array
		for(int i=max;i<=max2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%multarr[j]==0) //Here i find the common Multiplication of all element in Array
				{
				 mult_cout++;
				}
				else
					continue;
			}
			if(mult_cout==n) //Here i checked In array Every element are Multiple by i th value for each loop iteration
			{
				multarr_store[k1++]=i;
			}
			mult_cout=0;
		}
		mult_cout=0;
		if(multarr_store[0]==0) //Here i check a 1st element of Multiple array is 0 if is 0 then it shows Arithmetic Error 
			multarr_store[0]=1;
		for(int i=multarr_store[0];i<=max2;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(factarr[j]%i==0) //Here i finding a Factor of Each Values in Array
				{
					mult_cout++;
				}
			}
			if(mult_cout==m) //Here i checked In array Every element are Factor by i th value for each loop iteration
			{
				factarr_store[k2++]=i;
			}
			mult_cout=0;
		}
		/*Here Below all process are run a loop in Ascending order  */
   	int fact_len =k1;
    int mul_le=k2;
    int min=0,max11=0,count1=0;
    if(fact_len>mul_le)
    {
    	min=mul_le;
    	max11=fact_len;
    }
    else
    {
    	min=fact_len;
    	max11=mul_le;
    }
    for(int i=0;i<min;i++)
    {
    	for(int j=0;j<max11;j++)
    	{
    		if(k1>k2)
    		{
    		if(factarr_store[i]==multarr_store[j])
    		{
    			count1++;
    		}
    		}
    		if(k2>k1)
    		{
    			if(multarr_store[i]==factarr_store[j])
        		{
        			count1++;
        		}
    		}
    		if(k2==k1)
    		{
    			if(multarr_store[i]==factarr_store[j])
        		{
        			count1++;
        		}
    		}
    		
    	}
    }
    System.out.println(count1);
	}

}
