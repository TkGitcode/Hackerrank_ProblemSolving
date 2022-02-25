import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank Designer PDF Viewer Problem*/
public class PDF_viewer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*Here I set a default value for Alphabetic */
		int arr[]= {'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'k','l','m','n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int a[]=new int[26];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); //getting 26 integer as array input 
		}
		String k=sc.next();
		int b[]=new int[k.length()];
		int l=0,max=0;
		for(int i=0;i<k.length();i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(k.charAt(i)==arr[j])  //checking each char from string from alphabetic array
				{
					b[l++]=j;  //and setting a position to another array
					break; //if i get 1st element then i will break a loop
				}
			}
		}
		for(int i=0;i<k.length();i++)
		{
			if(a[b[i]]>max)
			{
				max=a[b[i]]; //Finding a max of all char in string from given array(a)
			}
		}
		System.out.println(max*k.length()); //Multiply with the length of string with maax value

	}

}
