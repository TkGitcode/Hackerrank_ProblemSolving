import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class multi_fact_1 {

	
	
	public static int removeDuplicates(int factarr_store[], int n){
		if(n==0 || n==1){
		return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for(int i=0; i<n-1; i++){
		if(factarr_store[i] != factarr_store[i+1]){
		temp[j++] = factarr_store[i];
		}
		}
		temp[j++] = factarr_store[n-1];
		//Changing the original array
		for(int i=0; i<j; i++){
			factarr_store[i] = temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Multiplication array value");
			int n=sc.nextInt();
			System.out.println("Enter a Factorial array value");
			int m=sc.nextInt();
			int multarr[]=new int[n];
			int factarr[]=new int[m];
			int multarr_store[]=new int[500];
			int factarr_store[]=new int[500];
			
			int multarr_store1[]=new int[500];
			int factarr_store2[]=new int[500];
			
			int mul1=0,fac1=0;
			//int factarr_store1[]=new int[500];
			int mult=1,k=0,k1=0,k2=0,count=0,j1=1,k3=0;
			//multarr_store[0]=0;
			//factarr_store[0]=0;
		    System.out.println("Enter a multiple array value");
			for(int i=0;i<n;i++)
			{
				multarr[i]=sc.nextInt();
			}
			
			System.out.println("Enter a Factorial array ");
			for(int i=0;i<m;i++)
			{
				factarr[i]=sc.nextInt();
			}
			int clone_fac[]=factarr.clone();
			int clone_mult[]=multarr.clone();
			Arrays.sort(clone_fac);
			//System.out.println(clone_fac[m-1]);
			//System.out.println(m);
			for(int i=0;i<m;i++)
			{
				for(int j=1;j<=clone_fac[0];j++)
				{
					if(factarr[i]%j==0)
	                 {
						factarr_store[k++]=j;
						//System.out.print(j+" ");
					}
					
					}
				//System.out.println();
				}
			Arrays.sort(factarr_store);
            int len=removeDuplicates(factarr_store,factarr_store.length);
			for(int i=1;i<len;i++)
			{
				if(factarr_store[i]>=clone_mult[n-1])
				{
				factarr_store2[fac1++]=factarr_store[i];
				//System.out.print(factarr_store[i]+" ");
				}
			}
			//System.out.println();
			//System.out.println("Multiplication");
			for(int i=0;i<n;i++)
			{
				
				
					while(mult<=factarr_store[len-1])
					{
					//System.out.print("Count : " + j);
					mult=j1*multarr[i];
					multarr_store[k1++]=mult;
					j1++;
					//System.out.print(mult+" ");
					}
				j1=1;
				mult=0;
				//System.out.println();
			}
			Arrays.sort(multarr_store);
            int len1=removeDuplicates(multarr_store,multarr_store.length);
            //System.out.println("Leng "+ clone_mult[n-1]);
            for(int i=1;i<len1;i++)
			{
            	if(multarr_store[i]>=clone_mult[n-1])
            	{
            	multarr_store1[mul1++]=multarr_store[i];
				//System.out.print(multarr_store[i]+" ");
            	}
			}
            
            for(int i=0;i<mul1;i++)
            {
            	for(int j=0;j<n;j++)
            {
            	if(multarr_store[j]%multarr_store1[i]==0)
            	{
            	System.out.print(multarr_store1[i]+" ");
            	}
            }
            }
            System.out.println();
            for(int i=0;i<fac1;i++)
            {
            	System.out.print(factarr_store2[i]+" ");
            }
            
			}
			

	}

