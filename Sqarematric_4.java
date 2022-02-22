/** 
* @Author -- TkGitcode
*/
public class Sqarematric_4 {

	public static void main(String[] args) {
		/* Input
		  1 2 3
          4 5 6
          9 8 9 */
		// left to right diagonal =1+5+9
		// right to left diagonal =3+5+9
		//15-17
		//Output abs(2)
		
		int a[][]= {{10,3,65,67}
		           ,{8,47,65,8}
		           ,{-74,85,11,7},
		           {-74,85,11,7}};
		boolean b=true;
		int k=0,k1=0,n=0,n1=0;
		for(int i=0;i<a.length;i++)
		{
			if(b)
			{
				n+=a[i][k++];
			}
		}
		k1=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(b)
			{
				n1+=a[i][k1--];
				
			}
		}
		System.out.println(n);
		System.out.println(n1);
		int ab=n-n1;
		ab=Math.abs(ab);
		System.out.println(ab);

	}

}
