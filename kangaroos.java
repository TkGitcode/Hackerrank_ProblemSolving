import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class kangaroos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start position of kangaroo 1 x1: ");
		int x1=sc.nextInt();
		System.out.println("Enter a Rate Move of kangaroo 1 v1: ");
		int v1=sc.nextInt();
		System.out.println("Enter a start position of kangaroo 2 x2: ");
		int x2=sc.nextInt();
		System.out.println("Enter a Rate Move of kangaroo 1 v2: ");
		int v2=sc.nextInt();
		int k1=x1,k2=x2,count=0;
		if(x1+v1==x2+v2)
		{
			System.out.println("YES");
		}
		else
		{
			while(k1!=k2)
			{
				k1+=v1;
				k2+=v2;
				if(k1==k2)
				{
					System.out.println("YES");
					break;
				}
				 if(k2<k1)
				{
					System.out.println("NO");
					break;
				}
			}
		}
			//System.out.println("NO");
		

	}

}
