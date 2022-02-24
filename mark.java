import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Student Grading Problem*/
public class mark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {30,35,40,45,50,55,60,65,70,75,80,85,90,95,100}; /* we set multiplication of 5 value in array from 30 to 100 
		                                                              because mark can score until 100*/
		int n=sc.nextInt(); //No of Exam
        int b[]=new int[n]; //Exam Array
        int c[]=new int[n];
        int a1=0,a2=3,k=0;
        for(int i=0;i<n;i++)
        {
        	b[i]=sc.nextInt();
        	if(b[i]>37) /*the condition to more than 37 mark because
        	              35 is pass mark and less than 37 we cannot round off*/
        	{
        	for(int j=0;j<a.length;j++) // this loop to find the round of mark
        	{
        		if(b[i]<a[j])
            	{
            		a1=a[j]-b[i];// Here we can get a1 as (Main mark + Round off mark)
            		if(a1<a2) // if a1 is less then 3 we can Round off the mark
            		{
            			c[k++]=a[j];
            		}
            		else // if a1 is >=3 then it cannot be rounded off
            		{
            			c[k++]=b[i];
            		}
            		    break;
            	}
        	}
        	}
        	else // when the mark is less than or equal to 37 it print same mark
        	{
        
        	c[k++]=b[i];
        	}
        	
        }
        for(int i=0;i<k;i++)
        {
        	System.out.println(c[i]); //Mark prints for Every Exam
        }
        	
        
	}

}
