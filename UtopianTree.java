import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Utopian Tree Problem*/
public class UtopianTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); /*No of tree*/
		int h=0; /*height*/
		for(int i=0;i<n;i++)
		{
			int tree=sc.nextInt(); /*tree's starting Height*/
			for(int j=0;j<=tree;j++)
			{
				/*here I have finding the Odd and Even because Tree goes through 2 cycles of growth every year*/
				if(j>=2) /*if j value is greater then two the statement will executed because 0 and 1 is neither Odd or Even*/
				{
				  if(j%2==0)
					  h=h+1; /*if value is even the height will updated by 1*/
				  else
					  h=h*2; /*else multiply by one*/
				}
				else
				h=h+1; /*if value neither odd or even then height will update by 1*/
			}
			
			System.out.println(h); /*final height of tree after growth*/
			h=0; /*reseting a height*/
		}
		sc.close();
	}
}