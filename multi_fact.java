import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class multi_fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter a Multiplication array value");
		int n=sc.nextInt();
	//	System.out.println("Enter a Factorial array value");
		int m=sc.nextInt();
		int multarr[]=new int[n];
		int factarr[]=new int[m];
		int multarr_store[]=new int[500];
		int factarr_store[]=new int[500];
		//int factarr_store1[]=new int[500];
		
		//multarr_store[0]=0;
		//factarr_store[0]=0;
	//	System.out.println("Enter a multiple array value");
		for(int i=0;i<n;i++)
		{
			multarr[i]=sc.nextInt();
		}
	//	System.out.println("Enter a Factorial array ");
		for(int i=0;i<m;i++)
		{
			factarr[i]=sc.nextInt();
		}
		int mult=1,k=0,k1=0,k2=0,count=0,j1=1,k3=0;
		int mult_cout=0,fac_cout=0;
		int clone_fac[]=factarr.clone();
		int clone_mal[]=multarr.clone();
		Arrays.sort(clone_fac);
		Arrays.sort(clone_mal);
		int max=clone_mal[n-1];
		//System.out.print("mal max"+max);
		int max1=clone_fac[m-1];
		int max2=clone_fac[0];
		//System.out.print("fac max"+max1);
		for(int i=max;i<=max2;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%multarr[j]==0)
				{
				//System.out.print("counrr"+mult_cout);
				 mult_cout++;
				}
				else
					continue;
			}
			if(mult_cout==n)
			{
				multarr_store[k1++]=i;
				//System.out.print(i+" ");
			}
			mult_cout=0;
		}
		//System.out.println(multarr_store[0]);
		mult_cout=0;
		if(multarr_store[0]==0)
			multarr_store[0]=1;
		for(int i=multarr_store[0];i<=max2;i++)
		{
			//System.out.print("max "+max2);  //16
			//System.out.print("multarr_store[0] "+multarr_store[0]); 
			for(int j=0;j<m;j++)
			{
				if(factarr[j]%i==0)
				{
					//System.out.println(mult_cout +"co ");
					mult_cout++;
					//break;
				}
			}
			if(mult_cout==m)
			{
				factarr_store[k2++]=i;
				//System.out.print(i+ " ");
			}
			mult_cout=0;
		}
		//System.out.println();
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
    //System.out.println("k2 "+k2);
    //System.out.println("k1 "+k1);
   // System.out.println("max11= "+max11);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	//	System.out.println("Factorial");
//		
//		for(int i=0;i<m;i++)
//		{
//			for(int j=1;j<factarr[i];j++)
//			{
////				if(i>0)
////				{
//					if(factarr[i]%j==0)
//					{
//						factarr_store[k++]=j;
//						System.out.print(j+" ");
////					for(int l=0;l<=k;l++)
////					{
////						System.out.println("Fac=length"+factarr_store.length);
////						System.out.println("l len"+l);
////						if(factarr[j]!=factarr_store[l])
////						{
////							factarr_store[k++]=j;
////						}
////					}
//						//factarr_store[k++]=j;
//					}
//				//}
////				else
////				{
////					if(factarr[i]%j==0)
////						{
////							
////							factarr_store[k++]=j;
//////							System.out.print(j+" ");
////						}
////				}
////			if(factarr[i]%j==0)
////			{
////				
////				factarr_store[k++]=j;
////			//	System.out.print(j+" ");
////			}
//			}
//			//System.out.println();
//		}
//		
//		Arrays.sort(clone_fac);
//		System.out.println("Final Value "+clone_fac[m-1]);
//		int l1=clone_fac[m-1];
//		//Arrays.sort(factarr_store);
//		System.out.println("Multiplication");
//		for(int i=0;i<n;i++)
//		{
//			
//			
//				while(mult<=l1)
//				{
//				//System.out.print("Count : " + j);
//				mult=j1*multarr[i];
//				multarr_store[k1++]=mult;
//				j1++;
//				System.out.print(mult+" ");
//				}
//			j1=1;
//			mult=0;
//			System.out.println();
//		}
//		System.out.println("Fact");
//       Arrays.sort(factarr_store);
//		for(int i=0;i<k;i++)
//		{
//			System.out.print(factarr_store[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Mul");
//		Arrays.sort(multarr);
//        System.out.println("Greader "+multarr[n-1]);
//		for(int i=multarr[n-1];i<k1;i++)
//		{
//			for(int j=i+1;j<k1;j++)
//			{
//				if(multarr_store[i]>multarr_store[j])
//				{
//					int temp=multarr_store[i];
//					multarr_store[i]=multarr_store[j];
//					multarr_store[j]=temp;
//				}
//			}
//		}
//
//		for(int i=0;i<k1;i++)
//		
//		{
//			System.out.print(multarr_store[i]+" ");
//		}
//		System.out.println();
//		System.out.println("Sort");
//		for(int i=0;i<k;i++)
//		{
//			for(int j=i+1;j<k;j++)
//			{
//				if(factarr_store[i]>factarr_store[j])
//				{
//					int temp=factarr_store[i];
//					factarr_store[i]=factarr_store[j];
//					factarr_store[j]=temp;
//				}
//			}
//		}
////		for(int i=0;i<k;i++)
////		{
////			System.out.print(factarr_store[i]+" ");
////		}
//        for(int i=0;i<k-1;i++)
//        {
//        	if(factarr_store[i]!=factarr_store[i+1])
//        	{
//        		factarr_store[k2++]=factarr_store[i];
//        	}
//        }
//        factarr_store[k2++]=factarr_store[k-1];
//      
//        for(int i=0;i<k1-1;i++)
//        {
//        	if(multarr_store[i]!=multarr_store[i+1])
//        	{
//        		multarr_store[k3++]=multarr_store[i];
//        	}
//        }
//        multarr_store[k3++]=multarr_store[k-1];
//        
//       // System.out.println(k2);
////        for(int i=0;i<k2;i++)
////        {
////        	System.out.print(factarr_store[i]+" ");
////        }
//     //   System.out.println();
////        for(int i=0;i<k3;i++)
////        {
////        	System.out.print(multarr_store[i]+" ");
////        }
//      //  System.out.println();
//        
//        for(int i=0;i<k2;i++)
//        {
//        	for(int j=0;j<k1;j++)
//        	{
//        		if(factarr_store[i]==multarr_store[j])
//        		{
//        			count++;
//        			break;
//        		}
//        	}
//        }
//        System.out.println(count);
	}

}
