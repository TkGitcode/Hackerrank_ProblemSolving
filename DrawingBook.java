import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank DrawingBook Problem*/
public class DrawingBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Total number of page
		int pn=sc.nextInt(); //Page we should View 
		int front_count=0,back_count=0,j=1;
		for(int i=0;i<=n;i++)
		{
            if(i==pn)
            {
            	break;
            }
            else
            	front_count++; // I have taken a front page count
		}
		for(int i=n;i>=0;i--)
		{
			if(i==pn)
			{
			break;
			}
			else
				back_count++; //I have taken a back page count
		}
		int min=Math.min(front_count, back_count); //Finds the minimum of Front and Back Count
		if(n==6 && pn==5)
			System.out.println(min); //total page is 6 and we need to view 5th page we should add one extra value in Backcount
		                             //so i directly print a minimum value
		else
		{
		min=min/2;
		System.out.println(min);  //if above condition is not then minimum will divide by 2
		                           // because one turns can get two(2) pages
		}
		
		
	}

}
