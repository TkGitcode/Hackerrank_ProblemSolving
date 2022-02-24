import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Number Line Jumps Problem*/
public class kangaroos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x1=sc.nextInt(); // start position of kangaroo 1
		int v1=sc.nextInt(); // Rate Move of kangaroo 1
		int x2=sc.nextInt(); //start position of kangaroo 2
		int v2=sc.nextInt(); //Rate Move of kangaroo 2
		int k1=x1,k2=x2,count=0;
		if(x1+v1==x2+v2) //if both kangaroo position and Rate of Move is Equal then it meets same position so 
			             // we print YES
		{
			System.out.println("YES");
		}
		else
		{
			while(k1!=k2) // this condition will execute until both kangaroo meets same place
			{
				k1+=v1; //Increase a Rate of Move and add in k1 and k2
				k2+=v2;
				if(k1==k2)
				{
					System.out.println("YES"); //if meet in same position Then will print YES and it will break a Statement 
					break;
				}
				 if(k2<k1)
				{
					System.out.println("NO"); //if kangaroo 2 moving speed is more than kangaroo 1 then it will can't catch the kangaroo2 
					                          // so we print NO and we break the statement 
					break;
				}
			}
		}
		

	}

}
